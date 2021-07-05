package com.uche.recyclerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uche.recyclerapp.databinding.ActivityMainBinding
import com.uche.recyclerapp.models.User

class MainActivity : AppCompatActivity(), RecyclerAdapter.OnUserClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myRecyclerAdapter: RecyclerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val users: List<User> = listOf(
            User(
                R.drawable.ic_img1,
                "Uche",
                "Echemunor",
            ),
            User(
                R.drawable.ic_img8,
                "Emeka",
                "Alex",
            ),
            User(
                R.drawable.ic_img10,
                "Williams",
                "John",
            ),
            User(
                R.drawable.ic_img4,
                "Paul",
                "Chucks",
            ),
            User(
                R.drawable.ic_img1,
                "oluchi",
                "chukwu",
            ),
            User(
                R.drawable.ic_img7,
                "Judith",
                "Alonso",
            ),
            User(
                R.drawable.ic_img8,
                "Jennifer",
                "Echemunor",
            ),
            User(
                R.drawable.ic_img1,
                "Ijeoma",
                "Echemunor",
            ),
            User(
                R.drawable.ic_img10,
                "Samuel",
                "Alexander",
            ),
            User(
                R.drawable.ic_img1,
                "Sofia",
                "Chukwu",
            ),
            User(
                R.drawable.ic_img7,
                "Uche",
                "Echemunor",
            ),
            User(
                R.drawable.ic_img8,
                "Uc",
                "munor",
            ),
            User(
                R.drawable.ic_img10,
                "Uche",
                "Echemunor",
            ),
            User(
                R.drawable.ic_img10,
                "Affy",
                "Azonye",
            ),
            User(
                R.drawable.ic_img8,
                "Uche",
                "Echemunor",
            ),
            User(
                R.drawable.ic_img7,
                "Niyi",
                "Eju",
            ),
            User(
                R.drawable.ic_img8,
                "Uche",
                "Echemunor",
            ),
            User(
                R.drawable.ic_img7,
                "Mathew",
                "Dabo",
            ),
            User(
                R.drawable.ic_img8,
                "Gift",
                "Iseoma",
            ),
            User(
                R.drawable.ic_img7,
                "seyi",
                "Dabo",
            ),
        )
        myRecyclerAdapter = RecyclerAdapter(users, this)
        binding.recyclerview.adapter = myRecyclerAdapter
    }

    override fun onUserClick(user: User, position: Int) {
        val intent = Intent(this, ProfileviewActivity::class.java)
        intent.putExtra("profileImage",user.imageview1.toString())
        intent.putExtra("firstname",user.textview1)
        intent.putExtra("secondname",user.textview2)
        startActivity(intent)

    }
}