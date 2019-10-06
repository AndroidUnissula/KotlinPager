package com.example.kotlinpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fragmentManager: androidx.fragment.app.FragmentManager): FragmentPagerAdapter(fragmentManager) {

    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
        SampulFragment(),
        SatuFragment(),
        DuaFragment(),
        TigaFragment(),
        EmpatFragment(),
        LimaFragment(),
        EnamFragment(),
        TujuhFragment()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

}

