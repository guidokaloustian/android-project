package com.example.pil.mvp.contract

interface WriterContract {

    interface View {
        fun showToast(text: String)
    }

    interface Presenter {
        fun buttonToast(text: String)
    }
}