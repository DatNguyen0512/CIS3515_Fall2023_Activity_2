package edu.temple.inclassuiacvitivity

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.content.Context
import android.widget.TextView

class TextSizeAdapter(_context: Context, _textSizes: Array<Int>): BaseAdapter() {
    val context = _context
    val textSizes = _textSizes
    override fun getCount()= textSizes.size

    override fun getItem(p0: Int)= textSizes[p0]

    override fun getItemId(p0: Int)= p0.toLong()

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        return(getDropDownView(p0, p1, p2) as TextView).apply {
            textSize = 22f
        }
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView


        if(convertView == null){
            textView = TextView(context)
            textView.setPadding(10, 20, 0, 20)
        }
        else{
            textView = convertView as TextView
        }
        textView.text = textSizes[position].toString()
        textView.textSize = textSizes[position].toFloat()

        return textView
    }

}