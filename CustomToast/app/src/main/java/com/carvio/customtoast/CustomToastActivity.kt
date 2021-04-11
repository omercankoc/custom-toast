package com.carvio.customtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.*

class CustomToastActivity : AppCompatActivity() {

    private lateinit var linearLayoutButtons : LinearLayout
    private lateinit var buttonInfo : Button
    private lateinit var buttonSuccess : Button
    private lateinit var buttonError : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_toast)
        linearLayoutButtons = findViewById(R.id.linearLayoutButtons)
        buttonInfo = findViewById(R.id.buttonInfo)
        buttonSuccess = findViewById(R.id.buttonSuccess)
        buttonError = findViewById(R.id.buttonError)
    }

    fun showToastMessage(){

    }

    fun onClickErrorMessage(view: View) {
        val layoutInflater : LayoutInflater = layoutInflater
        val view : View = layoutInflater.inflate(R.layout.toast_message,findViewById(R.id.linearLayoutToast))
        //view.setBackgroundColor(R.drawable.background_red)

        val imageViewToast : ImageView = view.findViewById(R.id.imageViewToast)
        imageViewToast.setImageResource(R.drawable.error)

        val textViewToast : TextView = view.findViewById(R.id.textViewToast)
        textViewToast.text = "Hello!"

        val toast : Toast = Toast(applicationContext)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = view

        toast.show()
    }

    fun onClickSuccessMessage(view: View) {
        val layoutInflater : LayoutInflater = layoutInflater
        val view : View = layoutInflater.inflate(R.layout.toast_message,findViewById(R.id.linearLayoutToast))
        //view.setBackgroundColor(R.drawable.background_green)

        val imageViewToast : ImageView = view.findViewById(R.id.imageViewToast)
        imageViewToast.setImageResource(R.drawable.success)

        val textViewToast : TextView = view.findViewById(R.id.textViewToast)
        textViewToast.text = "Hello!"

        val toast : Toast = Toast(applicationContext)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = view

        toast.show()
    }

    fun onClickInfoMessage(view: View) {
        val layoutInflater : LayoutInflater = layoutInflater
        val view : View = layoutInflater.inflate(R.layout.toast_message,findViewById(R.id.linearLayoutToast))
        //view.setBackgroundColor(R.drawable.background_blue)

        val imageViewToast : ImageView = view.findViewById(R.id.imageViewToast)
        imageViewToast.setImageResource(R.drawable.info)

        val textViewToast : TextView = view.findViewById(R.id.textViewToast)
        textViewToast.text = "Hello!"

        val toast : Toast = Toast(applicationContext)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = view

        toast.show()
    }
}