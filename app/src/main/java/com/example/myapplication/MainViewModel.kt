package com.example.myapplication

import android.Manifest
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.mintrocket.lib.mintpermissions.MintPermissionsController
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val permissionsController: MintPermissionsController
) : ViewModel() {

    fun requestPermission() {
        viewModelScope.launch {
            val requestPermissionResult = permissionsController.request(CAMERA_PERMISSION)
            val permissionStatus = permissionsController.get(CAMERA_PERMISSION)
            Log.e("MainViewModel", "${requestPermissionResult.status}")
            Log.e("MainViewModel", "$permissionStatus")
        }
    }

    companion object {
        const val CAMERA_PERMISSION = Manifest.permission.CAMERA
    }
}