package br.com.siecola.androidproject01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import br.com.siecola.androidproject01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSave.setOnClickListener {
            Log.d("MainActivity","Save button pressed")

            if(binding.edtName.text.isNotEmpty()){
                binding.txtDescription.text = binding.edtDescription.text
                binding.txtPrice.text = binding.edtPrice.text
                binding.txtName.text = binding.edtName.text
                binding.txtCode.text = binding.edtCode.text
            }else{
                Toast.makeText(this, "Please, enter the name.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
