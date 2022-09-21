package luana.silva.appminhaideia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import luana.silva.appminhaideia.databinding.ActivityBoasVindasBinding
import android.content.Intent
import luana.silva.appminhaideia.MainActivity.Companion.NOME_USUARIO
import luana.silva.appminhaideia.databinding.ActivityMainBinding

class BoasVindasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBoasVindasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBoasVindasBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Capturar a intent e extrair a string de Nome
        val mostrarNome = intent.getStringExtra(NOME_USUARIO)
        //Captura o layout da TextView(nameViewBox) e põe o string como seu texto
        val textView = findViewById<TextView>(R.id.nameViewBox).apply {
            text = mostrarNome

        }
    }

    // Get the Intent that started this activity and extract the string

}