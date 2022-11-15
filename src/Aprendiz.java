/*
 * title: Aprendiz.java
 * subtitle: Classe que representa um aprendiz
 * @author: Guilherme Monteiro de Oliveira, Gustavo Scaglione Vilmar, Pietro Tadeu Vieira Giorgi
 * date: Tue Nov 15 15:33:33 2022
 */

class Aprendiz {

    private String nome;
    private int nota;

    /**
     * Construtor da classe aprendiz
     *
     * @param nome   Nome do aprendiz
     **/
    public Aprendiz (String nome){
        this.nome = nome;
        setNota(0);
    }

    /**
     * Setter da nota do aprendiz
     *
     * @param nota   Nota do aprendiz
     **/
    public void setNota (int nota){
        this.nota = nota;
    }

    /**
     * Getter do nome do aprendiz
     *
     * @return nome   Nome do aprendiz
     **/
    public int getNota (){
        return nota;
    }

    /**
     * Getter da nota do aprendiz
     *
     * @return nota   Nota do aprendiz
     **/
    public String getNome(){
        return nome;
    }
}
