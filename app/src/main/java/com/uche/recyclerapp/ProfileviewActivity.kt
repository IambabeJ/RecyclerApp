package com.uche.recyclerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uche.recyclerapp.databinding.ActivityProfileviewBinding

class ProfileviewActivity : AppCompatActivity() {
    lateinit var binding: ActivityProfileviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            imageView.setImageResource(intent.getStringExtra("profileImage")!!.toInt())
            textView.text = intent.getStringExtra("firstname")
            textView2.text = intent.getStringExtra("secondname")
        }
    }
}