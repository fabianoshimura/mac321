package br.usp.ime.p2.ex4;

public abstract class Refrigerante {
    public String nome;
    public String slogan;
    public boolean diet;
}

class CocaCola extends Refrigerante {
    public CocaCola() {
        this.nome = "Cola Cola";
        this.slogan = "Abra a felicidade";
        this.diet = false;
    }
}

class CocaColaZero extends CocaCola {
    public CocaColaZero() {
        super();
        this.nome = "Cola Cola Zero";
        this.diet = true;
    }
}

class Pepsi extends Refrigerante {
    public Pepsi() {
        this.nome = "Pepsi";
        this.slogan = "Pode ser";
        this.diet = false;
    }
}

class PepsiZero extends Pepsi {
    public PepsiZero() {
        super();
        this.nome = "Pepsi Zero";
        this.diet = true;
    }
}
