package com.bitul.mylistfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class SecondFragment : Fragment() {

    lateinit var image: ImageView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_second, container, false)

        image=view.findViewById(R.id.imageview  )

        val position=arguments?.getInt("position",0)


        when(position)
        {
            0->image.setImageResource(R.drawable.dehli)
            1->image.setImageResource(R.drawable.ayodhya)
            2->image.setImageResource(R.drawable.methura)
            3->image.setImageResource(R.drawable.kashi)
            4->image.setImageResource(R.drawable.gorakhpur)
            5->image.setImageResource(R.drawable.somanath)
            6->image.setImageResource(R.drawable.dwarka)

        }
        // Inflate the layout for this fragment
        return view
    }

}