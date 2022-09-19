package luana.silva.appminhaideia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Log.i(TAG, "$splashActivityLog oncreate iniciado")

        handlerTrocaDeTela()
    }

    override fun onRestart() {
        super.onRestart()


    }

    companion object {

        private const val TAG = "AVISOSLog"
        private const val splashActivityLog = "SPLASHACTIVITY:: "
    }

    fun handlerTrocaDeTela() {
        Handler(Looper.getMainLooper()).postDelayed({
            fun trocarTela() {

                Log.i(TAG, "$splashActivityLog esperando trocar de tela")
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
            trocarTela()
        }, 3000)
    }
}