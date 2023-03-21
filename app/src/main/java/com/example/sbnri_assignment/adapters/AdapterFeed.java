package com.example.sbnri_assignment.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.example.sbnri_assignment.ModelFeed;
import com.example.sbnri_assignment.R;

import java.util.ArrayList;

public class AdapterFeed extends RecyclerView.Adapter<AdapterFeed.MyViewHolder> {

    private Context context;
    private ArrayList<ModelFeed> modelFeedArrayList;
    private RequestManager glide;

    public AdapterFeed(Context context, ArrayList<ModelFeed> modelFeedArrayList) {
        this.context = context;
        this.modelFeedArrayList = modelFeedArrayList;
        glide = Glide.with(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_feed, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ModelFeed modelFeed = modelFeedArrayList.get(position);
        holder.tv_name.setText(modelFeed.getName());
        holder.tv_time.setText(modelFeed.getTime());
        holder.tv_likes.setText(String.valueOf(modelFeed.getLikes()));
        holder.tv_comments.setText(modelFeed.getComments() + " comments");
        holder.tv_status.setText(modelFeed.getStatus());
        glide.load(modelFeed.getPropic()).into(holder.imgView_proPic);
        if (modelFeed.getPostpic() == 0) {
            holder.imgView_postPic.setVisibility(View.GONE);
        } else {
            holder.imgView_postPic.setVisibility(View.VISIBLE);
            glide.load(modelFeed.getPostpic()).into(holder.imgView_postPic);
        }
    }

    @Override
    public int getItemCount() {
        return modelFeedArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name;
        private TextView tv_time;
        private TextView tv_likes;
        private TextView tv_comments;
        private TextView tv_status;
        private ImageView imgView_proPic;
        private ImageView imgView_postPic;

        public MyViewHolder(View itemView) {
            super(itemView);
            imgView_proPic = itemView.findViewById(R.id.imgView_proPic);
            imgView_postPic = itemView.findViewById(R.id.imgView_postPic);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_time = itemView.findViewById(R.id.tv_time);
            tv_likes = itemView.findViewById(R.id.tv_like);
            tv_comments = itemView.findViewById(R.id.tv_comment);
            tv_status = itemView.findViewById(R.id.tv_status);
        }
    }
}