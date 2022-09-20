package diana.solei.design.viewmodelcodingchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import diana.solei.design.viewmodelcodingchallenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(124)
        viewModel = ViewModelProvider(this, viewModelFactory)[MainActivityViewModel::class.java]
        binding.textView.text = viewModel.getCounter().toString()
        binding.addButton.setOnClickListener {
            viewModel.increaseCounter(Integer.parseInt(binding.editTextTextPersonName.text.toString()))
            binding.textView.text = viewModel.getCounter().toString()
        }

    }
}