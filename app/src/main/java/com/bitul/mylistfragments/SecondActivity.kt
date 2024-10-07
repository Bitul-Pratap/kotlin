package com.bitul.mylistfragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

       val position =   intent.getIntExtra("position",0)

        val fragmentmanager=supportFragmentManager
        val fragmenttransaction=fragmentmanager.beginTransaction()
        val secondFragment=SecondFragment()

        val bundle=Bundle()
        bundle.putInt("position",position)

        secondFragment.arguments=bundle

        fragmenttransaction.add(R.id.framelayout,SecondFragment())
        fragmenttransaction.commit()

    }
}