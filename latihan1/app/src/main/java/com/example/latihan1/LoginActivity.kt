package com.example.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity(), View.OnClickListener {
   private lateinit var etusername:EditText
   private lateinit var etpassword:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etusername=findViewById(R.id.EditText_Username)
        etpassword=findViewById(R.id.EditText_Password)


        val BtnContinue : Button = findViewById(R.id.Btn_Continue)
        BtnContinue.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.Btn_Continue -> {

                val bundle = Bundle()
                bundle.putString("username", etusername.text.toString())
                bundle.putString("password", etpassword.text.toString())


                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                intent.putExtras(bundle)
                intent.putExtra("user", user(etusername.text.toString(),etpassword.text.toString()))
                startActivity(intent)
            }
        }
    }
}
