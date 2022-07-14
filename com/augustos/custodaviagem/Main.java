package com.augustos.custodaviagem;

import java.util.Scanner;

/*
    CUSTO DA VIAGEM
 - Pedir ao utilizador que insira o titulo da viagem
 - Pedir ao utilizador que insira o nr de kilometros
 - Pedir ao utilizador que insira o consumo do veículo em litros/100km;
 - Pedir ao utilizador que insira o preço do combustível usado em euros por litro;
 - No final, apresentar ao utilizador o resultado do cálculo do custo total do combustível para a viagem.
 */
public class Main {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        /** Program start **/
        while(true) {
            System.out.println("Escolha uma opção:");
            System.out.println("\t(1) Veiculo a combustao;");
            System.out.println("\t(2) Veiculo eletrico;");
            System.out.println("\t(3) Sair;");
            String opcao = in.nextLine();

            if (!opcao.equalsIgnoreCase("3")) {

                System.out.println("Insira o titulo da viagem");
                String titulo = in.nextLine();

                System.out.println("Insira o nr de kilometros");
                Double kilometros = in.nextDouble();

                boolean isICE = opcao.equalsIgnoreCase("1");
                String tipoConsumo = isICE ? "litros/100km" : "kW/100km";
                String tipoPreco = isICE ? "do combustivel usado em euros por litro" : "da eletricidade usado em euros por kW";

                System.out.println("Insira o consumo do veículo em " + tipoConsumo);
                Double consumo = in.nextDouble();

                System.out.println("Insira o preço " + tipoPreco);
                Float preco = in.nextFloat();

                System.out.println("Insira o preço total das portagens");
                Float portagens = in.nextFloat();

                Double totalLitros = (kilometros * consumo) / 100;
                Double total = totalLitros * preco;
                total += portagens;

                System.out.println("=======================================================");
                System.out.println("Custo total da viagem '" + titulo + "': " + String.format("%.02f", total) + " euros.");

            } else if (opcao.equalsIgnoreCase("3")) {
                return;
            } else {
                System.out.println("Opção Inválida");
            }

            in.nextLine();
            in.nextLine();
        }
//            in.close();

    }
}
