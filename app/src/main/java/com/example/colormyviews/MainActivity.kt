package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.colormyviews.R.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for the background
            id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            id.box_two_text -> view.setBackgroundResource(drawable.background_image)
            id.box_three_text -> view.setBackgroundColor(Color.GRAY)
            id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            id.box_six_text -> view.setBackgroundColor(Color.CYAN)
            id.box_seven_text -> view.setBackgroundColor(Color.RED)
            id.box_eight_text -> view.setBackgroundColor(Color.YELLOW)
            id.red_button -> box_three_text.setBackgroundResource(color.my_red)
            id.yellow_button -> box_four_text.setBackgroundResource(color.my_yellow)
            id.green_button -> box_five_text.setBackgroundResource(color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)

        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(id.box_one_text)
        val boxTwoText = findViewById<TextView>(id.box_two_text)
        val boxThreeText = findViewById<TextView>(id.box_three_text)
        val boxFourText = findViewById<TextView>(id.box_four_text)
        val boxFiveText = findViewById<TextView>(id.box_five_text)
        val boxSixText = findViewById<TextView>(id.box_six_text)
        val boxSevenText = findViewById<TextView>(id.box_seven_text)
        val boxEightText = findViewById<TextView>(id.box_eight_text)

        val redButton = findViewById<TextView>(id.red_button)
        val greenButton = findViewById<TextView>(id.green_button)
        val yellowButton = findViewById<TextView>(id.yellow_button)

        val rootConstraintLayout = findViewById<View>(id.constraint_layout)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText,boxSixText
                ,boxSevenText,boxEightText,rootConstraintLayout,
                redButton, greenButton, yellowButton
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }



    }
}
