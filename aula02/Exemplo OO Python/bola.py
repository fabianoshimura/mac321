class Bola:
    def __init__(self, nome:str, cor:str):
        self.nome = nome
        self.cor = cor
        self.preço = 0.0

    def descrever(self):
        print(f"A bola {self.nome} tem cor {self.cor} e custa R${self.preço}")