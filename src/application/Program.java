package application;

import entities.Aluno;
import entities.Homem;
import entities.Mulher;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Aluno> alunoList = new ArrayList<>();

        System.out.println("AVALIAÇÃO FÍSICA");
        System.out.print("Quantas avaliações física serão realizadas? ");
        int numeroDeAvaliacoes = sc.nextInt();

        for (int i = 1; i <= numeroDeAvaliacoes; i++ ) {
            sc.nextLine();
            System.out.print("Nome: ");
            String name2 = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.println("Digite uma observação sobre o aluno: ");
            sc.nextLine();
            String observacao = sc.nextLine();
            System.out.print("Pressão Arterial: ");
            String pressaoArterial = sc.nextLine();

            System.out.print("Peso: ");
            double peso = sc.nextDouble();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            System.out.print("Cintura: ");
            double cintura = sc.nextDouble();
            System.out.print("Quadril: ");
            double quadril = sc.nextDouble();
            System.out.print("Braço: ");
            double braco2 = sc.nextDouble();
            System.out.print("Coxa: ");
            double coxa = sc.nextDouble();

            System.out.println();
            System.out.print("O avaliado é HOMEM ou MULHER (h/m)? ");
            char escolha = sc.next().charAt(0);

            switch (escolha) {
                case 'h':
                    System.out.print("Dobra Peitoral: ");
                    double dobraPeitoral = sc.nextDouble();
                    System.out.print("Dobra Abdominal: ");
                    double dobraAbdominal = sc.nextDouble();
                    System.out.print("Dobra Coxa: ");
                    double dobraCoxa = sc.nextDouble();

                    alunoList.add(new Homem(name2,idade, new Date() ,observacao,
                            pressaoArterial, peso, altura,
                            cintura, quadril, braco2, coxa,
                            dobraPeitoral, dobraAbdominal, dobraCoxa));
                    break;

                case 'm':
                    System.out.print("Dobra Triciptal: ");
                    double dobraTriciptal = sc.nextDouble();
                    System.out.print("Dobra Suprailíaca: ");
                    double dobraSupraIliaca = sc.nextDouble();
                    System.out.print("Dobra Coxa: ");
                    double dobraCoxa2 = sc.nextDouble();

                    alunoList.add(new Mulher(name2, idade, new Date() ,observacao,
                            pressaoArterial, peso, altura,
                            cintura, quadril, braco2,
                            coxa, dobraTriciptal, dobraSupraIliaca, dobraCoxa2));
            }
        }

        System.out.println();
        for (Aluno aluno: alunoList) {
            System.out.println(aluno.toString());
            System.out.println(aluno.pollock3());
        }

        sc.close();
    }
}
