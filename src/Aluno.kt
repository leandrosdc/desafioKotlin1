class Aluno (private var nomeAluno:String,
             private var sobrenomeAluno:String,
             private var codigoAluno:Int){

    fun getNomeAluno():String = this.nomeAluno
    fun setNomeAluno(altNomeAluno:String) { this.nomeAluno = altNomeAluno }

    fun getSobrenomeAluno():String =  this.sobrenomeAluno
    fun setSobrenomeAluno(altSobrenomeAluno:String) { this.sobrenomeAluno = altSobrenomeAluno }

    fun getCodigoAluno():Int = this.codigoAluno


}