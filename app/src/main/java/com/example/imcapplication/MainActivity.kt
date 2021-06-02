package com.example.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.w("Lifecycle",  "CREATE - Estou criando o app para você!")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.w("Lifecycle",  "START - Deixei o app visível para você!")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Lifecycle",  "RESUME - Agora você pode interagir com o app!")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Lifecycle",  "PAUSE - O app está em segundo plano")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Lifecycle",  "STOP - O app não está mais visível mais aida existe!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Lifecycle",  "DESTROY - O app foi encerrado")
    }
}