package com.example.d_stage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.d_stage.models.pic
import kotlinx.android.synthetic.main.layout_recyclinview.view.*

class PicRecyclerAdpater : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<pic> = ArrayList();

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return picViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_recyclinview, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {

            is picViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(picList: List<pic>) {
        items = picList
    }

    class picViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val pic_image = itemView.pic_image;// ID that we refring to inside the layout file

        fun bind(pic : pic){
            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(pic.image)
                .into(pic_image);
        }
        }
}

