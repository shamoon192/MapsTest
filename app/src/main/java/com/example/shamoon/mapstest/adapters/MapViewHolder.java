package com.example.shamoon.mapstest.adapters;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.shamoon.mapstest.views.custom.MapViewListItemView;

/**
 * Created by shamoon on 13/02/17.
 */

public class MapViewHolder extends RecyclerView.ViewHolder {
    private MapViewListItemView mMapViewListItemView;

    public MapViewHolder(MapViewListItemView mapViewListItemView) {
        super(mapViewListItemView);
        mMapViewListItemView = mapViewListItemView;
    }

    public void mapViewListItemViewOnCreate(Bundle savedInstanceState) {
        if (mMapViewListItemView != null) {
            mMapViewListItemView.mapViewOnCreate(savedInstanceState);
        }
    }

    public void mapViewListItemViewOnResume() {
        if (mMapViewListItemView != null) {
            mMapViewListItemView.mapViewOnResume();
        }
    }

    public void mapViewListItemViewOnPause() {
        if (mMapViewListItemView != null) {
            mMapViewListItemView.mapViewOnPause();
        }
    }

    public void mapViewListItemViewOnDestroy() {
        if (mMapViewListItemView != null) {
            mMapViewListItemView.mapViewOnDestroy();
        }
    }

    public void mapViewListItemViewOnLowMemory() {
        if (mMapViewListItemView != null) {
            mMapViewListItemView.mapViewOnLowMemory();
        }
    }

    public void mapViewListItemViewOnSaveInstanceState(Bundle outState) {
        if (mMapViewListItemView != null) {
            mMapViewListItemView.mapViewOnSaveInstanceState(outState);
        }
    }
}
