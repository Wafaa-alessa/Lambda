package com.example.lambda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data class Player(val name: String, val age: Int, val hight: Int)

        fun main() {
            ////1 lambda
            val addmessage = { println("You win in this phase") }
            addmessage()
            //function
            fun addmessage() {
                println("You win in this phase")
            }
            ////2-1 lambda
            val day = { name: String -> println("Happy day $name") }
            day("wafaa")
            //fun
            fun day(name: String) {
                println("Happy day $name")
            }
            day("wafaa")
            ////2-2 lambda
            val user = { name: String, age: Int -> println("Enter your  $name and $age") }
            user("wafaa", 23)
            //fun
            fun user(name: String, age: Int) {
                println("Enter your $name and $age")
            }
            user("wafaa", 23)
            ////3-1 lambda
            val returnCalc = { x: Int, y: Int -> x + y }
            println(returnCalc(2, 4))
            //fun
            fun returnCalcFun(x: Int, y: Int): Int {
                return x + y
            }
            ////3-2 lambda
            val returnOperator = { x: Int, y: Int, z: Int -> x * y / z }
            println(returnOperator(1, 3, 5))
            //fun
            fun returnOperator(x: Int, y: Int, z: Int): Int {
                return x * y / z
            }
            //// data class
            val playerD = listOf(
                Player("Bob", 10, 166),
                Player("Sara", 20, 167),
                Player("Jane", 30, 178),
                Player("adfa", 40, 190),
                Player("Fred", 50, 188),
                Player("Bary", 60, 155),
                Player("Sary", 70, 144),
                Player("Jano", 80, 151),
                Player("ada", 90, 160),
                Player("Fredo", 22, 161),
                Player("Boby", 23, 162),
                Player("Saral", 24, 172),
                Player("Janey", 25, 175),
                Player("ady", 26, 177),
                Player("Fre", 46, 174),
                Player("Bo", 57, 160),
                Player("Sar", 24, 166),
                Player("Jan", 21, 150),
                Player("adm", 29, 141),
                Player("Frank", 33, 155)
            )
            val player = playerD.sortedBy { it.age }  // it replaces highScores -> highScores.score
            println("${player}")
        }
    }
}