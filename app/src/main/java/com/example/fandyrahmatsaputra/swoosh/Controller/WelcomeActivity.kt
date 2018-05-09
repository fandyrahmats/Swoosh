package com.example.fandyrahmatsaputra.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.example.fandyrahmatsaputra.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        btn_intent_league.setOnClickListener {
           val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
