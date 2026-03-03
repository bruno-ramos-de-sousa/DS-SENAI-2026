algoritmo "revisão-03"
var
nome, rept: literal

procedimento med ()
var
notas: vetor[1..4] de inteiro
media: real
i, soma: inteiro

inicio
media <- 0
soma <- 0
i <- 0

para i de 1 ate 4 faca
   escreval ("Digite a ", i,"ª nota do aluno: ")
   leia (notas[i])
   limpatela
   soma <- soma + notas[i]
fimpara

media <- soma / 4

se media >= 7 entao
   escreval (nome," está aprovado, com média de", media)
senao
   escreval (nome," está reprovado, com média de", media)
fimse

fimprocedimento

inicio
rept <- "s"
enquanto (rept = "s") ou (rept = "sim") faca
   limpatela
   escreval ("Digite o nome do aluno: ")
   leia (nome)
   limpatela
   med ()
   escreval ("------------------------------------------")
   escreval ("Deseja realizar a consulta de outro aluno?")
   leia (rept)
fimenquanto
fimalgoritmo
