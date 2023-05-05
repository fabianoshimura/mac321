# Versão sem herança

class Polígono:
    ''' Constrói polígono dada lista de comprimentos dos lados,
    ordenados de forma adjacente. '''
    def __init__(self, lados, nome):
        self.lados = lados
        self.nome = nome

    def calcula_perímetro(self):
        return sum(self.lados)
    
    def se_apresente(self):
        print("Olá, eu sou o", self.nome)
    
class Retângulo:
    def __init__(self, largura, comprimento):
        self.largura = largura
        self.comprimento = comprimento

    def calcula_perímetro(self):
        return 2*(self.largura+self.comprimento)
    
    def calcula_área(self):
        return self.largura*self.comprimento
    
class Triângulo:
    def __init__(self, lado1, lado2, lado3):
        self.lados = [lado1, lado2, lado3]

    def calcula_perímetro(self):
        return sum(self.lados)
    
    def calcula_área(self):
        p = self.calcula_perímetro()/2
        a2 = p*(p-self.lados[0])*(p-self.lados[1])*(p-self.lados[2])
        return a2**0.5
