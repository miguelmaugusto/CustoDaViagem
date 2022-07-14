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
        System.out.println("Insira o titulo da viagem");
        String titulo = in.nextLine();

        System.out.println("Insira o nr de kilometros");
        Double kilometros = in.nextDouble();

        System.out.println("Insira o consumo do veículo em litros/100km");
        Double consumo = in.nextDouble();

        System.out.println("Insira o preço do combustível usado em euros por litro");
        Float preco = in.nextFloat();

        Double totalLitros = kilometros*consumo/100;
        Double total = totalLitros*preco;
        System.out.println("=======================================================");
        System.out.println("Custo total da viagem: " + String.format("%.02f", total) + " euros.");

    }
}
