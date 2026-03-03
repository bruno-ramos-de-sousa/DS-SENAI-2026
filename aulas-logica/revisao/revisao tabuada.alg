algoritmo "revisão-06"
var
n, cont, resul: inteiro

inicio
cont <- 1

escreval ("Digite um número para exibirmos sua respectiva tabuada: ")
leia (n)
limpatela

enquanto cont <= 10 faca
   resul <- n * cont
   escreval (n, " x", cont, " =", resul)
   cont <- cont + 1
fimenquanto

fimalgoritmo
