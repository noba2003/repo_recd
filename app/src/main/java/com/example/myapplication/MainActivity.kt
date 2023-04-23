package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.recv.adapter
import com.example.myapplication.recv.dp
import com.example.myapplication.recv.person

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dp.dps.add(person("ahmed","ali"))
        dp.dps1.add(person("ahmed","ali"))
        dp.dps1.add(person("mohamed","amer"))
        dp.dps1.add(person("omer","omer"))
        dp.dps1.add(person("saif","saif"))
        dp.dps.add(person("ahmed","ali"))
        dp.dps.add(person("ahmed","ali"))
        dp.dps.add(person("ahmed","ali"))
        dp.dps.add(person("ahmed","ali"))
        dp.dps.add(person("ahmed","ali"))
        dp.dps.add(person("ahmed","ali"))
        dp.dps.add(person("ahmed","ali"))
        dp.dps.add(person("ahmed","ali"))
        dp.dps.add(person("ahmed","ali"))
        dp.dps.add(person("ahmed","ali"))
        dp.dps.add(person("ahmed","ali"))
        dp.dps.add(person("ahmed","ali"))
        dp.dps.add(person("ahmed","ali"))
        dp.dps.add(person("ahmed","ali"))

        var ress=findViewById<RecyclerView>(R.id.recs)
        ress.adapter=adapter(dp.dps,dp.dps1)
    }
}