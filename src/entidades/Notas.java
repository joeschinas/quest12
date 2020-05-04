
package entidades;


public class Notas {
    private String aluno;
    private Double nota;

    public Notas() {
    }

    public Notas(Double nota) {
        this.nota = nota;
    }
    
    public Notas(String aluno, Double nota) {
        this.aluno = aluno;
        this.nota = nota;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    
}
