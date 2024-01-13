package com.example.myapplication4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.AnimationTypes
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.mikhaellopez.circularprogressbar.CircularProgressBar
import com.ncorti.slidetoact.SlideToActView

class MainActivity3 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val tT = findViewById<TextView>(R.id.Buttontext)


        val imageList = ArrayList<SlideModel>()
        val imageList2 = ArrayList<SlideModel>()// Create image list

        // imageList.add(SlideModel("String Url" or R.drawable)
        // imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title
        tT.setOnClickListener {
            startActivity(Intent(this@MainActivity3, MainActivity::class.java))
        }
        imageList2.add(
            SlideModel(
                R.drawable.argame,
                " ",
                ScaleTypes.CENTER_CROP
            )
        )
        imageList2.add(
            SlideModel(
                R.drawable.gamear,
                " ",
                ScaleTypes.CENTER_CROP
            )
        )
        imageList2.add(
            SlideModel(
                R.drawable.fatherar,
                " ",
                ScaleTypes.CENTER_CROP
            )
        )
        imageList2.add(
            SlideModel(
                R.drawable.orbusar,
                " ",
                ScaleTypes.CENTER_CROP
            )
        )
        imageList2.add(
            SlideModel(
                R.drawable.dragonvr,
                " ",
                ScaleTypes.CENTER_CROP
            )
        )
        imageList2.add(
            SlideModel(
                R.drawable.psvr,
                " ",
                ScaleTypes.CENTER_CROP
            )
        )
        imageList2.add(
            SlideModel(
                R.drawable.playstationvr,
                " ",
                ScaleTypes.CENTER_CROP
            )
        )


        imageList.add(
            SlideModel(
                "https://bit.ly/2YoJ77H",
                "The animal population decreased by 58 percent in 42 years.",
                ScaleTypes.CENTER_CROP
            )
        )
        imageList.add(
            SlideModel(
                "https://bit.ly/2BteuF2",
                "Elephants and tigers may become extinct.",
                ScaleTypes.CENTER_CROP
            )
        )
        imageList.add(
            SlideModel(
                "https://bit.ly/3fLJf72",
                "And people do that.",
                ScaleTypes.CENTER_CROP
            )
        )

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        val imageSlider2 = findViewById<ImageSlider>(R.id.image_slider2)
        imageSlider.setImageList(imageList)
        imageSlider2.setImageList(imageList2)
        imageSlider.setSlideAnimation(AnimationTypes.FIDGET_SPINNER)


        var slidetoview2 = findViewById<SlideToActView>(R.id.slidetoview2)
        slidetoview2.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                val _intent = Intent(this@MainActivity3, MainActivity4::class.java)
                startActivity(_intent)
            }
        }


        // CircularProgressBar for PPBM
        val circularProgressBar = findViewById<CircularProgressBar>(R.id.circularProgressBar)
        circularProgressBar.apply {
            setProgressWithAnimation(99f, 10000)
        }

        // CircularProgressBar for PAM
        val circularProgressBar1 = findViewById<CircularProgressBar>(R.id.circularProgressBar1)
        circularProgressBar1.apply {
            setProgressWithAnimation(80.54f, 10000)
        }

        // CircularProgressBar for PANCASILA
        val circularProgressBar2 = findViewById<CircularProgressBar>(R.id.circularProgressBar2)
        circularProgressBar2.apply {
            setProgressWithAnimation(90.2f, 10000)
        }


        circularProgressBar.onProgressChangeListener = { progress ->
        }

        circularProgressBar.onIndeterminateModeChangeListener = { isEnable ->
        }
    }
}

