package com.example.hm6

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.hm6.databinding.ItemfirstBinding

class MusicAdapter (private var onClickItem : (String) -> Unit): RecyclerView.Adapter<MusicAdapter.MusicViewHolder>(){
    var data = ArrayList<Music>()
    inner class MusicViewHolder(private var binding: ItemfirstBinding) : RecyclerView.ViewHolder(binding.root){
        fun bint(position: Music) {
            binding.number.text = position.data
            binding.text.text = position.avto
            binding.singer.text = position.music
            binding.time.text = position.time
            itemView.setOnClickListener {
                position.music?.let { it1 -> onClickItem(it1) }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(ItemfirstBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bint(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}