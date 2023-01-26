package ca.cegepjonquiere.jha.simulohmatique.circuit;

public class CircuitSerie extends Circuit {
    @Override
    public double calculerResistance() {
        double somme = 0;
        for(int i = 0; i < nbResistors; i++)
            somme += resistors[i].getResistance();

        return somme;
    }
}
