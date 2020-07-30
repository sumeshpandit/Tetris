package com.sumesh_pandit.tetris

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_game_over.*

class GameOverActivity : AppCompatActivity() {

    val PREFS = "game_settings"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over)

        val settings = getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val params = intent.extras
        val record = settings.getInt("record", 0)
        val points = params?.getInt("points")

        if (points != null && points > record) {
            txtNewRecord.text = "${resources.getString(R.string.new_record)} $points"
            txtNewRecord.visibility = View.VISIBLE
            settings.edit().putInt("record", points).apply()
        }

        txtRecord.text = resources.getString(R.string.record_label) + " " + record
        txtPoints.text = resources.getString(R.string.points_text) + " " + points

        newGame.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        exitGame.setOnClickListener {
            finish()
        }
    }
}
