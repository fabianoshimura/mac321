# Versão com herança

class Polígono:
    'Representa um objeto geométrico poligonal.'

    ''' Constrói polígono dada lista de comprimentos dos lados,
    ordenados de forma adjacente. '''
    def __init__(self, lados:list[int], nome:str):
        self.lados = lados
        self.nome = nome

    def calcula_perímetro(self):
        return sum(self.lados)
    
    def __str__(self):
        return "Olá, eu sou o " + self.nome
    
class Retângulo(Polígono):
    ''' Representa um retângulo  '''
    _no_retângulos = 0
    def __init__(self, largura:int, comprimento:int):
        Retângulo._no_retângulos += 1
        nome = f"Retângulo {Retângulo._no_retângulos}"
        super().__init__([largura, comprimento, largura, comprimento], nome)
   
    def calcula_perímetro(self):
        return 2*(self.lados[0]+self.lados[1])

    def calcula_área(self):
        largura = self.lados[0]
        comprimento = self.lados[1]
        return largura*comprimento
    
class Quadrado(Retângulo):
    _no_quadrados = 0
    def __init__(self, lado:int):
        Quadrado._no_quadrados += 1
        super().__init__(lado, lado)
        self.nome = f"Quadrado {Quadrado._no_quadrados}"

    def calcula_perímetro(self):
        return 4*self.lados[0]

class Triângulo(Polígono):
    'Representa um triângulo'
    _no_triângulos = 0
    def __init__(self, lado1:int, lado2:int, lado3:int):
        Triângulo._no_triângulos += 1
        nome = f"Triângulo {Triângulo._no_triângulos}"
        super().__init__([lado1, lado2, lado3], nome)
    
    def calcula_área(self):
        p = self.calcula_perímetro()/2
        a2 = p*(p-self.lados[0])*(p-self.lados[1])*(p-self.lados[2])
        return a2**0.5

class ObjetoGeométrico:
    'Representa união de polígonos disjuntos.'
    def __init__(self, polígonos:list[Polígono]):
        self.polígonos = polígonos

    def calcula_perímetro(self):
        p = 0
        for polígono in self.polígonos:
            p += polígono.calcula_perímetro()
        return p

    #"Método não funciona para polígonos genéricos"    
    # def calcula_área(self):
    #     a = 0
    #     for polígono in self.polígonos:
    #         a += polígono.calcula_área()
    #     return a
