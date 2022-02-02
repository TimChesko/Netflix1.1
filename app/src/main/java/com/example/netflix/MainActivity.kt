package com.example.netflix

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)

        val recyclerView = findViewById<RecyclerView>(R.id.RVadapter_home)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val dataList = ArrayList<Film_info>()
        dataList.add(Film_info("Мрачные тени", "Вампир дворянин", 7, 2012, "HD"))
        val rvAdapter = RvAdapter(dataList)
        recyclerView.adapter = rvAdapter;
    }
}