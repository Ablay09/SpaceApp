package com.example.spaceapp.presentation.UpcomingLaunch.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spaceapp.R
import com.example.spaceapp.domain.entities.UpcomingLaunch.LaunchResult

class UpcomingLaunchAdapter(private val items: List<LaunchResult>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    object HolderTypes {
        const val ITEM = 1
    }

    override fun getItemViewType(position: Int): Int {
        return HolderTypes.ITEM
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            HolderTypes.ITEM ->{
                ItemViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_upcoming_launch, parent, false)
                )
            }
            else -> throw IllegalArgumentException("Illegal view holder")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val upcomingLaunch = items[position]
        when (holder) {
            is ItemViewHolder -> bindItemViewHolder(holder, position)
            else -> {}
        }
    }

    private fun bindItemViewHolder(holder: ItemViewHolder, position: Int) {
    }

    override fun getItemCount(): Int = items.size


    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}