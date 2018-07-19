package com.e.viewpagersinglefragmentkotlin

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

private const val MAX_VALUE = 200

// 1
class MoviesPagerAdapter(fragmentManager: FragmentManager, private val movies: ArrayList<Movie>) :
        FragmentStatePagerAdapter(fragmentManager) {

    // 2
    override fun getItem(position: Int): Fragment {
        return MovieFragment.newInstance(movies[position % movies.size])
    }

    // 3
    override fun getCount(): Int {
        return movies.size * MAX_VALUE
    }

    override fun getPageTitle(position: Int): CharSequence {
        return movies[position % movies.size].title
    }
}