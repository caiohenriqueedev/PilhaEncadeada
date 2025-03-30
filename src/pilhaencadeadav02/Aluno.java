package pilhaencadeadav02;

public class Aluno {
    private int rgm;
    private String nome, curso;
    private float media;

    public Aluno(int rgm, String nome, String curso, float media) {
        this.rgm = rgm;
        this.nome = nome;
        this.curso = curso;
        this.media = media;
    }

    public int getRgm() {
        return rgm;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" + "rgm=" + rgm + ", nome=" + nome + ", curso=" + curso + ", media=" + media + '}';
    }
    
    
}
