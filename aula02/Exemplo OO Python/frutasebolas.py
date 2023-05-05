def descreve_fruta(nome:str,cor:str,peso:int,preço:float):
    print(f"A fruta {nome} tem cor {cor}, pesa {peso}g e custa R${preço}")

def descreve_bola(nome,cor,preço):
    print(f"A bola {nome} tem cor {cor} e custa R${preço}")

def main():
    nome_banana = "Banana"
    cor_banana = "amarela"
    peso_banana = 300
    preço_banana = 4

    nome_maçã1 = "Maçã 1"
    cor_maçã1 = "vermelha"
    peso_maçã1 = 240
    preço_maçã1 = 3

    nome_maçã2 = "Maçã 2"
    cor_maçã2 = "verde"
    peso_maçã2 = 260
    preço_maçã2 = 3

    nome_bola = "Jabulani"
    cor_bola = "preta e branca"
    preço_bola = 100

    descreve_fruta(nome_banana,cor_banana,peso_banana,preço_banana)
    descreve_fruta(nome_maçã1,cor_maçã1,peso_maçã1,preço_maçã1)
    descreve_fruta(nome_maçã2,cor_maçã2,peso_maçã2,preço_maçã2)    

    descreve_bola(nome_bola,cor_bola,preço_bola)

if __name__ == "__main__":
    main()