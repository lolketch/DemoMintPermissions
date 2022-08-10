package com.example.myapplication

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import ru.mintrocket.lib.mintpermissions.ext.initMintPermissions

@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        initMintPermissions()
    }
}