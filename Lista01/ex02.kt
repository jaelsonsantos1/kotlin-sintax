import java.util.Scanner

//Questão 02: Escreva um programa que leia um número e determine se ele é par ou
//ímpar.

fun main() {

    print("Digite um número: ")
    var num: Int = Scanner(System.`in`).nextInt()

    println("Este número é: " + if (isEvenOrOdd(num)) "Par" else "Impar")
}

fun isEvenOrOdd(num: Int): Boolean { return num%2==0 }