package ca.cegepjonquiere.jha.simulohmatique.circuit;

public class CircuitParallele extends Circuit{
    @Override
    public double calculerResistance() {
        double somme = 0;
        for(int i = 0; i < nbResistors; i++)
            somme += 1 / resistors[i].getResistance();

        return 1 / somme;
    }
}
