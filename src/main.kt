fun main(){
    var DHM = DigitalHouseManager()

    //Não consegui implementar o adicionarAluno na classe Curso, então criei os alunos na Main
    var aluno1 = Aluno("Leandro", "Sena", 1)
    var aluno2 = Aluno("Leandro", "Sena", 2)
    var aluno3 = Aluno("Leandro", "Sena", 3)
    var aluno4 = Aluno("Leandro", "Sena", 4)
    var aluno5 = Aluno("Leandro", "Sena", 5)

    //Atividade 2
    DHM.registrarProfessorAdjunto("Teste Adjunto Nome", "Teste Titular Sobrenome", 1,5)
    DHM.registrarProfessorTitular("Teste Titular Nome", "Teste Titular Sobrenome", 2, "Biologia")

    DHM.registrarProfessorAdjunto("Teste Adjunto Nome", "Teste Titular Sobrenome", 3,10)
    DHM.registrarProfessorTitular("Teste Titular Nome", "Teste Titular Sobrenome", 4, "Historia")

    //Atividade 3
    DHM.registrarCurso("FullStack", 20001, 3)
    DHM.registrarCurso("Android", 20002, 2)

    //Atividade 4
    DHM.alocarProfessores(3,1,2)
    DHM.alocarProfessores(2,3,4)

    //Atividade 5
    DHM.matricularAluno(1, 20001)
    DHM.matricularAluno(2, 20001)
    DHM.matricularAluno(3, 20002)
    DHM.matricularAluno(4, 20002)
    DHM.matricularAluno(5, 20002)
}
