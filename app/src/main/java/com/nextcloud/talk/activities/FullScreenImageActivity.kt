package com.nextcloud.talk.activities

import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.facebook.drawee.view.SimpleDraweeView
import com.nextcloud.talk.R


class FullScreenImageActivity : AppCompatActivity() {

    private lateinit var fullscreenContent: SimpleDraweeView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_full_screen_image)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        fullscreenContent = findViewById(R.id.fullscreen_content)
        fullscreenContent.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LOW_PROFILE or
                View.SYSTEM_UI_FLAG_FULLSCREEN or
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                View.SYSTEM_UI_FLAG_IMMERSIVE or
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

//        val id = intent.getStringExtra(BundleKeys.KEY_FILE_ID)
        val imageUrl = intent.getStringExtra("KEY_BIG_IMAGE_URL")
        val uri = Uri.parse(imageUrl)
        fullscreenContent.setImageURI(uri)

    }

}
