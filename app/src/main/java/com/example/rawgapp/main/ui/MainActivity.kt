package com.example.rawgapp.main.ui

import android.os.Bundle
import com.example.rawgapp.R
import com.example.rawgapp.common.basemvp.BaseActivity
import com.example.rawgapp.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val recyclerFragment = RecyclerFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        changeFragment(recyclerFragment, R.id.container)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        clearBackStack()
    }
}