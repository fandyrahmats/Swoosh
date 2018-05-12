package com.example.fandyrahmatsaputra.swoosh.Controller

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.fandyrahmatsaputra.swoosh.Model.Player
import com.example.fandyrahmatsaputra.swoosh.R
import com.example.fandyrahmatsaputra.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        tgl_btn_womens.isChecked = false
        tgl_btn_coed.isChecked = false
        if (tgl_btn_mens.isChecked) {
            player.league = "Mens"
        } else {
            player.league = ""
        }
    }

    fun onWomensClicked(view: View) {
        tgl_btn_mens.isChecked = false
        tgl_btn_coed.isChecked = false
        if (tgl_btn_womens.isChecked) {
            player.league = "Womens"
        } else {
            player.league = ""
        }
    }

    fun onCoedClicked(view: View) {
        tgl_btn_mens.isChecked = false
        tgl_btn_womens.isChecked = false
        if (tgl_btn_coed.isChecked) {
            player.league = "Co-Ed"
        } else {
            player.league = ""
        }
    }

    fun intentSkillActivityClicked(view: View) {
        if (player.league != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Choose as one", Toast.LENGTH_SHORT).show()
        }
    }

}
