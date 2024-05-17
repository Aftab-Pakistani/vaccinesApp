package com.example.vaccinesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // AdapterView : RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        //data source : List of vaccineModel objects
        var vaccineList: ArrayList<VaccineModel> = ArrayList()
        val v1 = VaccineModel("covid-19", R.drawable.v1)
        val v2 = VaccineModel("covid-18", R.drawable.v1)
        val v3 = VaccineModel("covid-17", R.drawable.v1)
        val v4 = VaccineModel("covid-16", R.drawable.v1)
        val v5 = VaccineModel("covid-15", R.drawable.v1)
        val v6 = VaccineModel("covid-14", R.drawable.v1)
        val v7 = VaccineModel("covid-13", R.drawable.v1)

        vaccineList.add(v1)
        vaccineList.add(v2)
        vaccineList.add(v3)
        vaccineList.add(v4)
        vaccineList.add(v5)
        vaccineList.add(v6)
        vaccineList.add(v7)

        //Adapter
        val adapter = MyAdapter(vaccineList)
        recyclerView.adapter =adapter
    }
}