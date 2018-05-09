package com.example.fandyrahmatsaputra.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.fandyrahmatsaputra.swoosh.Utilities.EXTRA_LEAGUE
import com.example.fandyrahmatsaputra.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        tgl_btn_womens.isChecked = false
        tgl_btn_coed.isChecked = false
        if (tgl_btn_mens.isChecked) {
            selectedLeague = "Mens"
        } else {
            selectedLeague = ""
        }
    }

    fun onWomensClicked(view: View) {
        tgl_btn_mens.isChecked = false
        tgl_btn_coed.isChecked = false
        if (tgl_btn_womens.isChecked) {
            selectedLeague = "Womens"
        } else {
            selectedLeague = ""
        }
    }

    fun onCoedClicked(view: View) {
        tgl_btn_mens.isChecked = false
        tgl_btn_womens.isChecked = false
        if (tgl_btn_coed.isChecked) {
            selectedLeague = "Co-Ed"
        } else {
            selectedLeague = ""
        }
    }

    fun intentSkillActivityClicked(view: View) {
        if (selectedLeague != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Choose as one", Toast.LENGTH_SHORT).show()
        }
    }

}
