package com.efp.vetterhealth

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView

    var fragHelp = FragmentHelp()
    var fragHome = FragmentHome()
    var fragPost = FragmentPost()
    var fragReminders = FragmentReminders()
    var fragSleepTracking = FragmentSleepTracking()




    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {

            R.id.navigation_home -> {

                replaceFragment(fragHome, R.id.main_fragment)

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_post -> {

                replaceFragment(fragPost, R.id.main_fragment)

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_sleep_tracking -> {

                replaceFragment(fragSleepTracking, R.id.main_fragment)

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_reminders -> {

                replaceFragment(fragReminders, R.id.main_fragment)

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_help -> {

                replaceFragment(fragHelp, R.id.main_fragment)

                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        replaceFragment(fragHome, R.id.main_fragment)

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

    fun AppCompatActivity.addFragment(fragment: Fragment, frameId: Int){
        supportFragmentManager.inTransaction { add(frameId, fragment) }
    }


    fun AppCompatActivity.replaceFragment(fragment: Fragment, frameId: Int) {
        supportFragmentManager.inTransaction{replace(frameId, fragment)}
    }

    inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
        beginTransaction().func().commit()
    }


}
