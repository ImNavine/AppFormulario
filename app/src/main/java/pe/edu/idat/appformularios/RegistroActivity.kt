package pe.edu.idat.appformularios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import pe.edu.idat.appformularios.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnlistar.setOnClickListener(this)
        binding.btnregistrar.setOnClickListener(this)
    }
    override fun onClick(vista: View) {
        when (vista.id) {
            R.id.btnregistrar -> registrarPersona()
            R.id.btnlistar -> startActivity(Intent(applicationContext,
                                                ListadoActivity::class.java))
        }
    }
    fun registrarPersona(){
        Toast.makeText(applicationContext, "Click en Registro de persona",
            Toast.LENGTH_LONG).show()
    }
}