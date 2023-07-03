package aula4.poligonos.src;

public class TestaRetangulo {
    public boolean testaArea(Retangulo retangulo){
        if (retangulo.calculaÁrea() == 12)
            return true; 
        else 
            return false;
    }

    public boolean testaPerimetro(Retangulo retangulo){
        if (retangulo.calculaPerimetro() == 14)
            return true;
        else 
            return false;
    }

    public void main(String[] args) {
        Retangulo testeRetangulo = new Retangulo(3,4);
        int passou = 0;

        if (testaPerimetro(testeRetangulo))
            passou += 1;
        System.out.println(passou);
    }

}
