package com.framgia.fdms.screen.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.framgia.fdms.R;
import com.framgia.fdms.data.model.Device;
import com.framgia.fdms.data.source.DeviceRepository;
import com.framgia.fdms.data.source.remote.DeviceRemoteDataSource;
import com.framgia.fdms.data.source.remote.api.service.NameServiceClient;
import com.framgia.fdms.databinding.ActivityMainBinding;
import com.framgia.fdms.ui.adapter.DeviceListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Main Screen.
 */
public class MainActivity extends AppCompatActivity {
    private MainContract.ViewModel mViewModel;
    private List<Device> mList = new ArrayList<>();
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new MainViewModel();
        MainContract.Presenter presenter =
            new MainPresenter(mViewModel,
                new DeviceRepository(new DeviceRemoteDataSource(NameServiceClient.getInstance())));
        mViewModel.setPresenter(presenter);
        ActivityMainBinding binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel((MainViewModel) mViewModel);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mViewModel.onStart();
    }

    @Override
    protected void onStop() {
        mViewModel.onStop();
        super.onStop();
    }
}
