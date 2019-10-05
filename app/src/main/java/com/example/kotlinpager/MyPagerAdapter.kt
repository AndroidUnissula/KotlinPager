package com.example.kotlinpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fragmentManager: androidx.fragment.app.FragmentManager): FragmentPagerAdapter(fragmentManager) {

    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
        SatuFragment(),
        DuaFragment(),
        TigaFragment()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "First Tab"
            1 -> "Second Tab"
            else -> "Third Tab"
        }
    }
}

