package com.example.spaceapp.presentation.UpcomingLaunch.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spaceapp.R
import com.example.spaceapp.core.inflate
import com.example.spaceapp.domain.entities.UpcomingLaunch.UpcomingLaunch

class UpcomingLaunchAdapter constructor(private val items: List<UpcomingLaunch>) :
    RecyclerView.Adapter<UpcomingLaunchAdapter.LaunchViewHolder>() {

    inner class LaunchViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() = with(itemView) {
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaunchViewHolder {
        return LaunchViewHolder(parent.inflate(R.layout.item_upcoming_launch))
    }

    override fun onBindViewHolder(holder: LaunchViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = items.size

}