# JDK 
* Ambiente de execução
# JRE
* Ferramentas de desenvolvimento + ambiente de execução
# JVM
* Máquina virtual que executa o bytecode

# Observações

-> divisões de inteiro por inteiro, sempre serão retornados valores inteiros. O java trunca o resultado
ex: 5 / 2  
esperado: 2,5
retorno: 2

-> com isso, é necessário definir a variavel como double para não perder os decimais e também definir um 
dos valores com double
ex: 5.0 / 2
retorno: 2.5

-> o valor int armazena apenas valores até 32 bits, após isso, poderá acontecer overflow
-> com isso, utiliza-se o long
-> short para guardar valores menores que 16 bits

-> char usado para guardar um único caractere

pesquisar sobre formaters in java