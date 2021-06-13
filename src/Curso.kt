class Curso (var nomeCurso:String,
             var codigoCurso:Int,
             var quantidadeMaxAluno:Int,
             var professorTitular: Professor? = null,
             var professorAdjunto: Professor? = null) {

    var qtdeAlunos:Int = 0
    var listaAlunos = mutableListOf<Aluno>()

    fun salaLotada():Boolean?{
        if (qtdeAlunos == quantidadeMaxAluno){
            return true
        }
            return false
    }

    fun adicionarUmAluno(umAluno:Aluno):Boolean{
        if(this.qtdeAlunos <= this.quantidadeMaxAluno){
            qtdeAlunos++
            listaAlunos.add(umAluno)
            return true
        }else return false
    }

    fun excluirAluno(umAluno: Aluno){
        listaAlunos.forEach{
            if(umAluno.codigoAluno == it.codigoAluno){
                listaAlunos.remove(it)
            }
        }
    }
}