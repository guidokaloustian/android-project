package com.example.pil.mvp.presenter

import com.example.pil.mvp.contract.WriterContract

class WriterPresenter(private val view: WriterContract.View) : WriterContract.Presenter {
    override fun buttonToast(text: String) {
        if (text.isNotEmpty()) {
            view.showToast(text)
        }
    }
}
