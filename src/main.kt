import java.time.LocalDate
import java.util.*

fun main(){
    var DHM = DigitalHouseManager()
    DHM.registrarProfessorAdjunto("Teste Adjunto Nome", "Teste Titular Sobrenome", 1,5)
    DHM.registrarProfessorTitular("Teste Titular Nome", "Teste Titular Sobrenome", 2, "Biologia")

    DHM.registrarProfessorAdjunto("Teste Adjunto Nome", "Teste Titular Sobrenome", 3,10)
    DHM.registrarProfessorTitular("Teste Titular Nome", "Teste Titular Sobrenome", 4, "Historia")

    DHM.registrarCurso("FullStack", 20001, 3)
    DHM.registrarCurso("Android", 20002, 2)

    DHM.alocarProfessores(3,1,2)
    DHM.alocarProfessores(2,3,4)

    var date = LocalDate.parse("2021-02-02")
    println(date.dayOfMonth)
    println(date.dayOfWeek)
    println(date.dayOfYear)
    println(date.month)
    println(LocalDate.now())

}