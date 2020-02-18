package com.example.demomotionlayout

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import androidx.core.view.NestedScrollingParent2

class TouchFrameLayout(mContext: Context, mAttributeSet: AttributeSet) :
    FrameLayout(mContext, mAttributeSet), NestedScrollingParent2 {

    public fun getMotionLayout(): NestedScrollingParent2 {
        return parent as NestedScrollingParent2
    }

    override fun onNestedPreScroll(target: View, dx: Int, dy: Int, consumed: IntArray, type: Int) {
        return getMotionLayout().onNestedPreScroll(target, dx, dy, consumed, type)
    }

    override fun onStopNestedScroll(target: View, type: Int) {
        return getMotionLayout().onStopNestedScroll(target, type)
    }

    override fun onStartNestedScroll(child: View, target: View, axes: Int, type: Int): Boolean {

        return getMotionLayout().onStartNestedScroll(child, target, axes, type)
    }

    override fun onNestedScrollAccepted(child: View, target: View, axes: Int, type: Int) {
        return getMotionLayout().onNestedScrollAccepted(child, target, axes, type)
    }

    override fun onNestedScroll(
        target: View,
        dxConsumed: Int,
        dyConsumed: Int,
        dxUnconsumed: Int,
        dyUnconsumed: Int,
        type: Int
    ) {
        return getMotionLayout().onNestedScroll(
            target,
            dxConsumed,
            dyConsumed,
            dxUnconsumed,
            dyUnconsumed,
            type
        )
    }

}