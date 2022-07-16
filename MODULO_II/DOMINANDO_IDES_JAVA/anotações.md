 # Fases exucução JAVA
> 1 - escrever código fonte (extensão .java)
> 2 - JDK pra compilar o código fonte e gerar o arquivo bytecode
> 3 - pra executar a JVM lê o arquivo compila (.class) e as bibliotecas padrôes doJava que estão em JRE

** JDK X JDE **
> - JDK responsável por compilar código-fonte em bytecod
>> - faz parte do funcionamento das IDE's
> - JVM máquina virtual do java responsável por executar o bytecode
> - JRE - ambiente de execução do Java q fornece bibliotecas padrões p/ o JDK compilar o código e esse código será executado pelo JVM

** IDE ** - software q combina ferramentas comuns de desenvolvimento em uma única interface gráfica
> - Eclipse
> - IntelliJ

# Instalação JDK e GIT no Windows
- cria um programa com extensão .java
- o arquivo .class existe depois que eu compilo o arquivo java
- para compilar > no cmd digitar javac > "nomedoprogra.java" > enter
- para executar > entrar no cmd > java e escrever o nome do documento sem a extensão e dar enter
- pra poder rodar prcisa do public static void main pra poder rodar o programa

# Eclipse
- create a javaproject ou crtl+n ou file > new > javaproject
- nomear projeto
- colocar local de salvamento do projeto 
> - coloque no seu próprio workspace
- finish
> - se perguntar se quer criar um módulo java coloque **NÃO**
- após de criar a visualização a esquerda ficará diferente
- clicar no nome do projeto pra abrir o que tem abaixo
- __SRC__ - onde ficará o código fonte
- pra criar uma classe > clicar no SRC > crtl + n > digitar class > next (vai abrir uma janela) > nomear a classe > marcar a caixa que tem **public static void main** > finish
- escrever o código
- pra rodar é só clicar na seta verde "RUN (nomedoprograma)"
- clicar na caixa que indica pra salvar toda vez que for rodar o código
## Atalhos
- ctrl+3 = escolher perspectivas ou construct gerante fields o u criação de getter ou setter etc
- ctrl+d = deleta a linha
- ctrl+n = cria novo projeto
- /*   */ = início e fim de um comentário
 - alt + seta pra cima = move um bloca de lugar
 - ctrl + shift + f = refatora
  - ctrl +shift + o = importa
  - class no mesmo arquivos não há necessidade de importat, só os que estão fora do arquivo que está sendo alterado atualmente

  ## Git GitHub
  - na pasta src ficam os códigos fontes
  - na pasta bin ficam o .class
  - no projeto na aba do lado esquerdo > botão direito > team > share project 
  - no projeto na aba do lado esquerdo > botão direito > team > commit
 - na janela que abrir abaixo commit and push (olhar a de novo depois pra essa parte final)


 ## Debug
 - serve pra ajudar a encontrar e resolver o erro
 - ctrl + alt+ seta pra baixo = copia a linha
 - colocar o break point para indicar que a partir dele se faça o debug, estudar linha a linha pra achar o erro
 - ctrl+shift+t = procura a classe que quer
 - ctrl+w = fecha a aba
 - ctrl+shift+w = fecha tudo
 - clicar com botão direito na pasta do projeto > build path > configure build path > 

 # intellij

## criando primeiro programa 
 - new project > java > setar tudo como devido
 - ALT + INSERT = criar package ou class ou na parte do comando gera constructor ou getter e setter
 - ALT+ENTER = faz import
 - ctrl+o = limpa o import 
 - ctrl+y = deleta linha'
 - shift+f12 aumenta a tela
 - alt+1 - diminui a tela q aumentou

 ## mais atalhos e versionamento
 - shift +f6 = renomear a classe que fica na aba esquerda da tela
 - ctrl+alt+l = arruma refatorando o código
 - ctrl+d = duplica a linha
 - ctrl+shift+(setinha pra cima ou pra baixo) = mmuda de linha
 - subir no GIT
 > - na aba de cima clicar em GIT > commit

 ## debug
 - psvm ou main = cria public static vois main
 - ctrl+alt+v = priemiro clica no nome que foi criada > faz o comando pra criar a variável
 - colocar o ponto onde acha que o erro está ocorrendo > botão direito na área do código > debug (o console será alterado)
 - o debug executa até a última linha antes do breakpoint
 - step into pra entrar no método
 - step over volta 
- ctrl+f4 = fecha as abas
- ctrl+n = procura classes
- ctrl+b = entra em uma classe
- git tool box - mostra qm e qnd fez commit
- key prometer x - relacionado aos atalhos
 