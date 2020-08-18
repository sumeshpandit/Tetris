package com.sumesh_pandit.tetris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View


import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        newGame.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        settings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }

        continueGame.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            i.putExtra("continue", false)
            startActivity(i)
        }
    }

    override fun onStart() {
        super.onStart()
        if (GameState.saved) {
            continueGame.visibility = View.VISIBLE
        }
    }
}
