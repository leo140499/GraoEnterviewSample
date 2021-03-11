package com.Msoftwares.javaCore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Pensamento2 {

    public static void main(String[] args) {

        double investimento =100;
        double períodoDeinvestimento =36;
        double capital = investimento*períodoDeinvestimento;
        double taxa = 0.0425;
        double montante = 0;
        double taxaDiária;
        double totalInvestido = 0;
        double tempo;

        List<Double> taxasSalvas = new ArrayList<>();


        for(double i = 1; i<=252; i+=7){
            tempo = 1/i;
            taxaDiária = Math.pow((1+taxa), tempo);
            totalInvestido +=investimento;

            montante = investimento*Math.pow((1+taxa), tempo) + montante;


        }


        System.out.println("O total de lucro foi:" + " " + "R$ " +montante);
        System.out.println("O total economizado foi:" + " " + "R$ " + totalInvestido);
        System.out.println("Além de poupar, você terá um lucro com a grão de:" + " " + "R$ " + (montante-totalInvestido));



    }



}
