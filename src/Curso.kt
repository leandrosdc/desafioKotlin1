class Curso (var nomeCurso:String? = null,
             var codigoCurso:Int? = null,
             var quantidadeMaxAluno:Int = 0,
             var professorTitular: Professor? = null,
             var professorAdjunto: Professor? = null) {

    var qtdeAlunos:Int = 0
    var listaAlunos = mutableListOf<Aluno>()

    fun salaLotada():Boolean?{
        if (qtdeAlunos >= quantidadeMaxAluno){
            println("Sala Lotada")
            return true
        }else return false
    }

    fun adicionarUmAluno(umAluno: Aluno?):Boolean{
        if(this.qtdeAlunos <= this.quantidadeMaxAluno){
            qtdeAlunos++
            if (umAluno != null) {
                listaAlunos.add(umAluno)
            }
            println("Aluno adicionado com Sucesso")
            return true
        }else return false
    }

    fun excluirAluno(umAluno: Aluno){
        listaAlunos.forEach{
            if(umAluno.codigoAluno == it.codigoAluno){
                listaAlunos.remove(it)
                println("Aluno Excluido com Sucesso")
            }
        }
    }
}