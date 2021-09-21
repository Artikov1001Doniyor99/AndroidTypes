package com.example.modul_5_1_lesson_3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item.view.*


class ImageBaseAdapter(var list: List<ImageData>):BaseAdapter() {



    override fun getCount(): Int = list.size

    override fun getItem(p0: Int):ImageData = list[p0]

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {


     var itemView:View
     if(p1 == null){
         itemView =LayoutInflater.from(p2?.context).inflate(R.layout.item,p2,false)
     }else{
        itemView = p1
     }


        itemView.text_V.text = list[p0].text
        itemView.image_I.setImageResource(list[p0].img)


        return itemView

    }

}