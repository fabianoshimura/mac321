from fruta import Fruta
from bola import Bola

def main():
    banana = Fruta("banana", "amarela", 300, 4.5)
    maçã1 = Fruta("Maçã 1","vermelha",200,3.5)
    maçã2 = Fruta("Maçã 2","verde",260,3.5)

    Fruta.quantas_frutas()
    Fruta.quantas()
    banana.quantas()

    banana.descrever()
    maçã1.descrever()
    maçã2.descrever()

    bola = Bola("Jamburani", "preta e branca")
    bola.preço = 240.
    bola.descrever()

    outra_bola = Bola("sem nome", "azul")
    outra_bola.preço = 10.
    outra_bola.descrever()

if __name__ == "__main__":
    main()