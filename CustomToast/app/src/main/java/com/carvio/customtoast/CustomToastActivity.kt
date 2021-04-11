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

    private fun showToastMessage(background : Int, icon : Int, message : String){
        val layoutInflater : LayoutInflater = layoutInflater
        val view : View = layoutInflater.inflate(R.layout.toast_message,findViewById(R.id.linearLayoutToast))
        view.setBackgroundResource(background)

        val imageViewToast : ImageView = view.findViewById(R.id.imageViewToast)
        imageViewToast.setImageResource(icon)

        val textViewToast : TextView = view.findViewById(R.id.textViewToast)
        textViewToast.text = message

        val toast : Toast = Toast(applicationContext)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = view

        toast.show()
    }

    fun onClickErrorMessage(view: View) {
        showToastMessage(R.drawable.background_red,R.drawable.error,"This is a Error Message!")
    }

    fun onClickSuccessMessage(view: View) {
        showToastMessage(R.drawable.background_green,R.drawable.success,"This is a Success Message!")
    }

    fun onClickInfoMessage(view: View) {
        showToastMessage(R.drawable.background_blue,R.drawable.info,"This is a Info Message!")
    }
}
