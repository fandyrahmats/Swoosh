package com.example.fandyrahmatsaputra.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.fandyrahmatsaputra.swoosh.Utilities.EXTRA_LEAGUE
import com.example.fandyrahmatsaputra.swoosh.R
import com.example.fandyrahmatsaputra.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    val TAG = "SkillActivity"
    var league = ""
    var selectedSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        Log.d(TAG, "League : " + league)
    }

    fun onBeginnerClicked(view: View) {
        tgl_btn_baller.isChecked = false
        if (tgl_btn_beginner.isChecked) {
            selectedSkill = "beginner"
        } else {
            selectedSkill = ""
        }
    }

    fun onBallerClicked(view: View) {
        tgl_btn_beginner.isChecked = false
        if (tgl_btn_baller.isChecked) {
            selectedSkill = "baller"
        } else {
            selectedSkill = ""
        }
    }

    fun intentFinishActivityClicked(view: View) {
        if (selectedSkill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, selectedSkill)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Select your Skills", Toast.LENGTH_SHORT).show()
        }
    }

}
