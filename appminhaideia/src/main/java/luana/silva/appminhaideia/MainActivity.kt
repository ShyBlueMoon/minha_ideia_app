package luana.silva.appminhaideia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import luana.silva.appminhaideia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i(TAG, "$mainActivityLog oncreate iniciado")

        configurarListeners()
    }

    private fun configurarListeners() {
        configurarSendNameListener()
    }

    private fun configurarSendNameListener() {
        binding.btnSendName.setOnClickListener {
            startActivity(Intent(this,BoasVindasActivity::class.java))
            salvarNome()
        }
    }

    private fun salvarNome() {
        val nomeUsuario = binding.name.text.toString()

        if(nomeUsuario.isEmpty()) {
            binding.name.error = getString(R.string.err_sem_nome)

        } else {
            binding.name.error = null
        }
    }

    companion object {
        private const val TAG = "AVISOSLog"
        private const val mainActivityLog = "MAINACTIVITY:: "

    }


}