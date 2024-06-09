package com.example.sportsapp

import android.content.Context
import android.icu.text.CaseMap.Title
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyCustomAdapter (context: Context, val itemlist:ArrayList<Modelclass>):
    RecyclerView.Adapter<MyCustomAdapter.MyViewHolder>() {


    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        // Here view is reference to each item in recycler view.
        //Viewholder holds the reference to the views within each item in the recycler view .
        var image:ImageView
        var title: TextView
        init {
            image= itemView.findViewById(R.id.image)
            title=itemView.findViewById(R.id.textView)
            itemView.setOnClickListener(){it
                Toast.makeText(itemView.context ,"You clicked ${itemlist[adapterPosition].title} " ,Toast.LENGTH_LONG).show()

            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    // This function is used to create a new viewholder instance for each item .
       //Here the parent view group to which the new view will be added.
       // Here the viewtype allows the recycler view to have multiple item types
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.crad_item ,parent,false)
        // Layout inflator is responsible for instantiating the layout XML file in to its corresponding view .
        // here from method is used to create a layoutinflator instance associated with the context of the parent.
        // parent is typically to which the inflated view will be attached here the parent is recyclerview
        //attatchroot false indicate that the inflated view should not be attatched to parent view immediately.
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        //returns the total number of items in the dataset
       return  itemlist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //Bind data to views based on the item at the specified position.
        holder .image.setImageResource(itemlist[position].image)
        holder.title.setText(itemlist[position].title)
    }
}