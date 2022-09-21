package luana.silva.appminhaideia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import luana.silva.appminhaideia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i(TAG, "$mainActivityLog oncreate iniciado")

        configurarSendNameListener()
    }





    private fun configurarSendNameListener() {
        binding.btnSendName.setOnClickListener {
            startActivity(Intent(this,BoasVindasActivity::class.java))
            salvarNome()
        }
    }

    fun salvarNome() {
        binding.apply {
            val nomeUsuario = nameTypeHere.text.toString()

            if(nomeUsuario.isEmpty()) {
                nameTypeHere.error = getString(R.string.err_sem_nome)
            } else {
                nameTypeHere.error = null
            }

            if(nomeUsuario.isNotEmpty()) {
                Toast.makeText(applicationContext, "Seu nome é $nomeUsuario", Toast.LENGTH_LONG).show()
                val intentSendName = Intent(this@MainActivity, BoasVindasActivity::class.java)
                intentSendName.putExtra(NOME_USUARIO, nomeUsuario)
                startActivity(intentSendName)
            }
        }

    }

    companion object {
        private const val TAG = "AVISOSLog"
        private const val mainActivityLog = "MAINACTIVITY:: "
        const val NOME_USUARIO = "luana.silva.appminhaideia"


    }


}