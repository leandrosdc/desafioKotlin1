import java.time.LocalDate
import java.util.*

class DigitalHouseManager{
    var alunos = mutableListOf<Aluno>()
    var professores = mutableListOf<Professor>()
    var cursos = mutableListOf<Curso>()
    var matricula = mutableListOf<Matricula>()



    fun registrarCurso(nome:String, codigo:Int, quantidadeMaxAluno:Int){
        cursos.add(Curso(nome, codigo, quantidadeMaxAluno))
    }

    fun excluirCurso(codigoCurso:Int){
        cursos.forEach{
            if(it.codigoCurso == codigoCurso){
                cursos.remove(it)
            }
        }
    }

    fun registrarProfessorAdjunto(nomeProfessor:String, sobrenomeProfessor:String, codigoProfessor:Int, horasMonitoria:Int){
        professores.add(Professor(nomeProfessor, sobrenomeProfessor, codigoProfessor, horasMonitoria))
    }

    fun registrarProfessorTitular(nomeProfessor:String, sobrenomeProfessor:String, codigoProfessor:Int, especialidade:String){
        professores.add(Professor(nomeProfessor, sobrenomeProfessor, codigoProfessor, especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int){
        professores.forEach{
            if(it.codigoProfessor == codigoProfessor){
                professores.remove(it)
            }
        }
    }

    fun matricularAluno(codigoAluno:Int, codigoCurso:Int){
        var aluno1:Aluno? = null
        var curso1:Curso? = null
        alunos.forEach{ if(codigoAluno == it.codigoAluno){ aluno1 = it } }
        cursos.forEach{ if(codigoCurso == it.codigoCurso){ curso1 = it } }

    }

    fun alocarProfessores(codigoCurso:Int, codigoProfessorAdjunto: Int, codigoProfessorTitular: Int){
        var profadj:Professor? = null
        var proftit:Professor? = null
        professores.forEach{ if(it.codigoProfessor == codigoProfessorAdjunto){ profadj = it } }
        professores.forEach{ if(it.codigoProfessor == codigoProfessorTitular){ proftit = it } }
        cursos.forEach{
            if(it.codigoCurso == codigoCurso){
                it.professorTitular = proftit
                it.professorAdjunto = profadj
            }
        }
    }
}