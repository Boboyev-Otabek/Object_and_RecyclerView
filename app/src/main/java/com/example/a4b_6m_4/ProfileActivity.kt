package com.example.a4b_6m_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.a4b_6m_4.model.Member

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        initViews()
    }

    fun initViews() {
        var text = findViewById<TextView>(R.id.text)
        var member=intent.getSerializableExtra("full")
        text.text=member.toString()

    }
}