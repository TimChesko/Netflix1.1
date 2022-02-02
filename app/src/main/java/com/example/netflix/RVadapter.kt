package com.example.netflix

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(val filmList: ArrayList<Film_info>) : RecyclerView.Adapter<RvAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.movie_main, p0, false)
        return ViewHolder(v);
    }
    override fun getItemCount(): Int {
        return filmList.size
    }
    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

        p0.name?.text = filmList[p1].name
        p0.count?.text = filmList[p1].rate.toString()
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.item_title)
        val count = itemView.findViewById<TextView>(R.id.item_rating)
    }
}