package com.example.myfifthweek.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myfifthweek.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public  class UserMessageAdapter extends RecyclerView.Adapter<UserMessageAdapter.ViewHolder> {
    private final Context context;
    private final List<UserInfo> data;
    private final onListItemClickListener listItemClickListener;

    public UserMessageAdapter(Context context, List<UserInfo> data, onListItemClickListener listItemClickListener) {
        this.context = context;
        this.data = data;
        this.listItemClickListener = listItemClickListener;
    }

    @NonNull
    @Override
    public UserMessageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(context).inflate(R.layout.first_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserMessageAdapter.ViewHolder holder, int position) {
        UserInfo userInfo= data.get(position);
        holder.tv_userName.setText(userInfo.getUserName());
        holder.tv_userMessage.setText(userInfo.getUserMessage());
        holder.item_layout.setOnClickListener(view -> {
            listItemClickListener.onItemClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public interface onListItemClickListener{
        void onItemClick(int position);
        }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_userName;
        TextView tv_userMessage;
        ImageView iv_user;
        ConstraintLayout item_layout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_userName=itemView.findViewById(R.id.tv_name);
            tv_userMessage=itemView.findViewById(R.id.tv_userMessage);
            iv_user=itemView.findViewById(R.id.iv_user);
            item_layout=itemView.findViewById(R.id.first_item_layout);



        }
    }
}


