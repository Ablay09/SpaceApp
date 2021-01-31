package com.example.spaceapp.presentation.UpcomingLaunch.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spaceapp.R
import com.example.spaceapp.core.load
import com.example.spaceapp.databinding.ItemUpcomingLaunchBinding
import com.example.spaceapp.domain.entities.UpcomingLaunch.LaunchResult

class UpcomingLaunchAdapter :
    RecyclerView.Adapter<UpcomingLaunchAdapter.LaunchViewHolder>() {

    private var items =  mutableListOf<LaunchResult>()

    fun setItems(items: List<LaunchResult>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    inner class LaunchViewHolder constructor(private val viewBinding: ItemUpcomingLaunchBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        lateinit var item: LaunchResult

        fun bind() = with(viewBinding) {
            tvRocketName.text = item.rocket.rocketConfiguration.fullName
            tvRocketServiceProvider.text = item.launchServiceProvider.name
            tvRocketLocation.text = item.pad.location.name
            ivRocket.load(item.image, R.drawable.rocket_placeholder)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaunchViewHolder {
        val viewBinding = ItemUpcomingLaunchBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return LaunchViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: LaunchViewHolder, position: Int) {
        holder.item = items[position]
        holder.bind()
    }

    override fun getItemCount(): Int = items.size

}