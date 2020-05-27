package com.example.d_stage

import android.graphics.Rect
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import androidx.recyclerview.widget.RecyclerView


class TopSpacingItemDecoration(private val padding: Int) : RecyclerView.ItemDecoration(),
    Parcelable {

    constructor(parcel: Parcel) : this(parcel.readInt()) {
    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.top = padding
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(padding)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TopSpacingItemDecoration> {
        override fun createFromParcel(parcel: Parcel): TopSpacingItemDecoration {
            return TopSpacingItemDecoration(parcel)
        }

        override fun newArray(size: Int): Array<TopSpacingItemDecoration?> {
            return arrayOfNulls(size)
        }
    }
}