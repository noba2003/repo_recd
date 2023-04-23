package com.example.myapplication.recv

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R


class adapter(val d: MutableList<person>, val d1: MutableList<person>) :
    RecyclerView.Adapter<adapter.myvh>() {


    class myvh(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myvh {
        var inflate=

       if (d1.size != 0)
            LayoutInflater.from(parent.context).inflate(R.layout.card2, parent, false)

        else{
            LayoutInflater.from(parent.context).inflate(R.layout.mycard, parent, false)
        }


        return myvh(inflate)

    }

    override fun getItemCount(): Int {
        return dp.dps.size
    }

    override fun onBindViewHolder(holder: myvh, position: Int) {


        if (holder.itemView.findViewById<TextView>(R.id.tv1) != null || holder.itemView.findViewById<TextView>(
                R.id.tv2
            ) != null
        ) {
            val tv1 = holder.itemView.findViewById<TextView>(R.id.tv1)
            val tv2 = holder.itemView.findViewById<TextView>(R.id.tv2)
            tv1.text = d1.get(0).t
            tv2.text = d1.size.toString()
            if (d1.size !=0){
                d1.removeAt(0)
            }
        }


        else{
            val tv3 = holder.itemView.findViewById<TextView>(R.id.tv3)
            val tv4 = holder.itemView.findViewById<TextView>(R.id.tv4)
            tv3.text = d.get(position).t
            tv4.text = d.get(position).t2

        }

    }
}