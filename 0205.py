pessoas = {'12344': ['brenda', 17, 98], '45456': ['luisa', 19, 90]}
soma = 0
op = 345

while(op != 0):
    print('1- cadastrar pessoa')
    print('2-listar pessoas')
    print('3- exibir a media de idade das pessoas')
    print('4- buscar uma pessoa pelo cpf')

    op = int(input('digite a opcao desejada'))
 == 1):
        nome = input('digite o nome')
        cpf = input('digite o cpf')
        idade = int(input('digite a idade'))
        nota = float(input('digite a nota'))

        pessoas[cpf] = [nome, idade, nota]

    elif(op == 2):
        for cpf in pessoas:
            print('\n\n Nome -  Idade - Nota \n')
            print(f' {pessoas[cpf][0]} - {pessoas[cpf][1]} - {pessoas[cpf][2]}')

    elif(op == 3):
        for cpf in pessoas:
            soma += pessoas[cpf][1]
        media = soma / len(pessoas)
        print(f'\na media de idades é de {media} anos\n')

    elif(op == 4):
        busca = input('digite o cpf que deseja buscar')
        entrou = False

        for cpf in pessoas:
            if(cpf[0].find(busca) >= 0):
                rint(cpf[1])
                entrou = True
        if (entrou == False):
            print('cadastro nao encontrado')
