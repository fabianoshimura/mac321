
public class exercicio6 {
    
    public void recebeCodigo(String codigo) {
        String[] dados = codigo.split(" ");
        int linhas, colunas;
            
        try {
            if (dados.length != 4) throw new CodigoNaoFormatadoException("");
            if (dados[0].length() != 6) throw new CodigoNaoFormatadoException("");
            
            if (!dados[1].equals("0-1") && !dados[1].toLowerCase().equals("int") && !dados[1].toLowerCase().equals("double")) 
                throw new TipoException ("");
            
            linhas = Integer.parseInt(dados[2]);
            colunas = Integer.parseInt(dados[3]);
            
            if (dados[1].toLowerCase().equals("int")) {
                int[][] mInt;

                mInt = new int[linhas][colunas];
            }
            else if (dados[1].toLowerCase().equals("double")) {
                double[][] mDou;

                mDou = new double[linhas][colunas];
            }
            else if (dados[1].equals("0-1")) {
                int[][] m01;

                m01 = new int[linhas][colunas];
            }
        }
        catch (CodigoNaoFormatadoException e) {
            System.out.println("O código não segue o formato especificado.");
        }
        catch (TipoException e) {
            System.out.println("Tipo não identificado.");
        }
        catch (NumberFormatException e) {
            System.out.println("Tamanho da matriz não identificado.");
        }
    }
    
    public static void main (String args[]) {
        exercicio6 obj = new exercicio6();

        obj.recebeCodigo("matriz int 2 3"); // nesse caso, o código segue exatamente o formato especificado.
        obj.recebeCodigo("matri int 2 3");  // já aqui, o formato não segue o especificado.
        obj.recebeCodigo("matriz ont 2 3"); // aqui, o <tipo> não é nenhum dos especificados.
        obj.recebeCodigo("matriz int a 3"); // e aqui, o tamanho da matriz é inválido.
    }
}
