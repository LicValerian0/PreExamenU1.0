package mx.edu.itesca.preexamenu10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.textclassifier.ConversationAction
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    var gradosC=0.0
    var gradosF=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etGC: TextInputEditText=findViewById(R.id.etC)
        val etGF: TextInputEditText =findViewById(R.id.etF)
        val btnConvC: Button = findViewById(R.id.btnC)
        val btnConvF: Button = findViewById(R.id.btnF)

            btnConvC.setOnClickListener {
                gradosF= etGF.text.toString().toDouble()
                ConvertirC()
                etGC.setText(gradosF.toString())
            }
            btnConvF.setOnClickListener {
                gradosC= etGC.text.toString().toDouble()
                ConvertirF()
                etGF.setText(gradosC.toString())
            }
    }
    fun ConvertirF(){
        gradosC=(gradosC*1.8+32)
    }
    fun ConvertirC(){
        gradosF=(gradosF-32)/1.8
    }

}