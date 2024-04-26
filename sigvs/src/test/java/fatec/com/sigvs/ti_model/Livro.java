package fatec.com.sigvs.ti_model;

public class Livro {
    private String autor;
    private String nome;
 
    public Livro(String nome, String autor){
        this.nome = nome;
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAutor(String autor){
        this.autor= autor;
    }

    }

