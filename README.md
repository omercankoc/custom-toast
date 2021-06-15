# Custom Toast Messages
Let's create a dynamic layout with backgorund, icon and message parameters.
```kotlin
private fun showToastMessage(background : Int, icon : Int, message : String){
    val layoutInflater : LayoutInflater = layoutInflater
    
    // Dynamic Backgorund
    val view : View = layoutInflater.inflate(R.layout.toast_message,findViewById(R.id.linearLayoutToast))
    view.setBackgroundResource(background)
    
    // Dynamic Icon
    val imageViewToast : ImageView = view.findViewById(R.id.imageViewToast)
    imageViewToast.setImageResource(icon)

    // Dynamic Message
    val textViewToast : TextView = view.findViewById(R.id.textViewToast)
    textViewToast.text = message

    // Set Position
    val toast : Toast = Toast(applicationContext)
    toast.setGravity(Gravity.CENTER,0,0)
    toast.duration = Toast.LENGTH_SHORT
    toast.view = view

    toast.show()
}
```
To create a Custom Toast Message:
```kotlin
fun onClickErrorMessage(view: View) {
    showToastMessage(R.drawable.background_red,R.drawable.error,"This is a Error Message!")
}

fun onClickSuccessMessage(view: View) {
    showToastMessage(R.drawable.background_green,R.drawable.success,"This is a Success Message!")
}

fun onClickInfoMessage(view: View) {
    showToastMessage(R.drawable.background_blue,R.drawable.info,"This is a Info Message!")
}
```
