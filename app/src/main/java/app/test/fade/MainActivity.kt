package app.test.fade

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.image)
        val left = findViewById<Button>(R.id.left)
        val right = findViewById<Button>(R.id.right)

        left.setOnClickListener {
            image.animate().apply {
                duration = 1000
                translationXBy(-1000f)
            }.start()
        }

        right.setOnClickListener {
            image.animate().apply {
                duration = 1000
                translationXBy(1000f)
            }.start()
        }

    }
}