import java.lang.NullPointerException
import java.util.*

fun main(){
    var DHM = DigitalHouseManager()
    var scanner = Scanner(System.`in`)
    var opcaoMenuPrincipal:Int = -1
    var menuAluno: Int
    var menuProfessor: Int
    var menuCurso:Int
    var menuMatricula:Int = -1

    //Funcao para Criação das instancias da atividade J
    instanciaPreCriadas(DHM)


    while (opcaoMenuPrincipal != 0) {
        opcaoMenuPrincipal = menuPrincipal()
        println(opcaoMenuPrincipal)
        when{
            opcaoMenuPrincipal == 1 -> {
                menuAluno = menuAluno()
                if(menuAluno == 1){
                    try {
                        print("Digite o nome do Aluno:")
                        var nomeAluno: String = scanner.next()
                        print("Digite o sobrenome do Aluno:")
                        var sobreNomeAluno: String = scanner.next()
                        println("Digite o Código do Aluno: ")
                        var codigoAluno: Int = scanner.nextInt()
                        DHM.cadastrarAluno(nomeAluno, sobreNomeAluno, codigoAluno)
                    }catch (e:Exception){
                        println("Não foi possivel cadastrar o Aluno")
                    }
                }
                //Em excluir aluno tudo funciona mas retorna a exception apesar da operacao ter sido efetuada
                else if(menuAluno == 2){
                    try{
                        println("Digite o código do Aluno:")
                        var codigoAluno: Int = scanner.nextInt()
                        DHM.excluirAluno(codigoAluno)
                    }catch (e:Exception){
                        println("Não foi possivel Excluir Aluno")
                    }
                }else if(menuAluno == 3){
                    try{
                        println("Digite o código do Aluno:")
                        var codigoAluno: Int = scanner.nextInt()
                        DHM.dadosAluno(codigoAluno)
                    }catch (e:Exception){
                        println("Não foi possivel consultar Aluno")
                    }
                }
                println("Voltando ao Menu Principal")
            }

            opcaoMenuPrincipal == 2 -> {
                menuProfessor = menuProfessor()
                if(menuProfessor == 1){
                    try{
                        print("Digite o nome do Professor:")
                        var nomeProfessor: String = scanner.next()
                        print("Digite o sobrenome do Professor:")
                        var sobreNomeProfessor: String = scanner.next()
                        println("Digite o Código do Professor: ")
                        var codigoProfessor: Int = scanner.nextInt()
                        println("Escolha uma opção:")
                        println("1 - Professor Titular")
                        println("2 - Professor Adjunto")
                        var varianteProfessor:Int = scanner.nextInt()
                        if(varianteProfessor == 1){
                            println("Escreva a especialidade do professor titular")
                            var especialidade:String = scanner.next()
                            DHM.registrarProfessorTitular(nomeProfessor, sobreNomeProfessor,codigoProfessor,especialidade)
                        }else if(varianteProfessor == 2){
                            println("Escreva as horas a se cumprir do professor Adjunto")
                            var horasAdjunto:Int = scanner.nextInt()
                            DHM.registrarProfessorAdjunto(nomeProfessor, sobreNomeProfessor,codigoProfessor,horasAdjunto)
                        }
                    }catch(e:Exception){
                        println("Não foi possivel cadastrar professor")
                    }
                }
                else if(menuProfessor == 2){
                    try{
                        println("Digite o código do professor")
                        var codProfessor = scanner.nextInt()
                        DHM.excluirProfessor(codProfessor)
                    }catch (e:Exception){
                        println("Não foi possivel excluir professor")
                    }
                }else if(menuProfessor == 3){
                    try{
                        println("Digite o código do Professor:")
                        var codigoProfessor: Int = scanner.nextInt()
                        DHM.dadosProfessor(codigoProfessor)
                    }catch (e:Exception){
                        println("Não foi possivel consultar Professor")
                    }
                }
                println("Retornando ao Menu Principal")
            }

            opcaoMenuPrincipal == 3 -> {
                menuCurso = menuCurso()
                if(menuCurso == 1){
                    try {
                        println("Digite o nome do Curso: ")
                        var nomeCurso: String = scanner.next()
                        println("Digite o Codigo do Curso: ")
                        var codigoCurso: Int = scanner.nextInt()
                        println("Digite a quantidade maxima de Alunos: ")
                        var qtdeMaxAlunos: Int = scanner.nextInt()
                        DHM.registrarCurso(nomeCurso, codigoCurso, qtdeMaxAlunos)
                    }catch (e:Exception){
                        println("Não foi possivel registrar curso")
                    }
                }else if(menuCurso == 2){
                    try{
                        println("Digite o código do Curso")
                        var codCurso = scanner.nextInt()
                        DHM.excluirCurso(codCurso)
                    }catch (e:Exception){
                        println("Não foi possivel excluir Curso")
                    }
                }else if(menuCurso == 3){
                    try{
                        println("Digite o código do Curso: ")
                        var codCurso = scanner.nextInt()
                        println("Digite o código do professor Adjunto: ")
                        var codProAdj = scanner.nextInt()
                        println("Digite o código do professor Titular: ")
                        var codProTit = scanner.nextInt()
                        DHM.alocarProfessores(codCurso, codProAdj, codProTit)
                    }catch (e:Exception){
                        println("Não foi Possivel alocar professores no curso")
                    }
                }else if(menuCurso == 4){
                    try{
                        println("Digite o código do Curso: ")
                        var codCurso = scanner.nextInt()
                        DHM.dadosCurso(codCurso)
                    }catch (e:Exception){
                        println("Não foi Possivel consultar curso")
                    }
                }
                println("Voltando ao Menu Principal")
            }

            opcaoMenuPrincipal == 4 -> {
                println("Digite o código do Curso: ")
                var codCurso = scanner.nextInt()
                println("Digite o código do Aluno: ")
                var codAluno = scanner.nextInt()
                DHM.matricularAluno(codAluno, codCurso)
                println("Voltando ao Menu Principal")
            }
        }
    }
    println("Muito Obrigado!")
}

fun pularLinha(){
    println("/---------------------------------/")
}

fun menuPrincipal():Int{
    var scanner = Scanner(System.`in`)
    var opcao = -1
    pularLinha()
    while(opcao < 0 || opcao > 4){
        print("Olá, bem vindo ao Digital House! ")
        println("Selecione uma das opções abaixo:")
        println("1 - Aluno")
        println("2 - Professor")
        println("3 - Curso")
        println("4 - Matricula")
        println("0 - Sair")
        opcao = scanner.nextInt()
        if(opcao < 0 || opcao > 4){
            opcao = -1
            println("OPÇÃO INVALIDA NO MENU PRINCIPAL!")
        }
    }
    return opcao
}

fun menuAluno():Int{
    var scanner = Scanner(System.`in`)
    var opcao = -1
    pularLinha()
    while(opcao < 0 || opcao > 4) {
        println("Menu Aluno")
        println("1 - Cadastrar Aluno")
        println("2 - Excluir Aluno")
        println("3 - Consultar Aluno")
        println("4 - Voltar ao Menu Principal")
        opcao = scanner.nextInt()
        if (opcao < 0 || opcao > 4) {
            opcao = -1
            println("OPÇÃO INVALIDA NO MENU ALUNO!")
        }
    }
    return opcao
}

fun menuProfessor():Int{
    var scanner = Scanner(System.`in`)
    var opcao = -1
    pularLinha()
    while(opcao < 0 || opcao > 4 || opcao == null) {
        println("Menu Professor")
        println("1 - Cadastrar Professor")
        println("2 - Excluir Professor")
        println("3 - Consultar Professor")
        println("4 - Voltar ao Menu Principal")
        opcao = scanner.nextInt()
        if (opcao < 0 || opcao > 4 || opcao == null) {
            opcao = -1
            println("OPÇÃO INVALIDA NO MENU PROFESSOR!")
        }
    }
    return opcao
}

fun menuCurso():Int{
    var scanner = Scanner(System.`in`)
    var opcao = -1
    pularLinha()
    while(opcao < 0 || opcao > 5 || opcao == null) {
        println("Menu Curso")
        println("1 - Cadastrar Curso")
        println("2 - Excluir Curso")
        println("3 - Alocar Professores")
        println("4 - Consultar Curso")
        println("5 - Voltar ao Menu Principal")
        opcao = scanner.nextInt()
        if (opcao < 0 || opcao > 5 || opcao == null) {
            opcao = -1
            println("OPÇÃO INVALIDA NO MENU CURSO!")
        }
    }
    return opcao
}

fun instanciaPreCriadas(DHM:DigitalHouseManager){
    //PARTE J - Pré Criei as instancias de das Atividades para ajudar nos testes
    DHM.cadastrarAluno("Leandro", "Sena", 1)
    DHM.cadastrarAluno("Leandro", "Sena", 2)
    DHM.cadastrarAluno("Leandro", "Sena", 3)
    DHM.cadastrarAluno("Leandro", "Sena", 4)
    DHM.cadastrarAluno("Leandro", "Sena", 5)

    //Atividade 2
    DHM.registrarProfessorAdjunto("Teste Adjunto Nome", "Teste Titular Sobrenome", 1,5)
    DHM.registrarProfessorTitular("Teste Titular Nome", "Teste Titular Sobrenome", 2, "Biologia")

    DHM.registrarProfessorAdjunto("Teste Adjunto Nome", "Teste Titular Sobrenome", 3,10)
    DHM.registrarProfessorTitular("Teste Titular Nome", "Teste Titular Sobrenome", 4, "Historia")

    //Atividade 3
    DHM.registrarCurso("FullStack", 20001, 3)
    DHM.registrarCurso("Android", 20002, 2)

    //Atividade 4
    DHM.alocarProfessores(20001,1,2)
    DHM.alocarProfessores(20002,3,4)

    //Atividade 5
    DHM.matricularAluno(1, 20001)
    DHM.matricularAluno(2, 20001)
    DHM.matricularAluno(3, 20002)
    DHM.matricularAluno(4, 20002)
    DHM.matricularAluno(5, 20002)
    //FIM PARTE J
}