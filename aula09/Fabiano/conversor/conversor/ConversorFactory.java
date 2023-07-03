
public class ConversorFactory {
    public Conversor newConversor(char unidadeEntrada, char unidadeSaída) {
    
        if (unidadeEntrada == unidadeSaída) {
            return new ConversorIdentidade();
        } else if (unidadeEntrada == 'C' && unidadeSaída == 'F') {
            return new ConversorCelsiusParaFarenheit();
        } else if (unidadeEntrada == 'F' && unidadeSaída == 'C') {
            return new ConversorFarenheitParaCelsius();
        } else {
            throw new UnsupportedOperationException("Unimplemented method 'converte'");
        }
    }

}
