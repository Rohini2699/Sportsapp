package com.example.sportsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // recycler view
        val recyclerView:RecyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL ,false)

        //data source
        var sportslist = ArrayList<Modelclass>()
        val v1 = Modelclass(R.drawable.basketball ,"Basketball")
        val v2 = Modelclass(R.drawable.football,"Football")
        val v3 = Modelclass(R.drawable.tennis,"Tennis")
        val v4 = Modelclass(R.drawable.volleyball,"Volleyball")
        sportslist.add(v1)
        sportslist.add(v2)
        sportslist.add(v3)
        sportslist.add(v4)
        val adapter = MyCustomAdapter(this ,sportslist)
        recyclerView.adapter= adapter

    }
}