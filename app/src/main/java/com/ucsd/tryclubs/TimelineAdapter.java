package com.ucsd.tryclubs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class TimelineAdapter extends RecyclerView.Adapter<TimelineAdapter.ViewHolder> {

    private List<Post> posts;
    private Context context;

    public TimelineAdapter(List<Post> posts, Context context) {
        this.posts = posts;
        this.context = context;
    }


    /*--------------------------------------~~~~~~~~~~~~~~~~-----------------------------------------*/
    /* This method is called whenever a new viewHolder is created.
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.post, viewGroup, false);
        return new ViewHolder(v);
    }


    /*--------------------------------------~~~~~~~~~~~~~~~~~----------------------------------------*/



    /*--------------------------------------~~~~~~~~~~~~~~~~~-----------------------------------------*/
    /*This method binds the data to the viewHolder*/
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Post post = posts.get(position);
        /* not sure how to set an image yet, only know how to set textviews
        viewHolder.imageViewProfilePic
        */
        viewHolder.textViewNameOfEvent.setText(post.geteName());
        viewHolder.textViewHosts.setText(post.getHosts());
        viewHolder.textViewLocation.setText(post.getLocation());
        viewHolder.textViewDate.setText(post.getDate());
        viewHolder.textViewTime.setText(post.getTime());
        viewHolder.textViewDescription.setText(post.getDescription());
    }

    /*--------------------------------------~~~~~~~~~~~~~~~~~------------------------------------------*/


    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageViewProfilePic;
        public TextView textViewNameOfEvent;
        public TextView textViewHosts;
        public TextView textViewDate;
        public TextView textViewLocation;
        public TextView textViewTime;
        public TextView textViewDescription;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewProfilePic = (ImageView) itemView.findViewById(R.id.profilePictureForPost);
            textViewNameOfEvent = (TextView) itemView.findViewById(R.id.eName);
            textViewHosts = (TextView) itemView.findViewById(R.id.hosts);
            textViewDate = (TextView) itemView.findViewById(R.id.date);
            textViewLocation = (TextView) itemView.findViewById(R.id.location);
            textViewTime = (TextView) itemView.findViewById(R.id.time);
            textViewDescription = (TextView) itemView.findViewById(R.id.description);

        }
    }

}
