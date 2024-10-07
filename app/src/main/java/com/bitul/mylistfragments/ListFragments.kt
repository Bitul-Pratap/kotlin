package com.bitul.mylistfragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.fragment.app.ListFragment


class ListFragments : ListFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_fragments, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val arrayAdaptor= activity?.let {
            ArrayAdapter.createFromResource(it,R.array.cities,android.R.layout.simple_list_item_1) }

        listAdapter=arrayAdaptor

        listView.setOnItemClickListener { parent, view, position, id ->

            val intent=Intent(activity,SecondActivity::class.java)
            intent.putExtra("position",position)
            startActivity(intent)


        }

    }

}