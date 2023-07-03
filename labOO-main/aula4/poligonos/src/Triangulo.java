package aula4.poligonos.src;

public class Triangulo extends Poligonos {

    private String _cor;

    public Triangulo(int[] lados) { // triangulo com 3 lados diferentes
        super(new int[3], "triangulo");
        _lados = lados;
    }
    
    public Triangulo(int lados) { // triangulo equilatero (3 lados =s)
        super(3, lados, "triangulo equilatero");
    }

    public Triangulo(int lados_eq, int lado_dif) { // triangulo isosceles (2 lados =s)
        super(new int[3], "triangulo isosceles");
        _lados[0] = _lados[1] = lados_eq;
        _lados[2] = lado_dif;
    }

    public boolean ehValido() {
        if(_lados[0] > 0 && _lados[1] > 0 && _lados[2] > 0) {
            if(_lados[0] < _lados[1] + _lados[2] && 
               _lados[1] < _lados[0] + _lados[2] && 
               _lados[2] < _lados[0] + _lados[1]) return true;
        }
        return false;
    }

    public int[] getLados() {
        return _lados;
    }

    public void setLados(int[] lados) {
        this._lados = lados;
    }

    public String getCor() {
        return _cor;
    }

    public void setCor(String cor) {
        this._cor = cor;
    }

}
