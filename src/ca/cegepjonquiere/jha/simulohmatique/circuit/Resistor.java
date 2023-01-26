package ca.cegepjonquiere.jha.simulohmatique.circuit;

public class Resistor {
    private double resistance;
    private double tolerance;

    public Resistor(){
        resistance = 1;
    }

    public Resistor(double resistance, double tolerance) {
        this.resistance = resistance;
        this.tolerance = tolerance;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public double getTolerance() {
        return tolerance;
    }

    public void setTolerance(double tolerance) {
        this.tolerance = tolerance;
    }

    @Override
    public String toString() {
        return getResistance() + "Ω±" + Math.round(getTolerance() * 100) + "%";
    }
}
