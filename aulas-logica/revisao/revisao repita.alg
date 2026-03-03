algoritmo "revisão-04"
var
n: inteiro

inicio
repita
   limpatela
   escreval ("Escolha uma dessas opções para exibir um comentario do CM: ")
   escreval ("(1) Game of Thrones")
   escreval ("(2) Fallout")
   escreval ("(3) House of Dragons")
   leia (n)
ate ((n <= 3) e (n >= 1))

limpatela

se n = 1 entao
   escreval ("Essa serie é extremamente longa, e detalhada mais vale cada minuto ")
   escreva ("com uma construção de perssonagens é perfeita")
senao
   se n = 2 entao
      escreval ("Essa serie é curta, mais muito bem ambientada. Ótimo storytelling ")
      escreva ("e contextualização para quem nunca jogou os jogos")
   senao
      se n = 3 entao
         escreval ("Serie extremamente explicativa, explica a história que deu ")
         escreval ("inicio a narrativa de game of thrones com tensões e quebras ")
         escreva ("de expectativas em todos os cantos")
      fimse
   fimse
fimse

fimalgoritmo
