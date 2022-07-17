# Entendendo métodos
## criaçõa de método
- visibilidade - public, protected ou private 
- tipo - concreto ou abstrato
- modificador - static ou final possibilita chamar um método a partir de uma classe 
- retoro - tipo de dado ou void
- nome - que é fornecido so método
- parÂmetros - estará dentro dos ()
- exceções
- código que possui ou vazio
### Utilização
- precisa chamar o método a partir de uma classe ou objeto
### Particularidades
- assinatura é a forma de identifica runicamente um método é definida pelo seu nome + seus parâmetros.
- construtor e destrutor: são métodos especiais usados na orientação a objetos
- Mensagem: é o ato de solicitar ao método que o mesmo execute. Pode ser direcionado a um objeto ou a uma classe
- Passagem de parâmetros
>- por valor (cópia)
>- por referência (endereço)

## Sobrecagra
- capacidade de definir métodos para diferentes contextos, ou seja, um mesmo método vai se comportar de forma diferente de acordo com alguma necessidade mas preservando seu nome
>- pra que isso aconteça muda-se a lista de parâmetros 
>- converterParaInteiro (float f)
>- converterParaInteiro (double d)
>- converterParaInteiro (String s)
>- converterParaInteiro (float f, RoundType rd)
>- converterParaInteiro (double d, RoundType rd) etc
>- se mudar a sequencia dos parâmetros ou manter o parâmetro vazio é outro sobrecarga