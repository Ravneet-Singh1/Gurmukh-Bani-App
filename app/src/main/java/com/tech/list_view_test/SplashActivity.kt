package com.tech.list_view_test

import android.content.Intent
import android.media.MediaPlayer
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class SplashActivity : AppCompatActivity() {

    private var soundPool: SoundPool? = null
    private val soundId = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN



        Handler().postDelayed(
            {
                var mediaPlayer : MediaPlayer
                mediaPlayer = MediaPlayer.create(applicationContext,R.raw.waheguruaudio1)
                mediaPlayer.start()

                startActivity(Intent(this,BasicActivity ::class.java))
                finish()
            },1500
        )
    }

}