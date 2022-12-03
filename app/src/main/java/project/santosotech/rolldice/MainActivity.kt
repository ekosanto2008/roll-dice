package project.santosotech.rolldice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var diceImg: ImageView
    private lateinit var rollBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollBtn = findViewById(R.id.btn_roll)
        diceImg = findViewById(R.id.dice_image)
        
        rollBtn.setOnClickListener {
            roll()
        }
    }

    private fun roll() {
        val drawableRes = when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImg.setImageResource(drawableRes)
    }
}