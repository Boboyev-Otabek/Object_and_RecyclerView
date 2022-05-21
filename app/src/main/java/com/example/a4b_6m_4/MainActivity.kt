package com.example.a4b_6m_4

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a4b_6m_4.adapter.AdapterMember
import com.example.a4b_6m_4.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var recyclerview: RecyclerView
    lateinit var context: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        context=this
        recyclerview = findViewById(R.id.recyclerview)
        recyclerview.layoutManager = GridLayoutManager(context, 3)
        recyclerview.isNestedScrollingEnabled = false


        var member: List<Member> = MemberAdd()
        refreshAdapter(member)
    }

    fun refreshAdapter(member: List<Member>) {

        var adapter = AdapterMember(member,this)
        recyclerview.adapter = adapter
    }

    public fun open_profilr(member: Member) {

        var intent = Intent(this, ProfileActivity::class.java)
        intent.putExtra("full",member.toString())
        startActivity(intent)
    }

    fun MemberAdd(): List<Member> {

        var member = ArrayList<Member>()

        for (i in 0..20 step 1) {
            member.add(Member("Otabek " + i, "Boboyev " + i))
        }
        return member
    }
}