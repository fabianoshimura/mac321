public class Cliente3Teste {
    public static void main(String[] args) {
        Cliente3 cliente = Cliente3.criarCliente("teste", 100);
        Cliente3 cliente2 = Cliente3.criarCliente("teste2", 100);
        Cliente3 cliente3 = Cliente3.criarCliente("teste3", 100);
        Cliente3 cliente4 = Cliente3.criarCliente("teste4", 100);
        Cliente3 cliente5 = Cliente3.criarCliente("teste5", 100);
        Cliente3 cliente6 = Cliente3.criarCliente("teste6", 100); // Este sexto cliente não será criado, pois já há 5 clientes simultaneamente.
        
        cliente.imprimeDados();
        cliente2.imprimeDados();
        cliente3.imprimeDados();
        cliente4.imprimeDados();
        cliente5.imprimeDados();
        cliente6.imprimeDados(); // Ao imprimir seus dados, percebe-se que seus dados estão preenchidos com null e ela está bloqueada.
        
        cliente.finalize();
        System.out.println("Cliente finalizado!");
        
        Cliente3 cliente7 = Cliente3.criarCliente("teste7", 100); // Agora é possível criar um novo cliente.
        cliente7.imprimeDados(); // Seus dados estão preenchidos corretamente, de maneira válida.
        cliente.imprimeDados(); // Os dados do cliente finalizado passam a serem inválidos ou null.
    }
}
