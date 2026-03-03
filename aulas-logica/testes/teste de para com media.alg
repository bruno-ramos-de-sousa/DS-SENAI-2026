algoritmo "calculo de média com para"
var
n1: caractere
nt1, nt2, nt3, nt4, x: inteiro
med: real

inicio
x <- 1
para x de 1 ate 4 faca

   escreval ("Digite o nome do aluno:")
   leia(n1)

   limpatela

   escreval ("Qual a nota do primeiro bimestre desse aluno?")
   leia (nt1)

   limpatela

   escreval ("Qual a nota do segundo bimestre desse aluno?")
   leia (nt2)

   limpatela

   escreval ("Qual a nota do terceiro bimestre desse aluno?")
   leia (nt3)

   limpatela

   escreval ("Qual a nota do quarto bimestre desse aluno?")
   leia (nt4)

   limpatela

   med <- (nt1 + nt2 + nt3 + nt4) / 4

   se (med < 4) entao
      escreval ("O aluno: ",n1)
      escreval ("média: ", med)
      escreval ("----------Aluno reprovado sem recuperação----------")
      escreval ("")
   senao

      se (med <= 6) entao
         escreval ("O aluno: ",n1)
         escreval ("média: ", med)
         escreval ("----------------Aluno em recuperação---------------")
         escreval ("")
      senao

         escreval ("O aluno: ",n1)
         escreval ("média: ", med)
         escreval ("-------------------Aluno aprovado------------------")
         escreval ("")
      fimse
   fimse


x <- x + 1

fimpara
fimalgoritmo
