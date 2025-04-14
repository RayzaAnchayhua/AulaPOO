package lista.exercicio2;

public class Aluno3_2 {

    String nome;
    String RA;
    Curso3_2 curso; //Objeto - uma forma de relação entre classes

    public Aluno3_2(String nome, String RA, Curso3_2 curso) {
        this.nome = nome;
        this.RA = RA;
        this.curso = curso;
    }

    @Override
    public String toString() {
        System.out.println("Nome do Aluno: "+nome);
        System.out.println("RA do Aluno: "+RA);
        System.out.println("Universidade: "+curso.universidade);
        System.out.println("Curso do Aluno: "+curso.curso);
        return "";
    }

}
