package com.example.cheng.android.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cheng.android.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by cheng on 2018/4/26.
 */

public class FriendListApadter extends RecyclerView.Adapter<FriendListApadter.Viewholder> {
    private Context context;
    private ArrayList<String> mUserNames;

    public FriendListApadter(Context context, ArrayList<String> mUserNames) {
        this.context = context;
        this.mUserNames = mUserNames;
    }

    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
      View view=  LayoutInflater.from(context).inflate(R.layout.item_friendlist,null);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
        holder.username.setText(mUserNames.get(position));
    }

    @Override
    public int getItemCount() {
        return mUserNames.size();
    }


    class Viewholder extends RecyclerView.ViewHolder {

        @BindView(R.id.username)
        TextView username;
        @BindView(R.id.Btn_callPhone)
        TextView BtnCallPhone;

        public Viewholder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
