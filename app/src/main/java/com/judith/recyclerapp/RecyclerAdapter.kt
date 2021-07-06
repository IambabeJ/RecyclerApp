package com.judith.recyclerapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.judith.recyclerapp.databinding.ItemDesignBinding
import com.judith.recyclerapp.models.User

class RecyclerAdapter(val uList: List<User>, var clickListener: OnUserClickListener) :
    RecyclerView.Adapter<RecyclerAdapter.myViewHolder>() {


    //this method is returning the data on the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var binding = ItemDesignBinding.inflate(LayoutInflater.from(parent.context))
        return myViewHolder(binding)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(
        holderMy: myViewHolder,
        position: Int,
    ) {
        holderMy.bindItems(uList[position])
        holderMy.initialize(uList[position], clickListener)
    }

    // this method is giving the size of the list
    override fun getItemCount(): Int {
        return uList.size
    }

    inner class myViewHolder(var binding: ItemDesignBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindItems(user: User) {
            binding.imageview1.setImageResource(user.imageview1)
            binding.text1.text = user.textview1
            binding.text2.text = user.textview2

        }

        fun initialize(uList: User, action: OnUserClickListener) {
            binding.imageview1.setImageResource(uList.imageview1)
            binding.text1.text = uList.textview1
            binding.text2.text = uList.textview2

            binding.root.setOnClickListener {
                action.onUserClick(uList, adapterPosition)
            }
        }
    }

    interface OnUserClickListener {
        fun onUserClick(user: User, position: Int)
    }
}


