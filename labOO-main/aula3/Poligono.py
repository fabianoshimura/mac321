# HERANÇA

class Poligono:
    def __init__(self, numero_de_lados):
        self.n = numero_de_lados;
        self.lados = [0 for i in range(numero_de_lados)]
    
    def le_lados(self):
        self.lados = [float(input("digite tamanho do lado " + str(i+1)
                      for i in range(self.n)))]
    
    def mostra_lados(self):
        for i in range(self, n):
            print("Lado", i+1, "tem comprimento", self.lados[i])
        
class Triangulo(Poligono):
    def __init__(self):
        Poligono.__init__(self, 3)
    
    def area(self):
        a, b, c = self.lados
        # calcula o semi-perimetro
        s = (a +b + c) / 2
        area = (s*(s-1)*(s-b)*(s-c)) ** 0.5
        print("a área do triangulo eh %0.2f", area)

class Retangulo(Poligono):
    def __init__(self):
        Poligono.__init__(self, 4)

    def le_lados(self):
        lado1 = float(input("Digite tamanho do lado 1: "))
        lado2 = float(input("Digite tamanho do lado 2: "))
        self.lados[0] = self.lados[2] = lado1
        self.lados[1] = self.lados[3] = lado2

    def area(self):
        return self.lados[0] * self.lados[1]

    def diagonal(self):
        return (self.lados[0] ** 2 + self.lados[1] ** 2) ** 0.5


class TrianguloRetangulo(Triangulo):
    def éTrianguloRetangulo(self):
        return(self.lados[0]**2 == self.lados[1]**2 + self.lados[2]**2
               or self.lados[1]**2 == self.lados[0]**2 + self.lados[2]**2
               or self.lados[2]**2 == self.lados[0]**2 + self.lados[1]**2)