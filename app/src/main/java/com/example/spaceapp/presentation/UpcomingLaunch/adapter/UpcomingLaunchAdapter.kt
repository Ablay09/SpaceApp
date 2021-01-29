package com.example.spaceapp.presentation.UpcomingLaunch.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spaceapp.databinding.ItemUpcomingLaunchBinding
import com.example.spaceapp.domain.entities.UpcomingLaunch.UpcomingLaunch

class UpcomingLaunchAdapter constructor(private val items: List<UpcomingLaunch>) :
    RecyclerView.Adapter<UpcomingLaunchAdapter.LaunchViewHolder>() {

    inner class LaunchViewHolder constructor(private val viewBinding: ItemUpcomingLaunchBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bind() = with(itemView) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaunchViewHolder {
        val viewBinding = ItemUpcomingLaunchBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return LaunchViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: LaunchViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = items.size

}