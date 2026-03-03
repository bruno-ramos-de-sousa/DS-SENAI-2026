algoritmo "tabela de matriz"

var
celula: vetor [1..4, 1..4] de inteiro
l,c: inteiro
inicio
para l de 1 ate 4 faca
   para c de 1 ate 4 faca
      escreva ("Digite um valor para a posição [",l,",",c,"]: ")
      leia (celula[l,c])
   fimpara
fimpara
limpatela
para l de 1 ate 4 faca
   para c de 1 ate 4 faca
      escreva (celula[l,c])
   fimpara
   escreval
fimpara
fimalgoritmo
