package com.example.nguyenmanhquan.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.layoutManager = LinearLayoutManager(this)
        list.hasFixedSize()
        list.adapter = ListAdapter(applicationContext, getLists())

    }

    fun getLists(): ArrayList<String> {
        var lists = ArrayList<String>()
        lists.add("JAVA")
        lists.add("KOTLIN")
        lists.add("PHP")
        lists.add("SWIFT")
        lists.add("JAVA Script")
        lists.add("MYSQL")
        return lists;
    }
}
