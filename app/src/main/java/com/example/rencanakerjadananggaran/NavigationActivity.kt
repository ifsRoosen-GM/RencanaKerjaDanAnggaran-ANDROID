package com.example.rencanakerjadananggaran

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.rencanakerjadananggaran.databinding.ActivityNavigationBinding
import com.example.rencanakerjadananggaran.util.SharedPreferences

class NavigationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_navigation)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_pengajuan, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        navView.setOnItemSelectedListener {

            if (it.itemId == R.id.navigation_pengajuan){
                val s = SharedPreferences(this)
                if (s.getIsLogin()){
                    Log.d("TAG", "Sudah Login")
                }else{
                    Log.d("TAG", "Belum Login, Pindah ke menu login")
                }

            }else{
                Log.d("TAG", "onCreate: yang lain" + it.itemId)
            }
            return@setOnItemSelectedListener true

        }
    }
}