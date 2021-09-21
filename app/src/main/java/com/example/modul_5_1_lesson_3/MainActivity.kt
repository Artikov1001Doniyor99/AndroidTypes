package com.example.modul_5_1_lesson_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*

/*Quyidagi rasmda android OS(operatsion sistema) versiyalarining nomlari ketma-ketligi berilgan. Kichik loyiha yarating.
2 ta activitydan tashkil topgan. Birinchi activityda mana shu android OS versiyalari nomi va rasmlari gridviewda chiqsin.
Item click bo'lganda ikkinchi activityga o'tsin. Ikkinchi activityda har bir android OS haqida info yozilgan bo'ladi.*/

class MainActivity : AppCompatActivity() {

    var list = ArrayList<ImageData>()
    lateinit var imageBaseAdapter: BaseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.title = "GridView Using Base Adapter"

        loadData()

        imageBaseAdapter = ImageBaseAdapter(list)
        grid_View.adapter =imageBaseAdapter

        grid_View.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("image",list[i])
            startActivity(intent)
        }


    }

    private fun loadData() {
        list.add(ImageData(R.drawable.d, "Cup Cake"))
        list.add(ImageData(R.drawable.a, "Donut"))
        list.add(ImageData(R.drawable.b, "Eclair"))
        list.add(ImageData(R.drawable.e, "Froya"))
        list.add(ImageData(R.drawable.c, "Gingerbread"))
        list.add(ImageData(R.drawable.g, "Kitkat"))
        list.add(ImageData(R.drawable.l, "Lollipop"))
        list.add(ImageData(R.drawable.k, "Much More"))
    }
}