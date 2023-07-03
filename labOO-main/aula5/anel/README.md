## Exercício Interface Parametrizada

Implemente em Java uma interface parametrizada AnelAbstrato para o conceito de Anéis em álgebra abstrata (veja a definição na Wikipédia). Sua classe deve definir os seguintes métodos abstratos:

soma e produto, que materializam as respectivas operações;
zero, que devolve um valor representando o elemento neutro da adição (aquele tal que x+0=x para todo x)
um, que devolve um valor representando o elemento neutro da multiplicação  (aquele tal que x*1=x para todo x)
negativo, que recebe um valor e devolve o seu inverso da adição (aquele y tal que x+y=0 para dado x)
Em seguida, implemente uma classe concreta AnelBooleano que implementa a interface com as seguintes especificações.

O domínio do anel são proposições lógicas
Adição é definida como a operação (x∧¬y) ∨ (¬x∧y) (soma módulo 2 ou exatamente um de x ou y é verdade)
Multiplicação é definida como conjunção lógica (E)
Os elementos zero e um são, respectivamente, os valores lógicos (booleanos) false e true, respectivamente.
Negativo de um número é sua negação lógica (-x é false se x é true e true se x é false)
Implemente também uma operação de disjunção lógica (OU), que não faz parte da interface.
Veja o exemplo de implementação de interfaces parametrizadas em AnelAbstrato.java e AnelRacional.java.

Implemente uma função main() para cada uma das classes com alguns casos de uso de sua implementação.

Para casa: escreva um conjunto de testes automatizados JUnit com boa cobertura, para ambas as classes.
