# 👨‍👩‍👧‍👦 Herança
Usado para:
- evitar duplicação de código
- reusar código
- tem uma relação **é-um** ("Pato é uma ave")

1. **SUPERCLASSE** - classe mãe
2. **SUBCLASSE** - classe filha

1 -> 2 temos uma **especialização** e 2 -> 1 temos uma **generalização**.

Podemos:
- organizar abstrações
- acrescentar comportamentos novos (atributos, métodos)
- alterar comportamento (reemplementar método, sobrepor)

```java
Subclasse extends Superclasse
```

Lembre-se da conveniência de criar um método
```java
public String toString()
```
nas suas classes, para pode exibir informações facilmente.
