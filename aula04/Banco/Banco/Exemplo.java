class Exemplo {
    public static void main(String[] args) {
        Cliente ana = new Cliente(
            "Ana Maria Braga Maffeis", 
            1, 
            "1/4/1949",
            new Endereço(
                "Rua da casa da Ana Maria Braga", 
                10, 
                "s/c", 
                "033456-100", 
                "Rio de Janeiro", 
                "RJ", 
                "Brasil"), 
            Cliente.FEMININO, 
            Cliente.ESPECIAL);
        Cliente luva = new Cliente(
            "Luva de pedreiro", 
            2, 
            "7/11/2001",
            new Endereço(
                "Rua da casa do Luva", 
                34, "casa", 
                "34568-900", 
                "Quijingue", 
                "BA", 
                "Brasil"),
            Cliente.MASCULINO, 
            Cliente.COMUM);
        Cliente angélica = new Cliente(
            "Angélica Ksyvickis Huck", 
            3, 
            "30/11/1973", 
            new Endereço(
                "Rua dos milhionários", 
                17, 
                "condomínio 3", 
                "071890-001",
                "Rio de Janeiro",
                "RJ",
                "Brasil"), 
            Cliente.FEMININO, 
            Cliente.ESPECIAL);
        Cliente huck = new Cliente(
            "Luciano Grostein Huck", 
            4, 
            "3/9/1971", 
            angélica.endereço, 
            Cliente.MASCULINO, 
            Cliente.ESPECIAL);
        Cliente joaquim = new Cliente(
            "Joaquim Huck", 
            5, 
            "8/3/2005", 
            angélica.endereço, 
            Cliente.MASCULINO, 
            Cliente.ESPECIAL);

        //Cliente[] clientes = {ana,luva,angélica,huck,joaquim};
        //for (Cliente cliente: clientes) System.out.println(cliente);

        Conta contaDaAna = new ContaPreferencial(ana, 10, 32);
        contaDaAna.depositar(570_000.30);
        Conta contaDoLuva = new ContaPreferencial(luva, 67, 9876);
        contaDoLuva.depositar(34_520.12);
        Cliente[] titularesConj = {angélica, huck};
        Conta contaConjunta = new ContaConjunta(titularesConj, 34, 101);
        contaConjunta.depositar(3_245_678.90);
        Conta contaDoLuciano =  new ContaPreferencial(huck, 431, 67902);
        contaDoLuciano.depositar(7_500_000.00);
        Conta poupançaDoLuva = new ContaPoupança(luva, 67, 3001);
        poupançaDoLuva.depositar(6_734.44);
        Conta poupançaJoaquim = new ContaPoupança(joaquim, 431, 198807);
        poupançaJoaquim.depositar(251_450.56);

        Conta[] contas = {contaDaAna, contaDoLuva, contaConjunta, contaDoLuciano, poupançaDoLuva, poupançaJoaquim};

        for (Conta conta: contas) { 
            conta.tirarExtrato(); 
            System.out.println("Conta válida? " + (conta.validar()?"SIM":"NÃO"));
        }

        System.out.println(">> Sacar 100 reais de cada conta");
        contaDaAna.sacar(100);
        contaDoLuva.sacar(100);
        contaConjunta.sacar(100);
        poupançaDoLuva.sacar(100);

        for (Conta conta: contas) conta.tirarExtrato(); 

        System.out.println(">> Tentar transferir de poupança para conta de outra titularidade");
        poupançaJoaquim.transferir(100, contaDoLuciano);
        poupançaJoaquim.tirarExtrato();
        contaDoLuciano.tirarExtrato();

        System.out.println(">> Transferir de conta preferencial para poupança");
        contaDoLuciano.transferir(100_000, poupançaJoaquim);
        poupançaJoaquim.tirarExtrato();
        contaDoLuciano.tirarExtrato();

        System.out.println(">> Sacar quase tudo de conta preferencial");
        contaDoLuciano.sacar(contaDoLuciano.saldo-50_000);
        contaDoLuciano.tirarExtrato();

        System.out.println(">> Fazer transferência de conta preferencial com saldo abaixo de limite para tarifa reduzida");
        contaDoLuciano.transferir(10_000, poupançaJoaquim);
        poupançaJoaquim.tirarExtrato();
        contaDoLuciano.tirarExtrato();
    }
}
