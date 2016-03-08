package com.example.xyzreader.ui;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Suleiman on 26-07-2015.
 */
public class SpacesItemDecoration extends RecyclerView.ItemDecoration {
    private final int mSpace;
    private final int mFirstPosition;

    public SpacesItemDecoration(int space, int mFirstPosition) {
        this.mSpace = space;
        this.mFirstPosition = mFirstPosition;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = mSpace;
        outRect.right = mSpace;
        outRect.bottom = mSpace;

        // Add top margin only for the first item to avoid double space between items
        if (parent.getChildAdapterPosition(view) < mFirstPosition){
            outRect.top = mSpace;
        }
    }
}