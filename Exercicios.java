package SA1_JAVA;

import java.util.Scanner;

public class Exercicios {
    Scanner in = new Scanner(System.in, "latin1");

    public void Millenium(){
        int operacao;
        double num1, num2, resultado;

        System.out.println("Insira o primeiro valor:\n[Apenas números]");
        num1 = in.nextDouble();

        System.out.println("Insira o segundo valor:\n[Apenas números]");
        num2 = in.nextDouble();

        System.out.println("Qual operação aritmética deseja realizar?\n[1] - Adição\n[2] - Subtração\n[3] - Multiplicação\n[4] - Divisão");
        operacao = in.nextInt();

        if(operacao == 1){
            resultado = (num1 + num2);

            System.out.println("A adição entre "+ num1 +" e "+ num2 +" é equivalente à: "+ resultado);
        }
        else if(operacao == 2){
            resultado = (num1 - num2);

            System.out.println("A subtração entre "+ num1 +" e "+ num2 +" é equivalente à: "+ resultado);
        }
        else if(operacao == 3){
            resultado = (num1 * num2);

            System.out.println("A multiplicação entre "+ num1 +" e "+ num2 +" é equivalente à: "+ resultado);
        }
        else if(operacao == 4 && num2 != 0){
            resultado = (num1 + num2);

            System.out.println("A adição entre "+ num1 +" e "+ num2 +" é equivalente à: "+ resultado);
        }
        else{
            System.out.println("Não é possível realizar a operação matemática pois não é valido dividir numeros por 0\n[Seu segundo numero informado foi 0]");
        }
    }

    public void Brooklyn(){
        int numMatricula, turma;

        System.out.println("Insira o número de matrícula de aluno\n[Números inteiros]\n[Apenas números]");
        numMatricula = in.nextInt();

        turma = (numMatricula % 4);

        if(turma == 0){
            System.out.println("O aluno jogará para o Time do Chris");
        }
        else if(turma == 1){
            System.out.println("O aluno jogará para o Time do Greg");
        }
        else if(turma == 2){
            System.out.println("O aluno jogará para o Time do Caruso");
        }
        else{
            System.out.println("O aluno jogará para o Time do Jerome");
        }
    }

    public void Madruga(){
        double kgMorango, kgMaca, kgBanana, pesoTotal, valorMorango, valorMaca, valorBanana, valorTotal, valorCOMdesconto;

        System.out.println("Quitanda do seu madruga está ferecendo a seguinte tabela de preços\nMorangos: R$ 3,50 o kilo\nMaças: R$2,30 o kilo\nBananas: R$ 1,80 o kilo;");

        System.out.println("Informe a quantidade de Morangos que deseja adquirir\n[Em quilogramas]\n[Apenas números]");
        kgMorango = in.nextDouble();

        System.out.println("Informe a quantidade de Maçãs que deseja adquirir\n[Em quilogramas]\n[Apenas números]");
        kgMaca = in.nextDouble();

        System.out.println("Informe a quantidade de Bananas que deseja adquirir\n[Em quilogramas]\n[Apenas números]");
        kgBanana = in.nextDouble();

        pesoTotal = (kgMorango + kgMaca + kgBanana);

        valorMorango = (kgMorango * 3.50);
        valorMaca = (kgMaca * 2.30);
        valorBanana = (kgBanana * 1.80);

        valorTotal = (valorMorango + valorMaca + valorBanana);

        if(pesoTotal > 15 || valorTotal > 30){
            valorCOMdesconto = (valorTotal * 0.9);

            System.out.println("O valor a ser pago é de "+ valorCOMdesconto +" R$ (reais)");
        }
        else{
            System.out.println("O valor a ser pago é de "+ valorTotal+" R$ (reais)");
        }
    }
}
