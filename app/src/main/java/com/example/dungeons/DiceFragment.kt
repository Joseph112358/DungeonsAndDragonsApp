package com.example.dungeons

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Dice : Fragment() {

    private lateinit var title: String
     fun onCreate(savedInstanceState: Bundle?, title:String) {
        super.onCreate(savedInstanceState)
        this.title = title
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root =inflater.inflate(R.layout.fragment_dice, container, false)
        val diceTextView = root.findViewById<TextView>(R.id.diceFragmentTextView)
        diceTextView.setText(title)
        return root
    }
}