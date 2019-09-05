package com.github.tamurashingo.android_test_view_2.views

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.github.tamurashingo.android_test_view_2.R


class CharacterView : View {

    private val bitmap: Bitmap;
    private val paint: Paint;

    init {
        bitmap = BitmapFactory.decodeResource(context.resources, R.drawable.block)
        paint = Paint()
    }

    constructor(context: Context): this(context, null)
    constructor(context: Context, attrs: AttributeSet?): super(context, attrs)

    override fun onDraw(canvas: Canvas?) {
        canvas?.drawBitmap(bitmap, convertDp2Px(0f), convertDp2Px(0f), paint)
        canvas?.drawBitmap(bitmap, convertDp2Px(32f), convertDp2Px(0f), paint)
    }


    fun convertDp2Px(dp: Float): Float {
        return dp * context.resources.displayMetrics.density
    }

}
