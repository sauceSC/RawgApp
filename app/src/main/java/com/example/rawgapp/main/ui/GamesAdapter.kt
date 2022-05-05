package com.example.rawgapp.main.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rawgapp.R
import com.example.rawgapp.main.api.model.ResultResponse
import com.example.rawgapp.databinding.ItemGamesBinding
import com.example.rawgapp.main.model.Results
import timber.log.Timber

class GamesAdapter : RecyclerView.Adapter<GamesAdapter.MyViewHolder>(){
    private val data = mutableListOf<Results>()

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val gameName: TextView = itemView.findViewById(R.id.text)
        private val gameImage: ImageView = itemView.findViewById(R.id.game_image)
        fun bind(results: Results){
            gameName.text = results.name
            Glide.with(itemView.context).load(results.backgroundImage).into(gameImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_games, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val listItem = data[position]
        holder.bind(listItem)
    }

    override fun getItemCount() = data.size

    fun setData(list: List<Results>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }
}
