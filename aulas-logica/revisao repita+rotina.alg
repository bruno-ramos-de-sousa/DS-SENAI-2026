algoritmo "revisão-04.2"
var
n: inteiro
ca, c: caractere

procedimento menu()
var

inicio

repita
   limpatela
   escreval ("Escolha uma dessas opções para exibir um comentario do CM: ")
   escreval ("(1) Game of Thrones")
   escreval ("(2) Fallout")
   escreval ("(3) House of Dragons")
   leia (n)

limpatela

ate ((n < 4) e (n > 0))

fimprocedimento

inicio
ca <- "sim"

enquanto (ca = "sim") ou (ca = "s") faca
menu ()

se n = 1 entao
   escreval ("Essa serie é extremamente longa, e detalhada mais vale cada minuto ")
   escreval ("com uma construção de perssonagens é perfeita")
   leia (c)
senao
   se n = 2 entao
      escreval ("Essa serie é curta, mais muito bem ambientada. Ótimo storytelling ")
      escreval ("e contextualização para quem nunca jogou os jogos")
      leia (c)
   senao
      se n = 3 entao
         escreval ("Serie extremamente explicativa, explica a história que deu ")
         escreval ("inicio a narrativa de game of thrones com tensões e quebras ")
         escreval ("de expectativas em todos os cantos")
         leia (c)
      fimse
   fimse
fimse

limpatela

escreval ("--------------------------------------------------------------------")
escreval ("------------------Você deseja voltar ao menu? (S/N)-----------------")
leia (ca)

limpatela

fimenquanto

fimalgoritmo
