package com.example.kaspresso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var currentValue = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.increment).setOnClickListener(this::incrementAction)
        findViewById<Button>(R.id.decrement).setOnClickListener(this::decrementAction)
        findViewById<Button>(R.id.clear).setOnClickListener(this::clearAction)
    }

    private fun incrementAction(view: View) {
        updateCounter(++currentValue)
    }

    private fun decrementAction(view: View) {
        updateCounter(--currentValue)
    }

    private fun clearAction(view: View) {
        currentValue = 0
        updateCounter(currentValue)
    }

    private fun updateCounter(value: Int) {
        findViewById<TextView>(R.id.counter).text = String.format("Count: %d", value)
    }
}