package com.aio2ray.mobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.aio2ray.mobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // استفاده از ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // تنظیم زبان بر اساس سیستم (۲ زبانه)
        // Android به صورت خودکار از values/ و values-fa/ استفاده می‌کند
        
        // رویدادهای دکمه‌ها (نمونه)
        binding.btnConnect.setOnClickListener {
            // کد اتصال به سرور V2Ray/Xray
            // V2RayController.init(...)
        }

        binding.btnDisconnect.setOnClickListener {
            // کد قطع اتصال
        }

        binding.btnSettings.setOnClickListener {
            // باز کردن تنظیمات
        }
    }
}
