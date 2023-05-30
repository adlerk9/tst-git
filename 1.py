lista = list()
tupla = tuple()
dicionario = dict()

conjuto = set()
conjuto2 = {"Kokin", "Isa", "Bia", "Bia", "Joao"}

buscar = input('Digite o nome que voce quer?')
for nome in conjuto2:
    if(nome == buscar):
        conjuto2.remove(nome)
        print('o nome foi removido!')
        break
print(conjuto2)
