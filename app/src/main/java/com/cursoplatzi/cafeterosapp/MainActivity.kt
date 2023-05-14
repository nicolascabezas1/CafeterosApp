package com.cursoplatzi.cafeterosapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cursoplatzi.cafeterosapp.login_view.LoginActivity


class MainActivity : AppCompatActivity() {

    private lateinit var btCafeterosLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btCafeterosLogin = findViewById(R.id.btCafeterosLogin)
    }

    private fun initListeners() {
        btCafeterosLogin.setOnClickListener { navigateToLogin() }
    }

    private fun navigateToLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}