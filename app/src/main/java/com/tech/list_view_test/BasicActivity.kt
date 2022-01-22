package com.tech.list_view_test

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.google.android.play.core.appupdate.AppUpdateManager
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.install.model.AppUpdateType
import com.google.android.play.core.install.model.UpdateAvailability
import hotchemi.android.rate.AppRate

class BasicActivity : AppCompatActivity() {

    private  var appUpdate : AppUpdateManager? = null
    private  val REQUEST_CODE = 100

    override fun onBackPressed() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Leaving so soon ?")

        builder.setPositiveButton("Yes",{ dialogInterface: DialogInterface, i: Int ->
            finish()
        })
        builder.setNegativeButton("No",{ dialogInterface: DialogInterface, i: Int -> })

        builder.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)

        appUpdate = AppUpdateManagerFactory.create(this)
        checkUpdate()

        //======== Automatic Rate App Dialog

        AppRate.with(this)
            .setInstallDays(1)
            .setLaunchTimes(2)
            .setRemindInterval(2)
            .monitor()

        AppRate.showRateDialogIfMeetsConditions(this)
        AppRate.with(this).clearAgreeShowDialog()
        AppRate.with(this).shouldShowRateDialog()

        //========
    }

    override fun onResume() {
        super.onResume()
        inProgressUpdate()
    }

    fun inProgressUpdate(){
        appUpdate?.appUpdateInfo?.addOnSuccessListener { updateInfo ->
            if(updateInfo.updateAvailability() == UpdateAvailability.DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS)
            {
                appUpdate?.startUpdateFlowForResult(updateInfo, AppUpdateType.IMMEDIATE, this, REQUEST_CODE)
            }
        }
    }

    fun checkUpdate(){
        appUpdate?.appUpdateInfo?.addOnSuccessListener { updateInfo ->
            if(updateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE
                && updateInfo.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE))
            {
                appUpdate?.startUpdateFlowForResult(updateInfo, AppUpdateType.IMMEDIATE, this, REQUEST_CODE)
            }

        }
    }

    fun Sundar_Gutka(view: android.view.View) {
        val intent=Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun open_sikhism(view: android.view.View) {
        val intent=Intent(this, MainSikhism::class.java)  // MainSikhism is the name of the activity in which we want to go.
        startActivity(intent)
    }

    fun open_quotes(view: android.view.View) {
        val intent=Intent(this, MainQuotes::class.java)  // MainQuotes is the name of the activity in which we want to go.
        startActivity(intent)

    }

    fun open_gurus(view: android.view.View) {

        val intent=Intent(this, MainSikh_Gurus::class.java)  // Sikh gurus activity
        startActivity(intent)
    }
}


