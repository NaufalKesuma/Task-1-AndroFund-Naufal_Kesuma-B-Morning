package com.example.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.latihan1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var tvUser : TextView
    private lateinit var btnDark : Button
    private lateinit var btnLight : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvUser = findViewById(R.id.tv_User)
        btnDark=findViewById(R.id.fragment2Btn)
        btnLight = findViewById(R.id.fragment1Btn)



       btnLight.setOnClickListener{replaceFragment(Fragment1())}
       btnDark.setOnClickListener{replaceFragment(Fragment2())}

        val username = intent.getParcelableExtra<user>("user")?.username
        tvUser.text = "Hai $username!"

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }


}