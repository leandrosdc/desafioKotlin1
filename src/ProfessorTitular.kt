class ProfessorTitular (override var nomeProfessor:String,
                        override var sobrenomeProfessor:String,
                        override var codigoProfessor:Int,
                        private var especialidadeProfessor:String)
                        :Professor(nomeProfessor, sobrenomeProfessor, codigoProfessor){
}