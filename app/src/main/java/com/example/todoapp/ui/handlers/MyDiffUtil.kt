package com.example.todoapp.ui.handlers

import android.util.Log
import androidx.recyclerview.widget.DiffUtil
import com.example.todoapp.data.ToDoItem

class MyDiffUtil(
    private val oldList: List<ToDoItem>,
    private val newList: List<ToDoItem>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {

        return oldList.size

    }

    override fun getNewListSize(): Int {

        return newList.size

    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {

        return oldList[oldItemPosition].id == newList[newItemPosition].id

    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {

       return oldList[oldItemPosition].equals(newList[newItemPosition])

    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {

        return super.getChangePayload(oldItemPosition, newItemPosition)

    }
}