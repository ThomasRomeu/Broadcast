package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ModeAirPlanerReciever: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isModelAirPlane = intent?.getBooleanExtra("state", false)

        if (isModelAirPlane == true){
            Toast.makeText(context, "Modo avion Activado", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context, "Modo avion Desactivado", Toast.LENGTH_SHORT).show()
        }
    }
}