import java.util.Scanner

//Questão 01: Escreva um programa que calcule a idade do usuário. Para isso, o programa
//deve ler o ano de nascimento, o ano atual e depois mostrar na tela a idade. Obs.: O ano
//deve ser informado no formato AAAA (ex.: 1980).

fun main() {

    var scanner = Scanner(System.`in`)

    print("Ano de nascimento: ")
    var anoNasc: Int = scanner.nextInt()

    print("Ano atual: ")
    var anoAtual: Int = scanner.nextInt()

    println("Idade: ${anoAtual - anoNasc}")
}