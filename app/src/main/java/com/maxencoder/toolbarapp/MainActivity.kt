package com.maxencoder.toolbarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.maxencoder.toolbarapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Admin"

        bind.bNav.selectedItemId = R.id.send

        bind.bNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.open -> {Toast.makeText(this, "Open", Toast.LENGTH_SHORT).show()}
                R.id.send -> {Toast.makeText(this, "Send", Toast.LENGTH_SHORT).show()}
                R.id.select -> {Toast.makeText(this, "Select", Toast.LENGTH_SHORT).show()}
                R.id.receiv -> {Toast.makeText(this, "Receiv", Toast.LENGTH_SHORT).show()}
            }
            true
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
            R.id.sync -> {
                Toast.makeText(this, "Sync", Toast.LENGTH_SHORT).show()

            }
            R.id.save -> {
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()

            }
            R.id.search -> {
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()

            }
            R.id.delete -> {
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show()

            }

        }

        if (item.itemId == android.R.id.home ) {
            finish()
        }

        return true
    }
}