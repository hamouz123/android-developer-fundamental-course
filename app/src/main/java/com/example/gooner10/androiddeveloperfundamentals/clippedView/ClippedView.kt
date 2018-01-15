package com.example.gooner10.androiddeveloperfundamentals.clippedView

import android.content.Context
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View
import com.example.gooner10.androiddeveloperfundamentals.R

/**
 * Custom view to display clipped view
 */
class ClippedView : View {
    private var paint: Paint = Paint()
    private var path: Path = Path()
    private val clipRectRight = resources.getDimension(R.dimen.clipRectRight)
    private val clipRectBottom = resources.getDimension(R.dimen.clipRectBottom)
    private val clipRectTop = resources.getDimension(R.dimen.clipRectTop)
    private val clipRectLeft = resources.getDimension(R.dimen.clipRectLeft)
    private val rectInsect = resources.getDimension(R.dimen.rectInset)
    private val smallRectOffSet = resources.getDimension(R.dimen.smallRectOffset)
    private val circleRadius = resources.getDimension(R.dimen.circleRadius)
    private val textOffset = resources.getDimension(R.dimen.textOffset)
    private val textSize = resources.getDimension(R.dimen.textSize)
    private val columnOne = rectInsect
    private val columnTwo = columnOne + rectInsect + clipRectRight
    private val rowOne = rectInsect
    private val rowTwo = rowOne + rectInsect + clipRectBottom
    private val rowThree = rowTwo + rectInsect + clipRectBottom
    private val rowFour = rowThree + rectInsect + clipRectBottom
    private val textRow = rowFour + (1.5 * clipRectBottom)
    private var rectF: RectF? = null

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        paint.isAntiAlias = true
        paint.strokeWidth = resources.getDimension(R.dimen.strokeWidth)
        paint.textSize = resources.getDimension(R.dimen.textSize)
        rectF = RectF(RectF(rectInsect, rectInsect, clipRectRight - rectInsect, clipRectBottom - rectInsect))
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)
}