package ca.cegepjonquiere.jha.simulohmatique.circuit;


public class Circuit {
    protected Resistor[] resistors = new Resistor[20];
    protected int nbResistors = 0;
    protected double tension;

    public double calculerCourant() {
        return tension / calculerResistance();
    }

    public double calculerTension() {
        return tension;
    }

    public double calculerResistance() {
        return 0;
    }

    public void mettreSousTension(double tension) {
        this.tension = tension;
    }

    public void ajouterResistor(Resistor c) {
        if (nbResistors == 20)
            return;
        resistors[nbResistors++] = c;
        if (tension > 0)
            mettreSousTension(tension);
    }

    public String toString()
    {
        StringBuilder ret = new StringBuilder();
        ret.append(calculerResistance() + "Ω, " + calculerCourant() + "A, " + calculerTension() + "V.\n");
        for(int i = 0; i < nbResistors; i++)
            ret.append(resistors[i].toString()).append(i == nbResistors - 1 ? "" : ", ");
        return ret.toString();
    }
}
