package one.dio.aula1;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio calculadora:");
        Calculadora.soma(3,4);
        Calculadora.subtracao(7,3.5);
        Calculadora.multiplicacao(6,8);
        Calculadora.divisao(10,4);

        //Mensagem do dia
        System.out.println("Exercício Mensagem:");
        Mensagem.obterMensagem(2);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(25);

        //Emprestimo
        System.out.println("Exercício empréstimo:");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,3);
        Emprestimo.calcular(1000,5);

    }

}
