# programa que converte de celsius para farenheit

import sys

def CparaF (tempC:float):
    tempF:float = 9/5*tempC + 32
    return tempF

def main ():

    
    if len(sys.argv) > 1:
      for valor in sys.argv[1:]:
        tempC = float(valor)
        print("temperatura em celsius: ", tempC)
        tempF = CparaF (tempC)
        print("Farenheit: ", tempF)


    else:    
     tempC:float = float(input("Digite um valor: "))
     tempF = CparaF (tempC)
     print("Farenheit: ", tempF)

if __name__ == " __main__ ":
  main()
