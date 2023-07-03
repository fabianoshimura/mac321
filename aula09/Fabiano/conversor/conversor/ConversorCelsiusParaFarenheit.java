
public class ConversorCelsiusParaFarenheit implements Conversor {



    ConversorCelsiusParaFarenheit(){
        
    };

    @Override
    public double converte(double temperatura) {
        return 9*temperatura/5 + 32;
    }

    @Override
    public Conversor clone() {
        return new ConversorCelsiusParaFarenheit();
    }
   
}
