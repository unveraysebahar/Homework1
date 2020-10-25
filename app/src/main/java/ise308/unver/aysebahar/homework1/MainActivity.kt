package ise308.unver.aysebahar.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        Toast.makeText(getApplicationContext(), "Click on the card for information.", Toast.LENGTH_LONG).show();

    }

    fun cardViewClick1(v: View) {
        setContentView(R.layout.cardview_contents_1)
    }

    fun cardViewClick2(v: View) {
        setContentView(R.layout.cardview_contents_2)
    }

    fun cardViewClick3(v: View) {
        setContentView(R.layout.cardview_contents_3)
    }

    fun cardViewClick4(v: View) {
        setContentView(R.layout.cardview_contents_4)
    }

    fun cardViewClick5(v: View) {
        setContentView(R.layout.cardview_contents_5)
    }

    fun backClick(v: View) {
        setContentView(R.layout.main)
    }
}