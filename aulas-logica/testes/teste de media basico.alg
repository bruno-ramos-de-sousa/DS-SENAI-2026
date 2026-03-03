algoritmo "Leitura de nome"

var
nome: caractere
idade: inteiro
nota1, nota2, nota3, nota4, media: real

inicio
escreva ("Digita seu nome: ")
leia (nome)

escreva ("Digite sua idade: ")
leia (idade)

escreval ("Olá ",nome," Sua idade é: ",idade)

escreva ("Digite a nota do primeiro bimestre: ")
leia (nota1)

escreva ("Digite a nota do segundo bimestre: ")
leia (nota2)

escreva ("Digite a nota do terceiro bimestre: ")
leia (nota3)

escreva ("Digite a nota do quarto bimestre: ")
leia (nota4)

media <- (nota1+nota2+nota3+nota4)/4
escreval (nome," Sua média é: ", media)

se (media<=5) entao
escreva ("Você foi reprovado")
senao
escreva ("Você foi aprovado")
fimse

fimalgoritmo
