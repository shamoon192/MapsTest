package com.example.shamoon.mapstest.adapters;

import android.app.Activity;
import android.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shamoon.mapstest.MapsActivity;
import com.example.shamoon.mapstest.R;
import com.example.shamoon.mapstest.views.custom.MapViewListItemView;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * Created by shamoon on 13/02/17.
 */

public class MapsLIstAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static Activity activity;

    public MapsLIstAdapter(Activity activity) {
        this.activity = activity;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MapViewListItemView mapViewListItemView = new MapViewListItemView(activity);
        mapViewListItemView.mapViewOnCreate(null);
        //mMapViewListItemViews.add(mapViewListItemView);
        return new MapViewHolder(mapViewListItemView);

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //holder.mTextView.setText(mDataset[position]);
        MapViewHolder mapViewHolder = (MapViewHolder) holder;
        mapViewHolder.mapViewListItemViewOnResume();
    }

    @Override
    public int getItemCount() {
        return 10;
    }

}
