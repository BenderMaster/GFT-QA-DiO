package one.metodos;

import one.metodos.aula2.Quadrilatero;
import one.metodos.aula3.QuadrilateroReturn;

public class Main {

    public static void main(String[] args) {

        //Exercício da aula 1------------------

        /*
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
        */

        //Exercício aula 2---------------------


        System.out.println("\nExercício áreas:");
        Quadrilatero.area(2);
        Quadrilatero.area(5d,3d);
        Quadrilatero.area(4,5,3);
        Quadrilatero.area(4f,6f);

        //Exercício aula 3---------------------

        System.out.println("\nExercício retornos:");
        double areaQuadrado = QuadrilateroReturn.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroReturn.area(3d,5d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroReturn.area(4,3,3);
        System.out.println("Área do trapézio: " + areaTrapezio);

        double areaLosango = QuadrilateroReturn.area(4f,5f);
        System.out.println("Área do losango: " + areaLosango);

    }

}
