pessoas = {'Adelania':39, 'Samuel':18, 'Sophia':8, 'Brenda':17}

soma = 0
for i in pessoas:
    soma += pessoas[i]
    print(pessoas[i])


media = soma / len(pessoas)
print(f'a media das idades e {media}')
