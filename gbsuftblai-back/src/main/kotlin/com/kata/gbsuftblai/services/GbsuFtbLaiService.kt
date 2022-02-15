package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component
import java.util.stream.Collectors

@Component
class GbsuFtbLaiService {

    val divisionMap: Map<Int, String> = mapOf(3 to "Gbsu", 5 to "Ftb")
    val containersMap: Map<Int, String> = mapOf(3 to "Gbsu", 5 to "Ftb", 7 to "Lai")

    fun convertNumber(inputNumber: Int): String {
        val res = getResult(inputNumber, true) + getResult(inputNumber, false)
        return if ("".equals(res)) inputNumber.toString() else res
    }

    fun getResult(inputNumber: Int, isDivision: Boolean): String {
        return (if (isDivision) divisionMap else containersMap)
                .entries
                .stream()
                .map {
                    mapToStringValue(it, inputNumber, isDivision)
                }.collect(Collectors.toList())
                .joinToString("")
    }

    private fun mapToStringValue(it: Map.Entry<Int, String>, inputNumber: Int, isDivision: Boolean): String {
        if (isDivision && inputNumberIsDivisibleBy(inputNumber, it.key))
            return it.value
        else if (!isDivision && inputNumberContains(inputNumber, it.key)) {
            var res = ""
            //add pattern as many occurences as found
            for (i in 1..countMatches(inputNumber.toString(), it.key.toString()))
                res += it.value

            return res
        }

        return ""
    }

    fun inputNumberIsDivisibleBy(inputNumber: Int, i: Int): Boolean {
        return inputNumber % i == 0
    }

    fun inputNumberContains(inputNumber: Int, i: Int): Boolean {
        return i.toString() in inputNumber.toString()
    }

    /**
     * count string occurences in other string
     */
    fun countMatches(string: String, pattern: String): Int {
        var index = 0
        var count = 0

        while (true)
        {
            index = string.indexOf(pattern, index)
            index += if (index != -1)
            {
                count++
                pattern.length
            }
            else {
                return count
            }
        }
    }

}