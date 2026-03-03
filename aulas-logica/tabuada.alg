algoritmo "Tabuada"
var
n, multi, m: inteiro

inicio

multi <- 0

escreva ("Digite o número para exibir a tabuada: ")
leia (n)
limpatela

escreval ("Essa é a tabudada do", n)

enquanto (multi < 10) faca
   multi <- multi + 1
   m <- n *multi
   escreval (n, " x ", multi, " = ", m)
fimenquanto

fimalgoritmo
