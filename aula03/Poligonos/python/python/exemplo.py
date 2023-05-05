from poligonos2 import *

def main():
    triângulo = Triângulo(6,5,5)
    triângulo_retângulo = Triângulo(3,4,5)
    retângulo = Retângulo(3,4)
    quadrado = Quadrado(4)
    pentágono = Polígono([3,3,3,3,3], "Pentágono")

    polígonos = [triângulo, triângulo_retângulo, retângulo, quadrado, pentágono]

    for polígono in polígonos:
        print(polígono)
        print("Perímetro:", polígono.calcula_perímetro())

    print()

    triângulos_e_retângulos = [triângulo, triângulo_retângulo, retângulo, quadrado]

    for objeto in triângulos_e_retângulos:
        print("Área:", objeto.calcula_área())

    nave = ObjetoGeométrico([pentágono, triângulo, triângulo_retângulo, retângulo])
    print("Perímetro da nave:", nave.calcula_perímetro())
    #print("Área da nave:", nave.calcula_área())

if __name__ == "__main__":
    main()
