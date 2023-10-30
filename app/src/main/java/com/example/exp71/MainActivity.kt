package com.example.exp71

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user_Id=findViewById<EditText>(R.id.usetid_edittext)
        var password=findViewById<EditText>(R.id.password_edittext)
        var button=findViewById<Button>(R.id.login_button)
        var correct_user_id="yashika02"
        var correct_password="123"
        button.setOnClickListener {
            if(user_Id.text.toString().equals(correct_user_id)&&(password.text.toString().equals(correct_password)))
            {
                var intent = Intent(this, MainActivity2::class.java);
                startActivity(intent);
            }else{

                val builder = AlertDialog.Builder(this)

                builder.setTitle("Wrong Login ID  or password sorry!")
                //set message for alert dial
                builder.setMessage("Enter your correct details")
                builder.setIcon(android.R.drawable.ic_dialog_alert)


                builder.setNeutralButton("Ok"){dialogInterface , which ->
                    user_Id.text.clear()
                    password.text.clear()

                }

                val alertDialog: AlertDialog = builder.create()

                alertDialog.setCancelable(false)
                alertDialog.show()
            }
        }
    }
}