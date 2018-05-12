package com.example.fandyrahmatsaputra.swoosh.Controller

import android.os.Bundle
import com.example.fandyrahmatsaputra.swoosh.Model.Player
import com.example.fandyrahmatsaputra.swoosh.R
import com.example.fandyrahmatsaputra.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        text_search_league.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
