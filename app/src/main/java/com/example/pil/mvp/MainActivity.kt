package com.example.pil.mvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pil.databinding.ActivityMainBinding
import com.example.pil.mvp.contract.WriterContract
import com.example.pil.mvp.presenter.WriterPresenter
import com.example.pil.mvp.view.WriterView

class MainActivity : AppCompatActivity() {
    private lateinit var presenter: WriterContract.Presenter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = WriterPresenter(WriterView(this))
        binding.btnToast.setOnClickListener {
            presenter.buttonToast(binding.editText.text.toString())
        }
    }
}
