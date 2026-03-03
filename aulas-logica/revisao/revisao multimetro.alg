algoritmo "revisão-07"
var
tens: real
led, retrn: logico
sit, caract: caractere
esco: inteiro

inicio
retrn <- falso
led <- verdadeiro

enquanto sit <> "S" faca
   limpatela
   escreval ("Você ligou o multímetro? (S/N)")
   leia (sit)
fimenquanto

enquanto retrn = falso faca

   limpatela

   escreval ("Qual medição você deseja fazer? ")
   escreval ("(1) voltagem")
   escreval ("(2) Amperagem")
   escreval ("(3) Resistência")
   leia (esco)
   limpatela
   escolha (esco)

   caso 1
      escreval ("Qual a tensão exibida na leitura do led? ")
      leia (tens)

      limpatela

      se tens < 0 entao
         escreva ("Led desligado")
         leia (caract)
      senao
         se tens < 1.9 entao
            escreval ("O led está ligado com pouca luminosidade")
            leia (caract)
         senao
            se tens < 3 entao
               escreval ("O led está ligado com alta luminosidade")
               leia (caract)
            senao
               se tens > 3 entao
                  escreval ("Led desligado")
                  leia (caract)
                  led <- falso
               fimse
            fimse
         fimse
      fimse

      limpatela

      se led = falso entao
         escreval ("Você torrou o led -R$0,10")
      senao
         escreval ("Leitura normal")
      fimse
      retrn <- verdadeiro

   caso 2
      escreval ("Qual a corrente exibida em Micro Ampere?")
      leia (tens)

      limpatela

      se tens < 6 entao
         escreva ("Led desligado")
      senao
         se tens < 10 entao
            escreval ("O led está ligado com pouca luminosidade")
            leia (caract)
         senao
            se tens < 20 entao
               escreval ("O led está ligado com alta luminosidade")
               leia (caract)
            senao
               se tens > 20 entao
                  escreval ("Led desligao")
                  leia (caract)
                  led <- falso
               fimse
            fimse
         fimse
      fimse
      se led = falso entao
         escreval ("Você torrou o led -R$0,10")
      senao
         escreval ("Leitura normal")
      fimse
      retrn <- verdadeiro

   caso 3
      escreval ("Qual a ressistência exibida em ohms?")
      leia (tens)

      limpatela

      se tens < 0 entao
         escreva ("Curto")
         led < falso
      senao
         se tens < 20 entao
            escreval ("Resistência baixa")
            leia (caract)
         senao
            se tens < 100 entao
               escreval ("Resistência média")
               leia (caract)
            senao
               se tens > 100 entao
                  escreval ("Alta resistência")
                  leia (caract)
               fimse
            fimse
         fimse
      fimse
      se led = falso entao
         escreval ("Você torrou o equipamento -R$0,10")
      senao
         escreval ("Leitura normal")
         retrn <- verdadeiro
      fimse
   outrocaso
      retrn <- falso
   fimescolha
fimenquanto

fimalgoritmo
