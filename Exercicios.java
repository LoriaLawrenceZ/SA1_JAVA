package SA1_JAVA;

import java.util.Scanner;

public class Exercicios {
    Scanner in = new Scanner(System.in, "latin1");

    public void Millenium(){
        int operacao;
        double num1, num2, resultado;

        System.out.println("\n----------------------------------------------CALCULADORA----------------------------------------------\n");

        System.out.println("Insira o primeiro valor:\n[Apenas números]");
        num1 = in.nextDouble();

        System.out.println("\nInsira o segundo valor:\n[Apenas números]");
        num2 = in.nextDouble();

        System.out.println("\nQual operação aritmética deseja realizar?\n[1] - Adição\n[2] - Subtração\n[3] - Multiplicação\n[4] - Divisão");
        operacao = in.nextInt();

        if(operacao == 1){
            resultado = (num1 + num2);

            System.out.println("\n--------------------------------------------------------\nA ADIÇÃO entre "+ num1 +" e "+ num2 +" é equivalente à: "+ resultado+"\n--------------------------------------------------------");
        }
        else if(operacao == 2){
            resultado = (num1 - num2);

            System.out.println("\n--------------------------------------------------------\nA SUBTRAÇÃO entre "+ num1 +" e "+ num2 +" é equivalente à: "+ resultado+"\n--------------------------------------------------------");
        }
        else if(operacao == 3){
            resultado = (num1 * num2);

            System.out.println("\n--------------------------------------------------------\nA MULTIPLICAÇÃO entre "+ num1 +" e "+ num2 +" é equivalente à: "+ resultado+"\n--------------------------------------------------------");
        }
        else if(operacao == 4 && num2 != 0){
            resultado = (num1 + num2);

            System.out.println("\n--------------------------------------------------------\nA DIVISÃO entre "+ num1 +" e "+ num2 +" é equivalente à: "+ resultado +"\n--------------------------------------------------------");
        }
        else{
            System.out.println("Não é possível realizar a operação matemática pois não é valido dividir numeros por 0\n[Seu segundo numero informado foi 0]");
        }
    }

    public void Brooklyn(){
        int numMatricula, turma;

        System.out.println("\nInsira o número de matrícula de aluno\n[Números inteiros]\n[Apenas números]");
        numMatricula = in.nextInt();

        turma = (numMatricula % 4);

        if(turma == 0){
            System.out.println("\n--------------------------------------------------------\nO aluno jogará para o Time do Chris\n--------------------------------------------------------");
        }
        else if(turma == 1){
            System.out.println("\n--------------------------------------------------------\nO aluno jogará para o Time do Greg\n--------------------------------------------------------");
        }
        else if(turma == 2){
            System.out.println("\n--------------------------------------------------------\nO aluno jogará para o Time do Caruso\n--------------------------------------------------------");
        }
        else{
            System.out.println("\n--------------------------------------------------------\nO aluno jogará para o Time do Jerome\n--------------------------------------------------------");
        }
    }

    public void Madruga(){
        double kgMorango, kgMaca, kgBanana, pesoTotal, valorMorango, valorMaca, valorBanana, valorTotal, valorCOMdesconto;

        System.out.println("\nQuitanda do seu madruga está ferecendo a seguinte tabela de preços\n---------------------------\n|Morangos: R$ 3,50 o kilo |\n|Maças: R$2,30 o kilo     |\n|Bananas: R$ 1,80 o kilo  |\n---------------------------");

        System.out.println("\nInforme a quantidade de Morangos que deseja adquirir\n[Em quilogramas]\n[Apenas números]");
        kgMorango = in.nextDouble();

        System.out.println("\nInforme a quantidade de Maçãs que deseja adquirir\n[Em quilogramas]\n[Apenas números]");
        kgMaca = in.nextDouble();

        System.out.println("\nInforme a quantidade de Bananas que deseja adquirir\n[Em quilogramas]\n[Apenas números]");
        kgBanana = in.nextDouble();

        pesoTotal = (kgMorango + kgMaca + kgBanana);

        valorMorango = (kgMorango * 3.50);
        valorMaca = (kgMaca * 2.30);
        valorBanana = (kgBanana * 1.80);

        valorTotal = (valorMorango + valorMaca + valorBanana);

        if(pesoTotal > 15 || valorTotal > 30){
            valorCOMdesconto = (valorTotal * 0.9);

            System.out.println("\n--------------------------------------------------------\nO valor a ser pago é de "+ valorCOMdesconto +" R$ (reais)\n--------------------------------------------------------");
        }
        else{
            System.out.println("\n--------------------------------------------------------\nO valor a ser pago é de "+ valorTotal +" R$ (reais)\n--------------------------------------------------------");
        }
    }
}
