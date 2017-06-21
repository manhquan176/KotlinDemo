package com.example.nguyenmanhquan.kotlindemo

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_login.setOnClickListener {
            login()
        }
    }

    private fun login(){
        if(input_email.text.toString().equals(Util.ACCOUNT) && input_password.text.toString().equals(Util.PASS_WORD)) {
            val builder = android.app.AlertDialog.Builder(this)

            builder.setMessage("Login success")
                    .setPositiveButton("Ok", { dialogInterface: DialogInterface, i: Int -> goHome() })
                    .show()
        } else {
            val builder = android.app.AlertDialog.Builder(this)

            builder.setMessage("Login faild")
                    .setNegativeButton("Ok", { dialogInterface: DialogInterface, i: Int -> dismissDialog(1)})
                    .show()
        }
    }

    private fun goHome() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}
