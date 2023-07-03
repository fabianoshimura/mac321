# MAC0321 Laboratório de Programação Orientada a Objetos
## Exercício sobre conceitos fundamentais de OO: classes, associações e herança

Crie um conjunto de classes para representar as contas correntes dos clientes de um banco. Os objetos devem armazenar os dados pessoais dos clientes (Nome, CPF, RG e Endereço), informações da conta (agência, número e saldo), além de informações sobre tipos de clientes e de contas. O endereço deve ser completo com logradouro, número, complemento, CEP, cidade, estado. Uma conta pode ser individual (único cliente) ou conjunta (mais de um cliente). Um cliente pode ser comum ou especial. As contas podem ser do tipo corrente comum, poupança e corrente preferencial. Apenas clientes especiais podem ser titulares de contas preferenciais.  As contas devem possuir um saldo e métodos para depositar, sacar e transferir valores entre contas, além de exibir um extrato com o saldo. As taxas cobradas por transações bancárias (retirada, depósito e transferência) variam de acordo com seu tipo, conforme a tabela baixo.

| Transação | Depósito | Saque | Transferência |
|-----------|----------|-------|---------------|
| Conta Comum | 0,0 | 10,0 | 2,0 |
| Conta Poupança | 0,0 | 5,0 | 1,0 |
| Conta Preferencial | 0,0 | 1,5 | 0,0 |

Contas comuns individuais e conjuntas possuem as mesmas taxas. As contas de poupança só podem realizar transferências para contas correntes de mesma titularidade. As taxas reduzidas para contas preferenciais só são aplicáveis quando o saldo é superior a 50 mil reais (antes da transação), caso contrário se aplicam taxas de contas comum. As classes devem possuir métodos que exibem um sumário dos dados (cliente e conta). As contas devem fornecer um extrato contendo os dados da conta e o saldo.

Como exemplo de uso, escreva um método main que crie 4 clientes e 5 contas correntes, conforme a tabela abaixo:

| Conta ID | Cliente | Conta Tipo | Endereço | Saldo inicial |
|----------|-------|----------|---------------|---|
| 1 | Ana Maria Braga | Preferencial | A | R$ 570 000,30 |
| 2 | Luva de Pedreiro | Comum Individual | B | R$ 34 520,12 |
| 3 | Luva de Pedreiro | Poupança | B | R$ 6734,44 |
| 4 | Angélica | Conjunta | C | R$ 3 245 678,90 |
| 4 | Luciano Huck | Conjunta | C | R$ 3 245 678,90 |
| 5 | Luciano Huck | Preferencial | C | R$ 7 500 000,00 |
| 6 | Joaquim Huck | Poupança | C | R$ 251450,56 |


Seu exemplo deve evitar duplicação de dados. Por exemplo, o mesmo endereço não deve aparecer duplicado em dois locais diferentes da memória, nem os dados de um mesmo cliente. O exemplo deve fazer operações de depósito, saque e transferências e exibir o saldo das contas depois de cada operação. Seu exemplo deve guardar os clientes e contas em listas (`ArrayLists`) ou arrays e usar polimorfismo para simplificar as chamadas aos métodos no exemplo de uso.

Lembre-se da conveniência de criar um método
```java
public String toString()
```
nas suas classes, para pode exibir informações facilmente.