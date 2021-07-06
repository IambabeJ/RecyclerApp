package com.judith.recyclerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.judith.recyclerapp.databinding.ActivityMainBinding
import com.judith.recyclerapp.models.User


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
                "Cynthia",
                "Blessing",
            ),
            User(
                R.drawable.ic_img8,
                "Ashiedu",
                "Ngozi",
            ),
            User(
                R.drawable.ic_img7,
                "Wilson",
                "Johnny",
            ),
            User(
                R.drawable.ic_img4,
                "Paulson",
                "Chuckwuka",
            ),
            User(
                R.drawable.ic_img1,
                "Oluoma",
                "chukwudi",
            ),
            User(
                R.drawable.ic_img7,
                "Judith",
                "Alphonsus",
            ),
            User(
                R.drawable.ic_img8,
                "Jennifer",
                "Echezona",
            ),
            User(
                R.drawable.ic_img1,
                "Isioma",
                "Echezona",
            ),
            User(
                R.drawable.ic_img9,
                "Samson",
                "Alexandra",
            ),
            User(
                R.drawable.ic_img1,
                "Sophia",
                "Chukwuma",
            ),
            User(
                R.drawable.ic_img7,
                "Uchenna",
                "Echezona",
            ),
            User(
                R.drawable.ic_img8,
                "Ukamaka",
                "Muna",
            ),
            User(
                R.drawable.ic_img2,
                "Ugo",
                "Echezona",
            ),
            User(
                R.drawable.ic_img9,
                "Afamefune",
                "Ashionye",
            ),
            User(
                R.drawable.ic_img8,
                "Uchenna",
                "Echezona",
            ),
            User(
                R.drawable.ic_img7,
                "Omoruyi",
                "Uju",
            ),
            User(
                R.drawable.ic_img8,
                "Uchenna",
                "Echezona",
            ),
            User(
                R.drawable.ic_img7,
                "Matthew",
                "Dolapo",
            ),
            User(
                R.drawable.ic_img8,
                "Gifted",
                "Isioma",
            ),
            User(
                R.drawable.ic_img7,
                "Segun",
                "Dolapo",
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