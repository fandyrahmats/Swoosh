package com.example.fandyrahmatsaputra.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.fandyrahmatsaputra.swoosh.R
import com.example.fandyrahmatsaputra.swoosh.Utilities.EXTRA_LEAGUE
import com.example.fandyrahmatsaputra.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    val TAG = "FinishActivity"
    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)

        text_search_league.text = "Looking for $league $skill league near you..."
    }
}
