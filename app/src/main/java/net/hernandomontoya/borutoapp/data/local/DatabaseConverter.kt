package net.hernandomontoya.borutoapp.data.local

import androidx.room.TypeConverter

class DatabaseConverter {

    private val separator = ","

    @TypeConverter
    fun convertListToString(list: List<String>): String {
        val strBuilder = StringBuilder()
        for (item in list) {
            strBuilder.append(item).append(separator)
        }

        strBuilder.setLength(strBuilder.length - separator.length)
        return strBuilder.toString()
    }

    @TypeConverter
    fun convertStringToList(string: String): List<String> {
        return string.split(separator)
    }
}