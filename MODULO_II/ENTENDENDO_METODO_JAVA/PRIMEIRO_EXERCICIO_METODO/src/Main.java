public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(10, 5);
        Calculadora.divisao(45, 9.5);
        Calculadora.multiplicacao(5, 2.5);

        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(1);

        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);






    }

}
