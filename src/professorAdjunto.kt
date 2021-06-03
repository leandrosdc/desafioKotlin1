class professorAdjunto (override var nomeProfessor:String,
                        override var sobrenomeProfessor:String,
                        override var codigoProfessor:Int,
                        var horasMonitoria:Int)
                        :Professor(nomeProfessor, sobrenomeProfessor, codigoProfessor){
}