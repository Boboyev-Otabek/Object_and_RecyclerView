package com.example.a4b_6m_4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a4b_6m_4.MainActivity
import com.example.a4b_6m_4.R
import com.example.a4b_6m_4.model.Member

class AdapterMember(var member: List<Member>, var mainActivity: MainActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {




    override fun getItemCount(): Int {
        return member.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_item, parent, false)
        return Memberholder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var member = member.get(position)
        if (holder is Memberholder) {

            holder.linear_layout.setOnClickListener{
                mainActivity.open_profilr(member)
            }
            holder.ism.setText(member.ism)
            holder.familiya.setText(member.familiya)
        }
    }

    class Memberholder(itemview: View) : RecyclerView.ViewHolder(itemview) {
       var linear_layout:LinearLayout=itemview.findViewById(R.id.linear_layout)
        var ism = itemview.findViewById<TextView>(R.id.ism)
        var familiya = itemview.findViewById<TextView>(R.id.familiya)
    }
}