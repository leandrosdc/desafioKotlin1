class Professor (var nomeProfessor:String,
                 var sobrenomeProfessor:String,
                 var codigoProfessor:Int) {

    //Construtor do Professor Titular
    constructor (nomeProfessor:String,
                 sobrenomeProfessor:String,
                 codigoProfessor:Int,
                 especialidadeProfessor:String) : this(nomeProfessor, sobrenomeProfessor, codigoProfessor) {}

    //Construtor do Professor Adjunto
    constructor (nomeProfessor:String,
                 sobrenomeProfessor:String,
                 codigoProfessor:Int,
                 horasMonitoria:Int) : this(nomeProfessor, sobrenomeProfessor, codigoProfessor) {}
}