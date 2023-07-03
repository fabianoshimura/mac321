import java.util.Scanner;

class Conversor {

    /**
     * @param tempC temperatura em Celsis
     * @return temperatura em Farenheit
     */

    static double celsiusToFarenheit(double tempC) {
        return tempC*9/5  + 32;
    }

    public static void main(String[] args) {
        //for (int i=0; i < args.length; i++) {
            // double tempC = Double.parseDouble(args[i]);
        if (args.length == 0) {
            System.out.println("Digite a temperatura em C: ");
            Scanner sc = new Scanner(System.in);
            double tempC = sc.nextDouble();
            System.out.println("Celsius: " + tempC);
            double tempF = celsiusToFarenheit(tempC);
            System.out.println("Farenheut: " + tempF);
            sc.close();
        }
        else {
            for (String valor: args) {
            double tempC = Double.parseDouble(valor);
            System.out.println("Celsius: " + tempC);
            double tempF = celsiusToFarenheit(tempC);
            System.out.println("Farenheut: " + tempF); /*string somada com numero -> numero vira string */
            }
        }

    }

}

/* ---- COMANDOS ---- */
/* javac nome_do_arquivo.java ->>> compilar o programa em java */
/* java nome_do_arquivo.java ->>> executar o programa em java */
/* ls: aparece a classe em bytecode */