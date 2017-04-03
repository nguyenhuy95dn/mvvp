package com.framgia.fdms.data.source.remote.api.error;

import android.support.annotation.Nullable;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import retrofit2.Response;

/**
 * Created by le.quang.dao on 10/03/2017.
 */

public final class BaseException extends RuntimeException {

    @Type
    private final String type;
    @Nullable
    private Response response;

    private BaseException(@Type String type, Throwable cause) {
        super(cause.getMessage(), cause);
        this.type = type;
    }

    private BaseException(@Type String type, @Nullable Response response) {
        this.type = type;
        this.response = response;
    }

    public static BaseException toNetworkError(Throwable cause) {
        return new BaseException(Type.NETWORK, cause);
    }

    public static BaseException toHttpError(Response response) {
        return new BaseException(Type.HTTP, response);
    }

    public static BaseException toUnexpectedError(Throwable cause) {
        return new BaseException(Type.UNEXPECTED, cause);
    }

    @Type
    public String getErrorType() {
        return type;
    }

    public String getMessage() {
        switch (type) {
            case Type.SERVER:
                // TODO define with server about ErrorResponse
                //                if (errorResponse != null) return errorResponse.getErrorMessage();
                return "";
            case Type.NETWORK:
                return getNetworkErrorMessage(getCause());
            case Type.HTTP:
                if (response != null) {
                    return getHttpErrorMessage(response.code());
                }
                return "Error";
            default:
                return "Error";
        }
    }

    private String getNetworkErrorMessage(Throwable throwable) {
        if (throwable instanceof SocketTimeoutException) {
            return throwable.getMessage();
        }

        if (throwable instanceof UnknownHostException) {
            return throwable.getMessage();
        }

        if (throwable instanceof IOException) {
            return throwable.getMessage();
        }

        return throwable.getMessage();
    }

    private String getHttpErrorMessage(int httpCode) {
        if (httpCode >= 300 && httpCode <= 308) {
            // Redirection
            return "It was transferred to a different URL. I'm sorry for causing you trouble";
        }
        if (httpCode >= 400 && httpCode <= 451) {
            // Client error
            return "An error occurred on the application side. Please try again later!";
        }
        if (httpCode >= 500 && httpCode <= 511) {
            // Server error
            return "A server error occurred. Please try again later!";
        }

        // Unofficial error
        return "An error occurred. Please try again later!";
    }
}
