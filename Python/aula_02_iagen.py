nome = "Bruno"
print(nome)
valora = 7
print(valora)
valorb = 77
print(valorb)

nome = "Bruno"
idade = 18
altura = 1.75
gosta_de_feijao_com_farinha = True

print(f"Olá, meu nome é {nome}, tenho {idade} anos, meço {altura}m de altura e gosto de feijão com farinha? {gosta_de_feijao_com_farinha}")

num1 = 20
num2 = 30
num3 = (num1 + num2)
print(f"A soma dos dois valores é {num3}")

from os import read
num1 = 20
num2 = 30
print(f"A soma dos dois valores é {num1 + num2}")

n1 = float(input("Digite a primeira nota: "))
n2 = float(input("Digite a segunda nota: "))
n3 = float(input("Digite a terceira nota: "))
n4 = float(input("Digite a quarta nota: "))
print(f"A média desse alune é {round((n1+n2+n3+n4)/4)}")

n1 = int(input("Digite o número que você deseja anaçisar: "))

print(f"{n1 - 1} é o antecessor desse número e {n1 + 1} é seu sucessor.")

n1 = float(input("Digite o Salario do colaborador: R$"))

print("O aumento de salário foi de 8%")
print(f"O valor do aumento desse colaborador foi de R${n1*8/100}")
print(f"O novo salário desse colaborar corresponde a R${(n1*8/100)+n1}")

rep = int(input("Digite o número de operações que você deseja realizar: "))
cont = 0

while cont < rep:

  n1 = int(input("Digite o primeiro número da equação: "))
  n2 = int(input("Digite o segundo número da equação: "))
  op = str(input("Digite a operação que você deseja fazer ( + - * / )"))

  if (n2 == 0 and op == "/"):
    print("Não se deve dividir por 0")
    print("Operação invalida")
  else:
    match op:
      case '+':
        print(f"O resultado dessa equação foi {n1 + n2}")
      case '-':
        print(f"O resultado dessa equação foi {n1 - n2}")
      case '*':
        print(f"O resultado dessa equação foi {n1 * n2}")
      case '/':
        print(f"O resultado dessa equação foi {n1 / n2}")

  cont += 1

n1 = float(input("Digite a primeira nota: "))
n2 = float(input("Digite a segunda nota: "))
n3 = float(input("Digite a terceira nota: "))
n4 = float(input("Digite a quarta nota: "))
media = (n1+n2+n3+n4)/4
print(f"A média desse alune é {round(media)}")

if media < 6:
  print("O aluno está reprovado!!!!")
elif media > 6:
  print("O aluno está aprovado!!!!")
else:
  print("O aluno está de recuperação")

n1 = float(input("Digite a nota do exame: "))
n2 = float(input("Digite a nota do laboratorio: "))
n3 = float(input("Digite a nota do trabalho: "))
n4 = float(input("Digite a nota do segundo trabalho: "))
p1 = float(input("Digite o peso da primeira nota: "))
p2 = float(input("Digite o peso da segunda nota: "))
p3 = float(input("Digite o peso da terceira nota: "))
p4 = float(input("Digite o peso da quarta nota: "))

media = round((n1*p1+n2*p2+n3*p3+n4*p4)/(p1+p2+p3+p4))

print(f"A média deste aluno é {media}")

if media < 6:
  print("O aluno está reprovado!!!!")
elif media > 6:
  print("O aluno está aprovado!!!!")
else:
  print("O aluno está de recuperação")