package com.expandrecycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * date：2018/5/18 on 14:15
 * description:
 */

class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context ctx;
    private ArrayList<DataBean> mDataList;
    public MyAdapter(Context ctx, ArrayList<DataBean> list){
        this.ctx = ctx;
        this.mDataList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = View.inflate(ctx, R.layout.item_list, null);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(mDataList.get(position).des);
    }


    @Override
    public int getItemCount() {
        return mDataList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_text);
        }
    }
}