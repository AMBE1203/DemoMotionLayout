package com.example.demomotionlayout

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.ImageView

class BoundsImageView @JvmOverloads constructor(
    context: Context, attributeSet: AttributeSet? = null, defStyleAttr: Int = 0
) : ImageView(context, attributeSet, defStyleAttr) {

    private var paint = Paint()

    init {
        paint.setARGB(250, 200, 0, 0)
        paint.strokeWidth = 4f
        paint.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawLine(0f, 0f, width.toFloat(), height.toFloat(), paint)
        canvas?.drawLine(0f, height.toFloat(), width.toFloat(), 0f, paint)
    }
}