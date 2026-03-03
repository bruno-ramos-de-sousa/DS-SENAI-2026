algoritmo "semnome"
var
nom: literal
falt, freq, freqr, n1, n2, n3, n4, med: real
inicio
escreva ("Digite o nome do aluno: ")
leia (nom)

limpatela

escreva ("Digite a quantidade de faltas: ")
leia (falt)

limpatela

escreva ("Digite a primeira nota do aluno: ")
leia (n1)

limpatela

escreva ("Digite a segunda nota do aluno: ")
leia (n2)

limpatela

escreva ("Digite a terceira nota do aluno: ")
leia (n3)

limpatela

escreva ("Digite a quarta nota do aluno: ")
leia (n4)

limpatela

freq <- 200-falt
freqr <- freq/200*100
med <- (n1+n2+n3+n4)/4

se ((freq<150) e (med<5)) entao
   escreval ("Aluno: ",nom)
   escreval ("Média: ",med)
   escreval ("Frequencia do aluno: ",freqr,"%")
   escreva ("-----Aluno reprovado por faltas e nota!!-----")
   
fimalgoritmo

senao

se ((freq<150) e (med>=7)) entao
   escreval ("Aluno: ",nom)
   escreval ("Média: ",med)
   escreval ("Frequencia do aluno: ",freqr,"%")
   escreva ("-----Aluno reprovado por faltas!!-----")

fimalgoritmo

senao

se ((freq>150) e (med>=5) e (med<7)) entao
   escreval ("Aluno: ",nom)
   escreval ("Média: ",med)
   escreval ("Frequencia do aluno: ",freqr,"%")
   escreva ("--------Aluno em recuperação!!--------")
   
fimalgoritmo

senao

se ((freq>150) e (med>=7)) entao
   escreval ("Aluno: ",nom)
   escreval ("Média: ",med)
   escreval ("Frequencia do aluno: ",freqr,"%")
   escreva ("--------Aluno em aprovado!!--------")

fimse
fimse
fimse
fimse
fimalgoritmo
