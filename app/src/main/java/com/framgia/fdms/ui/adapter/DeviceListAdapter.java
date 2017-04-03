package com.framgia.fdms.ui.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.framgia.fdms.R;
import com.framgia.fdms.data.model.Device;
import com.framgia.fdms.databinding.ItemDataBinding;

import java.util.List;

public class DeviceListAdapter extends RecyclerView.Adapter<DeviceListAdapter.ViewHolder> {
    private List<Device> mList;

    public DeviceListAdapter(List<Device> list) {
        mList = list;
    }

    public void updateData(List<Device> list) {
        mList.clear();
        if (list != null) mList.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemDataBinding mDataBinding = DataBindingUtil
            .inflate(LayoutInflater.from(parent.getContext()), R.layout.item_main, parent, false);
        return new ViewHolder(mDataBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Device device = mList.get(position);
        holder.bindData(device);
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemDataBinding mBinding;

        public ViewHolder(ItemDataBinding dataBinding) {
            super(dataBinding.getRoot());
            mBinding = dataBinding;
        }

        public void bindData(Device device) {
            if (device == null) return;
            mBinding.setItem(device);
            mBinding.executePendingBindings();
        }
    }
}
