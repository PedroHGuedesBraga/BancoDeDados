public class Filmes {
    private String nome;
    private String ano;
    private String duracao;
    private String nota;
    private String genero;

    public Filmes(String nome, String ano, String duracao, String nota, String genero) {
        this.nome = nome;
        this.ano = ano;
        this.duracao = duracao;
        this.nota = nota;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
