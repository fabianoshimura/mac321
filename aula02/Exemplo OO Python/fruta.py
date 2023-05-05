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