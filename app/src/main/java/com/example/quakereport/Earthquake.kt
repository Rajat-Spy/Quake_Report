package com.example.quakereport

class Earthquake(
    var mMagnitude: Double,
    var mLocation: String,
    var mTimeInMiliseconds: Long,
    var url: String
) {

    fun getmMagnitude(): Double {
        return mMagnitude
    }

    fun setmMagnitude(mMagnitude: Double) {
        this.mMagnitude = mMagnitude
    }

    fun getmLocation(): String {
        return mLocation
    }

    fun setmLocation(mLocation: String) {
        this.mLocation = mLocation
    }

    fun getmTimeInMiliseconds(): Long {
        return mTimeInMiliseconds
    }

    fun setmDate(mTimeInMiliseconds: Long) {
        this.mTimeInMiliseconds = mTimeInMiliseconds
    }
}