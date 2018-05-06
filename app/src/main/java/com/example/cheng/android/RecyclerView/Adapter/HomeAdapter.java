package com.example.cheng.android.RecyclerView.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cheng.android.R;

import java.util.List;

/**
 * Created by cheng on 2018/5/6.
 */

public class HomeAdapter extends  RecyclerView.Adapter<HomeAdapter.MyViewHolder>  {
 private List<String> mList;
 private Context mcontext;

    public HomeAdapter(List<String> mList, Context mcontext) {
        this.mList = mList;
        this.mcontext = mcontext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(mcontext).inflate(R.layout.item_recycler, parent, false));

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mtv.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public  void  RemoveData(int position){
        mList.remove(position);
        notifyItemChanged(position);
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
    private TextView mtv;
        public MyViewHolder(View itemView) {
            super(itemView);
            mtv=itemView.findViewById(R.id.tv_item);
        }
    }
}
