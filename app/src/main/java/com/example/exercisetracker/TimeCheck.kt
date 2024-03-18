package com.example.exercisetracker

class TimeCheck {
    fun validHours(hour: String): Boolean {
        if(Integer.parseInt(hour) <24 && Integer.parseInt(hour)>=0)
        {
            return true
        } else{
            return false
        }
    }

    fun validMinutes(minutes: String): Boolean {
        if(Integer.parseInt(minutes) <60 && Integer.parseInt(minutes)>=0)
        {
            return true
        } else{
            return false
        }
    }

    fun validSeconds(seconds: String): Boolean {
        if(Integer.parseInt(seconds) <24 && Integer.parseInt(seconds)>=0)
        {
            return true
        } else{
            return false
        }
    }
}