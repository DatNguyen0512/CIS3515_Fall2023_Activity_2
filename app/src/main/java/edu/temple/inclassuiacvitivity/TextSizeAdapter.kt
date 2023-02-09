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
        val textView =TextView(context)
        textView.text = textSizes[p0].toString()

        return textView
    }

}