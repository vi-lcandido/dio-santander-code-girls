# Lógica Condicional e COntrole de Fluxos em Java
## Operadores relacionais
- não há como usar > < ou >= ou <= entre booleanos
- não há como comparar > < ou >= ou <= entre string
- não há como trabalhar numa comparação entre strign e char nem string com texto
- tem como comparar um long e um inteiro, um short e um byte, um short e um double, apesar de serem tipo de dados diferentes

## Operadores lógicos
- se aplicam somente a outros operadores lógicos ou expressões que retornem valores lógicos.

## Conceituação
- Conjunção (&& / and): operação lógica que só é verdadeira qnd ambos os operandos ou expressões envolvidas são verdade
- Disjunção (|| / or): operação que só é falsa qnd ambos os operandos ou expressões envolvidas são falsos
- Disjunção exclusiva (^ / xor): operação q só é verdade qnd ambos os operandos ou expressões são opostos (vf ou fv)
- Negação (! / inerção): inverte o valor lógico d eum operando ou expressão
- bitwise (& e |) - não é operação lógica mexe com bit de texto
- shift: não é operação lógica e tb mexe com bit