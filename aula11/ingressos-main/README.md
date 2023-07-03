# Sistema de Venda de Ingressos

Você foi contratado para desenvolver um sistema de venda e gerenciamento de ingressos para eventos. Cada **evento** possui:

- Código de identificação único
- Descrição
- Data e hora de início
- Local (casa de eventos)
- Quantidade de ingressos disponíveis
- Valor de base do preço do ingresso

Os **clientes** precisam se registrar no sistema para a compra de ingressos e fornecer os seguintes dados:

- Identificador (por ex., CPF)
- Data de nascimento
- Nome completo
- Endereço
- Email

Os clientes podem ser **eventuais** ou **assíduos**. Clientes assíduos pagam uma mensalidade fixa e possuem desconto de 60% na compra de ingressos, se adimplentes. Um cliente eventual pode ser tornar assíduo ao assinar o plano e um cliente assíduo se torna eventual se deixar de pagar a mensalidade (inadimplente). Clientes eventuais menores de 25 anos possuem descontos de 50% do valor base do ingresso. Descontos não são cumulativos (por exemplo, um cliente assíduo menor de 25 anos possui apenas desconto de 60% na compra).

Cada ingresso possui um identificador único e é nominal, ou seja, associado a um cliente. Deve ser possível obter informações sobre o evento e o cliente de um ingresso. Além disso, os ingressos podem ser entregues em casa (o que gera uma **taxa de conveniência de R$10,00**) ou retirados no local. Note que um cliente pode possuir mais de um ingresso para o mesmo evento. 

O sistema deve possuir um **aplicativo de vendas**, que permite o cadastro de **novos clientes**, cadastro de **novos eventos**, **venda de ingressos** e **geração de relatórios**. O sistema permite que um cliente compre um ou mais ingressos para um evento e calcula o preço final. Cada **venda** deve ser registrada para contabilidade futura, e guardar, pelo menos, os códigos dos ingressos comprados, a forma de pagamento e o valor total da venda, calculado da seguinte forma. A soma de todos os valores de ingresso (já com os descontos aplicados) + 12% de imposto (cobrado sobre o valor efetivamente pago dos ingressos) + taxa de conveniência (caso optem pela entrega, sob a qual não incide imposto direto). Observações:

- Os ingressos não podem ser vendidos em quantidade maior que a quantidade de ingressos disponíveis por evento.  
- A taxa de conveniência é cobrada uma única vez por venda (todos os ingressos comprados devem ter a mesma forma de retirada).

O sistema de vendas deve também gerar relatórios financeiros relatando a quantidade total de ingressos vendidos, a quantia comercializada, o valor de impostos recolhidos e a receita líquida (preço de venda - imposto - frete), segregados por evento. 

## Considerações:

- use o padrão _Estado_ para diferenciar os clientes assíduos e eventuais.
- Use o padrão _Estratégia_ para implementar as tarifações.
- Use o padrão _Singleton_ para garantir que existe apenas um sistema de vendas, globalmente acessível.
- Use o padrão _Fábrica_ ou _Fábrica Abstrata_ para associar uma estratéfia adequada a uma venda, baseada no evento e no cliente dono do ingresso.
- Use o padrão _Protótipo_ para evitar grandes blocos de if/elses.
- Faça casos de uso para todas as situações e testes automatizados com boa cobertura.
- Lembre-se de seguir as boas práticas de POO (encapsulamento, boa documentação, evitar métodos longos, adotar o princípio de responsabilidade única, usar nomes que revelem suas intenções etc).