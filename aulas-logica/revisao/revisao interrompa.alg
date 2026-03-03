algoritmo "revisão-05"
var
n: inteiro

inicio
repita
   limpatela
   escreval ("Escolha uma dessas opções para exibir um comentário do CM: ")
   escreval ("(1) Game of Thrones")
   escreval ("(2) Fallout")
   escreval ("(3) House of Dragons")
   escreval ("(4) Sair")
   leia (n)
ate ((n <= 4) e (n >= 1))

limpatela

se n = 1 entao
   escreval ("Essa serie é extremamente longa, e detalhada mais vale cada minuto. ")
   escreval ("Essa serie possui uma construção de perssonagens é perfeita")
senao
   se n = 2 entao
      escreval ("Essa serie é curta, mais muito bem ambientada. Ótimo storytelling ")
      escreval ("e contextualização para quem nunca jogou os jogos")
   senao
      se n = 3 entao
         escreval ("Serie extremamente criativa, seu enredo explica a história que deu ")
         escreval ("inicio a narrativa de game of thrones com tensões e quebras ")
         escreval ("de expectativas em todos os cantos")
      senao
         se n = 4 entao
            interrompa
         fimse
      fimse
   fimse
fimse

fimalgoritmo
