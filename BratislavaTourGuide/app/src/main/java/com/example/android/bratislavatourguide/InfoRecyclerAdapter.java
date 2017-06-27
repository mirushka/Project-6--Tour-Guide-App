package com.example.android.bratislavatourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import static android.R.attr.description;

/**
 * Created by Mirka on 18/05/2017.
 */

public class InfoRecyclerAdapter extends
        RecyclerView.Adapter<InfoRecyclerAdapter.ViewHolder> {

    List<Info> mInfo;
    private int mColorResourceId;
    Context mContext;


    public InfoRecyclerAdapter(Context context, List<Info> infos, int colorResourceId) {
        this.mContext = context;
        this.mInfo = infos;
        this.mColorResourceId = colorResourceId;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        protected TextView titleTextView;
        protected TextView addressTextView;
        protected ImageView imageView;
        protected View textContainer;
        protected TextView url;

        public ViewHolder(View itemView) {
            super(itemView);
            titleTextView = (TextView) itemView.findViewById(R.id.titleTextView);
            addressTextView = (TextView) itemView.findViewById(R.id.addressTextView);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            textContainer = (View) itemView.findViewById(R.id.text_container);
                }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        ViewHolder vh = new ViewHolder(listItem);
        return vh;
    }

    @Override
    public void onBindViewHolder(InfoRecyclerAdapter.ViewHolder holder, int position) {
        Info currentInfo = mInfo.get(position);
        holder.titleTextView.setText(currentInfo.getName());
        holder.addressTextView.setText(currentInfo.getDescription());
        holder.imageView.setImageResource(currentInfo.getImageId());
        holder.textContainer.setBackgroundColor(ContextCompat.getColor(mContext, mColorResourceId));
        }

    @Override
    public int getItemCount () {
        return mInfo.size();
    }
}


