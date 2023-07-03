## 💸 Para casa: Exercício sobre vendas

Implemente em Java, usando Polimorfismo, uma boa arquitetura OO para o seguinte problema.

Você precisa desenvolver um sistema para registrar as vendas realizadas por uma empresa. Cada venda possui um código do item, nome do item e valor da venda.

Dependendo de onde reside o comprador, a venda está sujeita a diferentes políticas de impostos (ICMS) e preço de frete. Para vendas para dentro do Estado de São Paulo, o imposto é 12% do valor total da venda e o frete (já incluso no valor total da venda) é 10 reais. Para vendas para outros Estados brasileiros, o imposto é 8% e o frete é 30 reais. Para vendas para o exterior, o imposto é 0% e o frete é 100 reais.

Você deverá implementar uma classe BalançoDeVendas que irá contabilizar todas as vendas, oferencendo as seguintes funcionalidades:

1. Imprimir todas as vendas realizadas até o momento.
2. Calcular o valor total do imposto pago até o momento.
3. Calcular a receita líquida total até o momento. Receita líquida = preço da venda - imposto - frete. 

Implemente uma função main() que leia do teclado um conjunto de n vendas e, ao final, imprima um relatório com a lista completa das vendas e o valor total de imposto pago e da receita líquida obtida.

Para casa: escreve um conjunto de testes automatizados JUnit para testar seu código, com boa cobertura.

