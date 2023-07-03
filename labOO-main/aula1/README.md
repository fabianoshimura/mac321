# 👾 Linguagens Interpretadas e Linguagens Compiladas

## 📖 Linguegm Interpretada
- **código fonte** -> **interpretador** -> **saída** (executa)

## ⚙️ Linguagem Compilada
- **código fonte** -> **compilador** (traduz o alto nível para linguagem de máquina) -> **código objeto** (sistema operacional torna em executável) -> **executor** -> **saída**

## 🐧 Linguagens Híbridas
- Smalltalk, Java, Python

1. antes de iniciar a execução do programa, um compilador traduz o código-fonte para bytecode (código em bytes)
    - o .class [parecido com linguagem de montagem]

2. ao executar o programa, o interpretador lê os bytecodes um-a-um e executa os comando correspondentes.

## 🍵 A Filosofia de Java
- "write once, run everywhere"
- rodar em qualquer sistema operacional e em qualquer aparelho.
- usaram uma **MÁQUINA VIRTUAL JAVA**, que possui o bytecode e biblioteca de funções, assim qualquer computador que tenha a JVM roda o mesmo programa.
- a JVM pode ser usado por java, python, etc.

## 🪛 Compilando Java e Python
### Java 

```java
/* ---- COMANDOS ---- */
/* javac nome_do_arquivo.java ->>> compilar o programa em java */
/* java nome_do_arquivo.java ->>> executar o programa em java */
/* ls: aparece a classe em bytecode */
```

### Python
```python
# ---- COMANDOS -----
# ls ->>> ver todos arquivos que tem naquela pasta
# python3 nome_do_arquivo.py ->>> comando para rodar python o terminal/ executar o programa
# python3 nome_do_arquivo.py ARGUMENTO ->>> pode colocar argumentos também com o argv
```