fun main() {
    // Preparativos para a versão do Curso 2 Kotlin
    var conta = Conta("Moralez", 1000)
   // var conta = Conta(numero = 1000, titular = "Moralez") // inicialização utilizando labels (Named Arguments)
//    conta.titular = "Moralez"
//    conta.numero = 1000
    conta.depositar(200.0)

    println("Titular: ${conta.titular}") // *** command + d replica a linha ***
    println("Número: ${conta.numero}")
    println("Saldo: ${conta.saldo}")

    println("- realizando deposito  55.0 -")

    conta.depositar(55.0)
    println("Titular: ${conta.titular}") // *** command + d replica a linha ***
    println("Número: ${conta.numero}")
    println("Saldo: ${conta.saldo}")
}

class Conta(
    val titular: String, val numero: Int
    ) {
    var saldo = 0.0
        private set(valor){
            if(valor > 0) {
                field = valor
            }
        }

    init {
        // Executa alguma coisa durante a construção
    }

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }
    fun sacar(valor: Double): Double {
        if (saldo >= valor) {
            saldo -= valor
            return valor
        }
        return 0.0
    }

    fun depositar(valor: Double) {
        if(valor > 0){
            saldo += valor
        }
    }

    fun transferir(contaDestino: Conta, valor: Double) {
        contaDestino.depositar(sacar(valor))
    }

    // no Kotlin não é muito idiomático utilizar a abordagem de getters e setters
//    fun getSaldo(): Double {
//        return saldo
//    }

}

fun realizaTestesGerais() {
    println("Bem vindo ao teste maroto!")


    val titular = "Juarez"  // var é mutável e val é imutável
    val numeroConta = 1000
    var saldo = 0.0

    saldo += 100.0
    saldo -= 1000.0

    println("Nome Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo da conta: $saldo")

    testaCondicoes(saldo)
}

fun testaCondicoes(saldo: Double) {
//    if (saldo > 0.0){
//        println("Conta é positiva")
//    } else if (saldo == 0.0){
//        print("Conta é neutra")
//    } else {
//        print("Conta é negativa")
//    }
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> print("Conta é neutra")
        else -> print("Conta é negativa")
    }
}