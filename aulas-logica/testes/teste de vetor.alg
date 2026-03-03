algoritmo "teste de vetor"
var
valmes: vetor [1..12] de real
valano: real
valser: real
mes: inteiro
opt, tecla: caractere

inicio
repita
   limpatela
   escreval ("Digite o número de uma das opções")
   escreval ("[1] Informar um novo serviço")
   escreval ("[2] Exibir relatório")
   escreval ("[3] Sair")
   leia (opt)
   limpatela
   se opt = "3" entao
      interrompa
   fimse
   se opt = "1" entao
      escreval ("Digite o valor recebido do serviço: ")
      leia (valser)
      limpatela
      escreval ("Digite o mês em que foi recebido: ")
      leia (mes)
      limpatela
      valmes[mes] <- valser + valmes[mes]
      valano <- valser + valano
   fimse
   se opt = "2" entao
      escreval ("-----MESES-----")
      escreval ("")
      para mes de 0 ate 11 faca
         escreval ("Mês: ",mes+1 ," R$",valmes[mes+1])
      fimpara
      escreval ("")
      escreval ("------ANO------")
      escreval ("")
      escreval ("Recebido no ano: R$",valano)
      leia (tecla)
   fimse
   fimrepita
fimalgoritmo
