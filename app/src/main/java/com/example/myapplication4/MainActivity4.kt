package com.example.myapplication4

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {

    lateinit var customArrayAdapters: CustomArrayAdapters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val list = mutableListOf<OurData>()
        list.add(OurData(R.drawable.arlogo, "AUGMENTED REALITY IMPLEMENTATION", "Stasus\nFinished"))
        list.add(OurData(R.drawable.vrlogo, "VIRTUAL REALITY IMPLEMENTATION", "Status\nFinished"))
        list.add(OurData(R.drawable.photologo, "IMAGE CAPTURE ASSET", "Status\nNot Started"))
        list.add(OurData(R.drawable.animalogo, "SHORT ANIMATION", "Status\nOngoing"))
        list.add(OurData(R.drawable.editorlogo, "AD EDITING", "Status\nNot Started"))
        list.add(OurData(R.drawable.techlogo, "DRONE MAINTANCE", "Status\nNot Started"))
        list.add(OurData(R.drawable.ailogo, "AI IDENTIFICATION", "Status\nOngoing"))

        customArrayAdapters = CustomArrayAdapters(this, list)

        val listView = findViewById<ListView>(R.id.list)

        listView.adapter = customArrayAdapters

        // Menambahkan OnClickListener ke setiap item di ListView
        listView.setOnItemClickListener(AdapterView.OnItemClickListener { _, _, position, _ ->
            // Mendapatkan data dari item yang diklik
            val selectedItem = list[position]

            // Mengirim data ke activity baru (DetailActivity)
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("image", selectedItem.image)
            intent.putExtra("title", selectedItem.title)
            intent.putExtra("desc", selectedItem.desc)

            // Memulai activity baru
            startActivity(intent)
        })
    }
}