import org.w3c.dom.ls.LSOutput;

public class Main {

     public static void main(String[] args) {
         int i;
         // int i não pode criar variaveis com mesmo nome
         int I; //por ser case sensitive não há problema em ter uma variável com I e i
         //int 1a não pode criar variavel com número
         int _ia;// não é boa pratíca iniciar var com _ ou $
         int $ia;// não é boa pratíca iniciar var com _ ou $

         i = 5;
         I = 10;
         _ia = 20;
         $ia = 7;

         final int j = 10;
         //j = 15; errado pois j é constante por causa do j
         int qwe1rty4;
         //int qwe rty não é permitido ter espaço no nome da variável
         int qwe1$rty3_md = 10; //não é usual usar $ e _ em nome de variável
         //int qwe1rty2%mf não pode usar o %

         qwe1rty4 = 100;
         qwe1$rty3_md = 10;

         int quantidaProduto = 50;
         //int QuantidadeProduto; não começar ocm letra minúscula
         final int NUMERO_TENTATIVAS = 5;
         //final int numeroTentativas = 5; não segue a boa prática de tudo maiusculo para variável final
         int QUANTIDADE_OPCOES = 25; //não segue boa prática de apenas final com letras maiúsculas
         //int qtdProd; não é boa prática pois não é explicativa

         System.out.println(i);
         System.out.println(I);
         System.out.println(_ia);
         System.out.println($ia);

         System.out.println(j);
         System.out.println(qwe1rty4);
         System.out.println(qwe1$rty3_md);

         System.out.println(quantidaProduto);
         System.out.println(NUMERO_TENTATIVAS);
         System.out.println(QUANTIDADE_OPCOES);

     }
}
