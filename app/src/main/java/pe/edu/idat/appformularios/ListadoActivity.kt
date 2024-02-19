package pe.edu.idat.appformularios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import pe.edu.idat.appformularios.databinding.ActivityListadoBinding
import android.R

class ListadoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListadoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityListadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaPersonas=intent.getSerializableExtra("listapersonas") as ArrayList<String>

        val adapter = ArrayAdapter(applicationContext, R.layout.simple_list_item_1, listaPersonas )

        binding.lvpersonas.adapter=adapter

    }
}