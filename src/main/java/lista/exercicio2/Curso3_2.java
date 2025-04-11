package lista.exercicio2;

public class Curso3_2 {
    String curso;
    String universidade;

    //Construtor
    public Curso3_2() {
    }

    public Curso3_2(String curso, String universidade) {
        this.curso = curso;
        this.universidade = universidade;
    }

    //Getters e Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
}
