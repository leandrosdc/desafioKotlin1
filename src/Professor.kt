class Professor (var nomeProfessor:String,
                 var sobrenomeProfessor:String,
                 var codigoProfessor:Int) {

    constructor (nomeProfessor:String,
                 sobrenomeProfessor:String,
                 codigoProfessor:Int,
                 especialidadeProfessor:String) : this(nomeProfessor, sobrenomeProfessor, codigoProfessor) {}

    constructor (nomeProfessor:String,
                 sobrenomeProfessor:String,
                 codigoProfessor:Int,
                 horasMonitoria:Int) : this(nomeProfessor, sobrenomeProfessor, codigoProfessor) {}
}