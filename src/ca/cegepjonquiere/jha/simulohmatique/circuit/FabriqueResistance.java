package ca.cegepjonquiere.jha.simulohmatique.circuit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FabriqueResistance {

    public static final String PATRON_RESISTANCE = "[BROJVbMGL][NBROJVbMGL]{1,2}[NBROJVbMoA][NBROJVbMoA]";
    public static Pattern patronCode = Pattern.compile(PATRON_RESISTANCE);

    public static Resistor fabriquerResistance(String code)
    {
        Matcher matcher = patronCode.matcher(code);

        if (!matcher.matches())
            return null;
        code = matcher.group();
        double valeur = 0;
        int ind = 0;
        int mult = code.length() == 5 ? 100 : 10;

        valeur += CodeCouleur.valueOf(code.substring(ind,++ind)).getValeur() * mult;
        valeur += CodeCouleur.valueOf(code.substring(ind,++ind)).getValeur() * (mult / 10.0);
        valeur += code.length() == 5 ? CodeCouleur.valueOf(code.substring(ind, ++ind)).getValeur() : 0;
        valeur *= CodeCouleur.valueOf(code.substring(ind, ++ind)).getMultiplicateur();

        return new Resistor(valeur, CodeCouleur.valueOf(code.substring(ind, ++ind)).getTolerance());
    }
}
