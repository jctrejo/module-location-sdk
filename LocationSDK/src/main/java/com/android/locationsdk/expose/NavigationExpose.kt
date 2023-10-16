package com.android.locationsdk.expose

import android.app.Activity
import android.content.Intent
import com.android.locationsdk.ui.RootActivity

class NavigationExpose {

    companion object {
        const val KEY_NAVIGATION = "KEY_NAVIGATION"

        fun openLocationModule(activity: Activity){
            val intent = Intent(activity, RootActivity::class.java)
            activity.startActivity(intent)
        }
    }
}
