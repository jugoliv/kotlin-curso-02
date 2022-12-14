fun main() {
    println("Bem vindo ao Bytebank\n")

    val alex = Funcionario(nome = "Alex",
            cpf = "111.111.111-11",
            salario = 1000.0)

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("Bonificação ${alex.bonificacao()}")

    val fran = Gerente(nome = "Fran",
            cpf = "222.222.222-22",
            salario = 2000.0,
            senha = 1234)

    println("\nnome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("Bonificação ${fran.bonificacao()}")

    if(fran.autentica(1234)){
        println("Autenticação com sucesso!")
    } else {
        println("*** Falha na autenticação ***")
    }
}