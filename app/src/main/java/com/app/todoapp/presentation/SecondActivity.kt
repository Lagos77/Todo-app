package com.app.todoapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.app.todoapp.databinding.ActivitySecondBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val navCon = Navigation.findNavController(this, R.id.fragment)
//        binding.bottomNav.setupWithNavController(navCon)

    }


}