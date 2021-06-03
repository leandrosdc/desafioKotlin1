class DigitalHouseManager{
    var alunos = mutableListOf<Aluno>()
    var professores = mutableListOf<Professor>()
    var cursos = mutableListOf<Curso>()
    var matriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome:String, codigo:Int, quantidadeAlunos:Int){
        cursos.add(Curso(nome, codigo, quantidadeAlunos))
    }

    fun excluirCurso(codigoCurso:Int){
        cursos.forEach{
            if(it.codigoCurso == codigoCurso){
                cursos.remove(it)
            }
        }
    }

    fun registrarProfessorAdjunto(nomeProfessor:String, sobrenomeProfessor:String, codigoProfessor:Int, horasMonitoria:Int){
        professores.add(professorAdjunto(nomeProfessor, sobrenomeProfessor, codigoProfessor, horasMonitoria))
    }

    fun registrarProfessorTitular(nomeProfessor:String, sobrenomeProfessor:String, codigoProfessor:Int, especialidade:String){
        professores.add(ProfessorTitular(nomeProfessor, sobrenomeProfessor, codigoProfessor, especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int){
        professores.forEach{
            if(it.codigoProfessor == codigoProfessor){
                professores.remove(it)
            }
        }
    }

    fun matricularAluno(nomeAluno:String, sobrenomeAluno:String, codigoAluno:Int){
        alunos.add(Aluno(nomeAluno,sobrenomeAluno, codigoAluno))
    }

    fun alocarProfessores(codigoCurso:Int, codigoProfessorAdjunto: Int, codigoProfessorTitular: Int){

    }
}