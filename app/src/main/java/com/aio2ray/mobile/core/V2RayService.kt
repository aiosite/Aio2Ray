package com.aio2ray.mobile.core

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

/**
 * سرویس اصلی اتصال V2Ray/Xray
 * این سرویس بر پایه AndroidLibXrayLite و کدهای v2rayNG ساخته شده است
 */
class V2RayService : Service() {

    private lateinit var isConnected: Boolean

    override fun onCreate() {
        super.onCreate()
        Log.d("Aio2Ray", "V2Ray Service Created")
        isConnected = false
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // شروع اتصال یا قطع اتصال بر اساس دستور
        // V2RayController.init(this, R.drawable.ic_launcher, "Aio2Ray")
        Log.d("Aio2Ray", "V2Ray Service Started")
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Aio2Ray", "V2Ray Service Destroyed")
        // قطع اتصال
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}
