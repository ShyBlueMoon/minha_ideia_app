package luana.silva.appminhaideia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import luana.silva.appminhaideia.databinding.ActivityBoasVindasBinding
import luana.silva.appminhaideia.databinding.ActivityMainBinding

class BoasVindasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBoasVindasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBoasVindasBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}