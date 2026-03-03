algoritmo "revisão-03"
var
nome: literal
notas: vetor[1..4] de inteiro
media: real
i, soma: inteiro

inicio
media <- 0
soma <- 0
i <- 0

escreval ("Digite seu nome: ")
leia (nome)
limpatela

para i de 1 ate 4 faca
   escreval ("Digite sua ", i,"ª nota: ")
   leia (notas[i])
   limpatela
   soma <- soma + notas[i]
fimpara

media <- soma / 4

se media >= 7 entao
   escreva ("Olá, ", nome," você está aprovado, com média de ", media)
senao
   escreva ("Olá, ", nome," você está reprovado, com média de ", media)
fimse

fimalgoritmo
