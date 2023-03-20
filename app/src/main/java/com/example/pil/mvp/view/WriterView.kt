package com.example.pil.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.pil.mvp.ActivityView
import com.example.pil.mvp.contract.WriterContract

class WriterView(activity: Activity) : ActivityView(activity), WriterContract.View {
    override fun showToast(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}