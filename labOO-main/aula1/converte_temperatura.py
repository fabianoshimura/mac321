import sys

# Funções
def celsius_to_farenheit(tempC:float): # Saber que o tpo esperado é float, força uma tipagem no python
    return 9*tempC/5 + 32

def farenheit_to_celsius(tempF:float) -> float: # Saber o tipo que vai retornar
    return 5*(tempF - 32) / 9

def celsius_to_kelvin(temC:float):
    return temC + 273

def kelvin_to_celsius(tempK:float):
    return tempK - 273

def kelvin_to_farenheit(tempK:float):
    return 1,8*(tempK - 273) + 32

# Função principal
def main():
    if len(sys.argv) > 1:
        #for i in range(1, len(sys.argv)):
        #    temp = float(sys.argv[i]) #lista de strings e quer pegar o primeiro argumento
        # --- OUU ----
        for valor in sys.argv[1:]:
            temp = float(input("aaa: "))
            print(temp)
        
    else:
        temp = float(input("digite uma temperatura: "))
        print(temp)
        temp2 = float(input(": "))
        print(temp2)

# Função main
if __name__ == "__main__": # Caso o programa foi executado nesse mesmo arquivo, NÃO foi executado em um import -> se for por import o name NAÕ é main
    main()

# ---- COMANDOS -----
# ls ->>> ver todos arquivos que tem naquela pasta
# python3 nome_do_arquivo.py ->>> comando para rodar python o terminal/ executar o programa
# python3 nome_do_arquivo.py ARGUMENTO ->>> pode colocar argumentos também com o argv