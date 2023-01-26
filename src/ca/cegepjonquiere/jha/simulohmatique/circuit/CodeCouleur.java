package ca.cegepjonquiere.jha.simulohmatique.circuit;

public enum CodeCouleur {
    N("Noir",   0, 1,            -1),
    B("Brun",   1, 10,           0.01),
    R("Rouge",  2, 100,          0.02),
    O("Orange", 3, 1_000,        -1 ),
    J("Jaune",  4, 10_000,       -1),
    V("Vert",   5, 100_000,      0.00_5),
    b("Bleu",   6, 1_000_000,    0.00_25),
    M("Mauve",  7, 10_000_000,   0.00_1),
    G("Gris",   8, 100_000_000,  0.00_05),
    L("Blanc",  9, 1_000_000_000,-1),
    o("Or",     -1,0.1,          0.05),
    A("Argent", -1,0.01,         0.1);

    private final String nom;
    private final int valeur;
    private final double multiplicateur;
    private final double tolerance;

    CodeCouleur(String nom, int valeur, double multiplicateur, double tolerance) {
        this.nom = nom;
        this.valeur = valeur;
        this.multiplicateur = multiplicateur;
        this.tolerance = tolerance;
    }

    public String getNom() {
        return nom;
    }

    public int getValeur() {
        return valeur;
    }

    public double getMultiplicateur() {
        return multiplicateur;
    }

    public double getTolerance() {
        return tolerance;
    }
}