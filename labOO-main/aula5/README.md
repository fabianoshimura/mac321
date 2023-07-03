# 💣 Coleções de Objetos, Classes Abstratas,  Interfaces e Polimorfismos

## 🥇🥈 Coleções
- sistemas de software complexos lidam com milhares de objetos.
- surgiu com Smalltalk80 e eles são organizados em coleções.
- foi introduzido uma biblioteca de classes para coleções.

Em java há o **Vector** e **ArrayList**.
> contém uma sequência de objetos e o tamanho é variável (pode começar com um elemento vazio e acrescentar 50, 100, ... ou remover)

## ArrayList
```java
ArrayList amigos = new ArrayList();

amigos.add("john");
amigos.add("paul");
amigos.add("ringo");

tamanho = amigos.size();
baixista = amigos.get(1);
amigos.remove(2);
amigos.add("fabio")
```

Elementos de um ArrayList são do tipo Object
```java
ArrayList contas = new ArrayList();
contas.add(new ContaCorrente(100));
// contas.get(0).saldo(); -> daria erro
((ContaCorrente) contas.get(0)).saldo(); // transformar no tipo do objeto primeiro
```

Mas dessa maneira fica ruim de escrever, logo:

### Tipos parametrizados
Programação genérica

```java
ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>
contas.add(new ContaCorrente(100));
contas.get(0).saldo(); // agoradaria erro

// SIMPLIFICAÇÃO
List<ContaCorrente> contas = new ArrayList<>;
```

### Iterable
"for" melhorado.

```java
for(ContaCorrente c: contas)
    System.out.println(c.getSaldo());

// ou

for(Carro c: garagem)
    c.limpe();
```

### Collection <T>
Passa de forma parametrizada.
> olhar documentação

### List

## 🪞 Classes Abstratas
Define que um objeto vai possuir determinado métodos, mas NÃO define a implementação do método.
- vai criar uma subclasse dessa classe abstrata que vai implementar o método que está faltando

> Movie.java e MP4Movie.java

## 🖥️ Interface
É uma classe PURAMENTE ABSTRATA. Contém apenas uma lista de assinaturas de métodos, não há implementações.
- deve ser implementada posteriormente por classes usando **implemenst**
- várias classes diferentes podem implementar de diferentes formas
    ```java
    class X implements interfaceY{
    }
    ```

- caso haja variáveis, serão implicitamente **public static final**

> ObjetoEspacial.java e NaveEspacial.java

- uma classe pode implementar mais de uma interface
- é possível ter herança de interfaces (extends)

## ⏳ Polimorfismo
Possui **multiplas formas**.

3 tipos:
- paramétrico (generics)
- sobrecarga de métodos (overloading)
- sobreescrita de métodos (overriding)

### paramétrico
passamos o tipo que queremos e seu comportamento é de acordo com o tipo.
```java
ArrayList<String> a = new ArrayList<>();
ArrayList<Animal> a = new ArrayList<>(); //classe que eu criei
```

### sobrecarga  de métodos
Em java uma classe pode ter 2 ou mais métodos com o mesmo nome.
- o que diferencia os métodos são os seus parâmetros
```java
int multiplica(int a, int b);
float miltiplica(float a, float b);
```
> exemplo na aula4/poligonos

### sobreescrita de métodos
Ligado a herança e subtipos.
- método de uma classe filha possui a mesma assinatura que o método da classe mãe (a da filha se sobreescreve, sobrepoe sobre a mae)
``` java
class mae M
class filhas F1, filhasF2, filhasF3
// todas tem o metodo m
// F1, F2, F3 possuem versões polimórficas do método m
```

