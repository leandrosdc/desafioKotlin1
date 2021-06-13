import java.time.LocalDate

class DigitalHouseManager{

    var alunos = mutableListOf<Aluno>()
    var professores = mutableListOf<Professor>()
    var cursos = mutableListOf<Curso>()
    var matriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome:String, codigo:Int, quantidadeMaxAluno:Int){
        cursos.add(Curso(nome, codigo, quantidadeMaxAluno))
        println("Curso Registado")
    }

    fun excluirCurso(codigoCurso:Int){
        var retorno:String = "Curso não encontrado"
        cursos.forEach{
            if(it.codigoCurso == codigoCurso){
                cursos.remove(it)
                retorno = "Curso Excluido com Sucesso"
            }
        }
        println(retorno)
    }

    fun dadosCurso(codCurso: Int) {
        var retorno: String = "Curso não encontrado"
        cursos.forEach {
            if (it.codigoCurso == codCurso) {
                println("CONSULTA EFETUADA: Nome: ${it.nomeCurso}, Codigo: ${it.codigoCurso}, Alunos Matriculados: ${it.qtdeAlunos}, Lotacao: ${it.quantidadeMaxAluno}, Professor Adjunto: ${it.professorAdjunto?.nomeProfessor}, Professor titular: ${it.professorTitular?.nomeProfessor}")
                println("Alunos nesse curso: ")
                it.listaAlunos.forEach{
                    println("${it.nomeAluno} ${it.sobrenomeAluno}, Codigo: ${it.codigoAluno}")
                }
                retorno = ""
            }
        }
        println(retorno)
    }

    fun cadastrarAluno(nome:String, sobrenome:String, codigo:Int){
        alunos.add(Aluno(nome,sobrenome,codigo))
        println("Aluno Cadastrado com Sucesso")
    }

    fun excluirAluno(codAluno:Int){
        var retorno:String = "Aluno não encontrado"
        alunos.forEach{
            if(it.codigoAluno == codAluno){
                alunos.remove(it)
                retorno = "Aluno Excluido com Sucesso"
            }
        }
        println(retorno)
    }

    fun dadosAluno(codAluno: Int) {
        var retorno: String = "Aluno não encontrado"
        alunos.forEach {
            if (it.codigoAluno == codAluno) {
                println("CONSULTA EFETUADA: ${it.nomeAluno} ${it.sobrenomeAluno}, codigo ${it.codigoAluno}")
                retorno = ""
            }
        }
        println(retorno)
    }

    fun registrarProfessorAdjunto(nomeProfessor:String, sobrenomeProfessor:String, codigoProfessor:Int, horasMonitoria:Int){
        professores.add(Professor(nomeProfessor, sobrenomeProfessor, codigoProfessor, horasMonitoria))
        println("Professor Registrado")
    }

    fun registrarProfessorTitular(nomeProfessor:String, sobrenomeProfessor:String, codigoProfessor:Int, especialidade:String){
        professores.add(Professor(nomeProfessor, sobrenomeProfessor, codigoProfessor, especialidade))
        println("Professor Registrado")
    }

    fun excluirProfessor(codigoProfessor: Int){
        var retorno: String = "Professor não encontrado"
        professores.forEach{
            if(it.codigoProfessor == codigoProfessor){
                professores.remove(it)
                retorno = "Professor Excluido"
            }
        }
        println(retorno)
    }

    fun dadosProfessor(codProfessor: Int) {
        var retorno: String = "Professor não encontrado"
        professores.forEach {
            if (it.codigoProfessor == codProfessor) {
                println("CONSULTA EFETUADA: ${it.nomeProfessor} ${it.sobrenomeProfessor}, codigo ${it.codigoProfessor}")
                retorno = ""
            }
        }
        println(retorno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso:Int){
        var aluno1:Aluno? = null
        var curso1:Curso? = null
        alunos.forEach{ if(codigoAluno == it.codigoAluno){ aluno1 = it } }
        cursos.forEach{ if(codigoCurso == it.codigoCurso){ curso1 = it } }
        if(curso1?.salaLotada() == false){
            matriculas.add(Matricula(aluno1, curso1, LocalDate.now()))
            //DESCULPA, NAO CONSEGUI FAZER FUNCIONAR SEM O !! , PERDOA ESSA SHAUSHAUSHSAU
            curso1!!.adicionarUmAluno(aluno1)
            println("Matricula Realizada")
        }else{
            println("Não foi possivel realizar a matricula devido a sala Lotada")
        }
    }

    fun alocarProfessores(codigoCurso:Int, codigoProfessorAdjunto: Int, codigoProfessorTitular: Int){
        var resposta:String = "Não foi possivel alocar professores"
        var profadj:Professor? = null
        var proftit:Professor? = null
        professores.forEach{ if(it.codigoProfessor == codigoProfessorAdjunto){ profadj = it } }
        professores.forEach{ if(it.codigoProfessor == codigoProfessorTitular){ proftit = it } }
        cursos.forEach{
            if(it.codigoCurso == codigoCurso){
                it.professorTitular = proftit
                it.professorAdjunto = profadj
                resposta = "Professores Alocados"
            }
        }
        println(resposta)
    }
}