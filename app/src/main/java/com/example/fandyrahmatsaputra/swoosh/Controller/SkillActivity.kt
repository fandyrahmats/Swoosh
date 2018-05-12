package com.example.fandyrahmatsaputra.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.fandyrahmatsaputra.swoosh.Model.Player
import com.example.fandyrahmatsaputra.swoosh.R
import com.example.fandyrahmatsaputra.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

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
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        Log.d(TAG, "League : " + player)
    }

    fun onBeginnerClicked(view: View) {
        tgl_btn_baller.isChecked = false
        if (tgl_btn_beginner.isChecked) {
            player.skill = "beginner"
        } else {
            player.skill = ""
        }
    }

    fun onBallerClicked(view: View) {
        tgl_btn_beginner.isChecked = false
        if (tgl_btn_baller.isChecked) {
            player.skill = "baller"
        } else {
            player.skill = ""
        }
    }

    fun intentFinishActivityClicked(view: View) {
        if (player.skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Select your Skills", Toast.LENGTH_SHORT).show()
        }
    }

}
