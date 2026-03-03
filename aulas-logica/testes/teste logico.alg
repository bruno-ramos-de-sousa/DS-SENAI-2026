algoritmo "operadores"
var
nome: literal
num1: inteiro
virgula,n1,n2: real
r: logico

inicio
escreva ("Digite um nome qualquer: ")
leia (nome)

escreva ("Digite um número inteiro: ")
leia (num1)

escreva ("Digite um número com virgula (,): ")
leia (virgula)

escreva ("Digite um valor para comparar: ")
leia (n1)

escreva ("Digite outro valor: ")
leia (n2)

r <- n1 > n2
limpatela

escreval ("O nome digitado foi: ",nome)
escreval ("O número digitado foi: ", num1)
escreval ("O número com virgula foi: ", virgula)
escreval ("O resultado do teste lógico foi: ", r)
fimalgoritmo
