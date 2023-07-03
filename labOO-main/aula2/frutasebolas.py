class Fruta:
    no_frutas = 0

    def __init__(self, nome:str, cor:str, peso:int, preço:float):
        self.nome = nome
        self.cor = cor
        self.peso = peso
        self.preço = preço
        Fruta.no_frutas += 1

    def descrever(self):
        print(f"A fruta {self.nome} tem cor {self.cor}, pesa {self.peso}g e custa R${self.preço}")
        
    def quantas_frutas():
        print(f"Existem {Fruta.no_frutas} frutas")

    @classmethod
    def quantas(cls):
        print(f"Existem {cls.no_frutas} frutas")


class Bola:
    def __init__(self, nome, cor, forma, peso):
        self.nome = nome
        self.cor = cor
        self.preço = 0.0
    
    def descreve(self):
        print(f"A bola {self.nome} tem cor {self.cor} e custa R${self.preço}")


def main():
    banana = Fruta("banana", "amarela", "alongada", 300)
    maca1 = Fruta("maçã1", "vermelha", "arredondada", 200)
    maca2 = Fruta("maçã2", "verde", "arredondada", 240)

    bola = Bola("bolinha", "branca e azul")

    print(banana.nome, maca1.nome, maca2.nome)

    banana.descreve()
    maca1.descreve()
    maca2.descreve()

if __name__ == "__main__":
    main()