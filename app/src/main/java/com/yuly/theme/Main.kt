package com.yuly.theme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private val adapter = MainAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_menu.layoutManager = LinearLayoutManager(this)
        setupMenuItems()
        adapter.onItemClickListener = {
            val title = adapter.data[it]
            startActivity(Intent(this, ThemeActivity::class.java).putExtra("title", title))
        }
        rv_menu.adapter = adapter


    }

    private fun setupMenuItems() {
        adapter.data.add("Theme.AppCompat")
        adapter.data.add("Theme.AppCompat.DayNight")
        adapter.data.add("Theme.AppCompat.DayNight.DarkActionBar")
        adapter.data.add("Theme.AppCompat.DayNight.Dialog")
        adapter.data.add("Theme.AppCompat.DayNight.Dialog.Alert")
        adapter.data.add("Theme.AppCompat.DayNight.Dialog.MinWidth")
        adapter.data.add("Theme.AppCompat.DayNight.DialogWhenLarge")
        adapter.data.add("Theme.AppCompat.DayNight.NoActionBar")
        adapter.data.add("Theme.AppCompat.Dialog")
        adapter.data.add("Theme.AppCompat.Dialog.Alert")
        adapter.data.add("Theme.AppCompat.Dialog.MinWidth")
        adapter.data.add("Theme.AppCompat.DialogWhenLarge")

        adapter.data.add("Theme.AppCompat.Light")
        adapter.data.add("Theme.AppCompat.Light.DarkActionBar")
        adapter.data.add("Theme.AppCompat.Light.Dialog")
        adapter.data.add("Theme.AppCompat.Light.Dialog.Alert")
        adapter.data.add("Theme.AppCompat.Light.Dialog.MinWidth")
        adapter.data.add("Theme.AppCompat.Light.DialogWhenLarge")

        adapter.data.add("Theme.AppCompat.Light.NoActionBar")
        adapter.data.add("Theme.AppCompat.NoActionBar")

        adapter.data.add("Theme.Material")
        adapter.data.add("Theme.Material.Light")


    }

}

class ThemeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        createTheme(intent.getStringExtra("title"))
        setContentView(R.layout.activity_theme)
    }


    private fun createTheme(title: String?) {
        val theme: Int = when (title) {
            "Theme.AppCompat" -> R.style.Theme_AppCompat
            "Theme.AppCompat.DayNight" -> R.style.Theme_AppCompat_DayNight
            "Theme.AppCompat.DayNight.DarkActionBar" -> R.style.Theme_AppCompat_DayNight_DarkActionBar
            "Theme.AppCompat.DayNight.Dialog" -> R.style.Theme_AppCompat_DayNight_Dialog
            "Theme.AppCompat.DayNight.Dialog.Alert" -> R.style.Theme_AppCompat_DayNight_Dialog_Alert
            "Theme.AppCompat.DayNight.Dialog.MinWidth" -> R.style.Theme_AppCompat_DayNight_Dialog_MinWidth
            "Theme.AppCompat.DayNight.DialogWhenLarge" -> R.style.Theme_AppCompat_DayNight_DialogWhenLarge
            "Theme.AppCompat.DayNight.NoActionBar" -> R.style.Theme_AppCompat_DayNight_NoActionBar
            "Theme.AppCompat.Dialog" -> R.style.Theme_AppCompat_Dialog
            "Theme.AppCompat.Dialog.Alert" -> R.style.Theme_AppCompat_Dialog_Alert
            "Theme.AppCompat.Dialog.MinWidth" -> R.style.Theme_AppCompat_Dialog_MinWidth
            "Theme.AppCompat.DialogWhenLarge" -> R.style.Theme_AppCompat_DialogWhenLarge

            "Theme.AppCompat.Light" -> R.style.Theme_AppCompat_Light
            "Theme.AppCompat.Light.DarkActionBar" -> R.style.Theme_AppCompat_Light_DarkActionBar
            "Theme.AppCompat.Light.Dialog" -> R.style.Theme_AppCompat_Light_Dialog
            "Theme.AppCompat.Light.Dialog.Alert" -> R.style.Theme_AppCompat_Light_Dialog_Alert
            "Theme.AppCompat.Light.Dialog.MinWidth" -> R.style.Theme_AppCompat_Light_Dialog_MinWidth
            "Theme.AppCompat.Light.DialogWhenLarge" -> R.style.Theme_AppCompat_Light_DialogWhenLarge

            "Theme.AppCompat.Light.NoActionBar" -> R.style.Theme_AppCompat_Light_NoActionBar
            "Theme.AppCompat.NoActionBar" -> R.style.Theme_AppCompat_NoActionBar

            "Theme.Material" -> android.R.style.Theme_Material
            "Theme.Material.Light" -> android.R.style.Theme_Material_Light

            else -> 0
        }

        setTheme(theme)
    }
}
