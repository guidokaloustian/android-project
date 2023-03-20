package com.example.pil.mvp.presenter

import com.example.pil.mvp.contract.WriterContract
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class WriterPresenterTest {
    private lateinit var writerPresenter: WriterContract.Presenter

    @MockK
    private lateinit var writerView: WriterContract.View

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)

        writerPresenter = WriterPresenter(writerView)
    }

    @Test
    fun `show toast when button is pressed`() {
        writerPresenter.buttonToast("Hello")
        verify { writerView.showToast("Hello") }
    }

    @Test
    fun hola() {
        val expected = "hola"
        val result = "hola"

        Assert.assertEquals(expected, result)
    }
}
