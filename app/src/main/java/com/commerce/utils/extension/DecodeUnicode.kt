package com.commerce.utils.extension

fun decode(text: String): String {
    var working = text
    var index: Int
    index = working.indexOf("\\u")
    while (index > -1) {
        val length = working.length
        if (index > length - 6) break
        val numStart = index + 2
        val numFinish = numStart + 4
        val substring = working.substring(numStart, numFinish)
        val number = substring.toInt(16)
        val stringStart = working.substring(0, index)
        val stringEnd = working.substring(numFinish)
        working = stringStart + number.toChar() + stringEnd
        index = working.indexOf("\\u")
    }
    return working
}