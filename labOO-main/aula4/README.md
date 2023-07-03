# 🏗️ Construtores e Especificadores de Acesso

Caso a função construtora não seja feita, o padrão do java é inicializar as variávels com 0, NULL, Fales...

Um exemplo de construtor:
```java
class Conta {
    String titular;
    double saldo;

    Conta(String titu, double sal) {
        this.titular = titu; // this. refenrencia o próprio objeto
        this.saldo = sal;
    }
}
```
## 📦 Pacotes - Java
- agrupar classes relacionadas
- evitar conflito de nomes e limitar acesso
- pacotes definidos por usuários

1. para **usar classes em um pacote**, precisamos importá-las

    ```java
    import pacote.subpacote.Classe;
    import pacote.*; // todas as classes
    ```
    ```java
    import java.util.Scanner;
    class MyClass {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter username");

            String userName = myObj.nextLine();
            System.out.println("Username is: " + userName);
        }
    }
    ```

2. para **definir um novo pacote**, usamos a palavra package na primeira linha do arquivo

    ```java
    package nomedopacote;
    ```
    ```java
    // Arquivo usp/poligonos/Poligono.java
    package usp.poligonos;
    class Poligono{
        int[] lados;
    }
    ```
    ```java
    // Arquivo usp/sim/App.jav
    import usp.poligonos.*;
    class App{
        public static void main(String[] args) {
            Poligono p = new Poligono(3,4);
        }
    }
    ```

## 🔒 Especificadores de Acesso

1. **public** - qualquer objeto;
2. **private** - apenas por objetos da prórpia classe;
3. **protected** - objetos no **mesmo pacotes** ou objetos especializados;
4. **default** - objetos no mesmo pacote.
5. **final** - NÃO é possível mudar seu valor.

### **static** 
- antes de um **atributo**:
    - indica que é uma **variável de classe** e não de objeto.
    - todas instâncias compartilham a mesma variável.
- antes de um **método**:
    - indica que é um **método de classe**.
    - pode ser CHAMADO DIRETAMENTE através da classe, sem necessidade de criar uma instância.

## 🗝️ Métodos de Acesso
### getters e setters
Para não acessar diretamente os atributos das classes.

Solução:
- todos atributos são private ou protected
- cria getters e setters
- exemplo, se o atributo é int x:
    - int getX()
    - void setX(int valor)

 ```java
private int anoDeFabricacao;

public int getAnoDeFabricacao() {
    return anoDeFabricacao;
}
public void setAnoDeFabricacao(int anoDeFabricacao) {
    this.anoDeFabricacao = anoDeFabricacao;
}
```

