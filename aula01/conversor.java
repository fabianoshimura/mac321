
// celsius para farenheit

class conversor {
    static double CparaF (double temp) {
        double tempF = temp*9/5 + 32;
        return tempF;
    }


    public static void main(String[] args) {
        for (int i=0; i < args.length; i++) {
            System.out.println (args[i]);
            double tempC = Double.parseDouble(args[i]);
            double tempF = CparaF (tempC);
            System.out.println("Farenheit: " + tempF);
        }
    }
 
}
