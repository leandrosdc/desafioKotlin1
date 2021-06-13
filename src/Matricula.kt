import java.util.*
import java.time.LocalDate

class Matricula(
    var aluno: Aluno?,
    var curso: Curso?,
    var dataMatricula: LocalDate = LocalDate.now()
) {
}