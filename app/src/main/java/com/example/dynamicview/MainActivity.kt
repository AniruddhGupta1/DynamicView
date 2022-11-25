    package com.example.dynamicview

    import android.graphics.Color
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.view.ViewGroup
    import android.widget.Button
    import android.widget.LinearLayout
    import android.widget.Toast

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            var l  = findViewById<LinearLayout>(R.id.linearLayout)
            var btn :Button= findViewById(R.id.button)
            btn.setOnClickListener{
                 var b2 = Button(this)
                b2.text="Add New Button "
                b2.setBackgroundColor(Color.WHITE)
                b2.setTextColor(Color.GREEN)
                b2.layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT

                ).apply {
                      setMargins(100, 100, 10, 10)
                }

                    Toast.makeText(this, "New Button Added", Toast.LENGTH_SHORT).show()
                l.addView(b2)


            }

        }


    }