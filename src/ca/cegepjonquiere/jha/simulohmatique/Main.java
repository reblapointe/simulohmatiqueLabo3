package ca.cegepjonquiere.jha.simulohmatique;

import ca.cegepjonquiere.jha.simulohmatique.circuit.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String entree;

        System.out.println("CALCULATEUR DE CIRCUITS PARALLELE OU EN SÉRIE DE RESISTORS");
        System.out.println("--------------------------------------------------------------------------------");;

        System.out.println("\n(P)arallèle ou en (S)érie?");

        entree = in.next();
        Circuit c;
        if (entree.equals("P"))
            c = new CircuitParallele();
        else
            c = new CircuitSerie();


        System.out.println("\nEntrez des résistors séparés par des virgules, sans espaces");
        entree = in.next();
        String[] resistors = entree.split(",");
        for(String resistor : resistors)
        {
            Resistor r  = FabriqueResistor.fabriquerResistor(resistor);
            if (r != null)
                c.ajouterResistor(r);
        }
        System.out.println("Entrez une tension en volt");
        c.mettreSousTension(in.nextDouble());

        System.out.println("Le circuit a les propriétés suivantes : ");
        System.out.println(c);
    }
}
