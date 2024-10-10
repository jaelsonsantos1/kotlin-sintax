import java.util.Scanner

//Questão 03: Escreva um programa que leia a altura de 03 pessoas e calcule a média.

fun main() {

    var alturas: Array<Int> = Array(3) {0}
    var scan = Scanner(System.`in`)

    for (i in 0..2) {
        print("Digite a ${i}° altura: ")
        alturas[i] = scan.nextInt()
    }

    print(String.format("A média das alturas foi %.2f.", calculateAvg(alturas)))
}
fun maxNum(): Int {
    var result: Double = 0.0
    for (i in nums) { result += i }

    return result/3
}
