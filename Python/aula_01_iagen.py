
print("Hello world") #comando de saída

nome = input("Digite seu nome: ") #input: comando de entrada com variável
idade = input("Digite sua idade: ")
print("Seu nome é", nome, "e sua idade é", idade) #concaternar ","

n1 = input("Digite o primeiro número: ")
n2 = input("Digite o segundo número: ")
soma = n1 + n2
print("A soma é", soma)

n1 = int(input("Digite o primeiro número: "))
n2 = int(input("Digite o segundo número: "))
soma = n1 + n2
print("A soma é", soma)

nome = "Bruno"
idade = 18
altura = 1.74
idoso = False
print(type(nome))
print(type(idade))
print(type(altura))
print(type(idoso))

print("Somar 2 com 2: ", 2 + 2)
print("Concaternar 2 com 2: ", '2' + '2')
print("Subtrair 2 com 2: ", 2 - 2)
print("Multiplicar 2 com 2: ", 2 * 2)
print("Dividir 2 com 2: ", 2 / 2)
print("Repete o 'PY' 2 vezes: ", 'PY' * 2)
print("Inteiro de 10 com 2: ", 10 // 2)
print("Resto de 10 com 2: ", 10 % 2)
print("2 ao cubo: ", 2 ** 3)

n1 = 5
n2 = 7
print(n1 == n2)
print(n1 != n2)
print(n1 >= n2)
print(n1 <= n2)
print(n1 > n2)
print(n1 < n2)

n1 = 5
n2 = 7
nome = "Bruno"
print(n1 == n2 and n1 >= n2)
print(n1 != n2 or n1 >= n2)
print(not n1 == n2)
print("ru" in nome)
print("ru" not in nome)

nome = "Bruno"
idade = 18
print("Seu nome é ", nome)
print("{}, você tem {} anos" .format(nome, idade))
print("{n}, você tem {i} anos" .format(n = nome, i = idade))
print(f"{nome}, você tem {idade} anos")
#Tipos diferentes de concatenação

