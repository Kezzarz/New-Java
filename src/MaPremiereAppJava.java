import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class MaPremiereAppJava {
    public static void main(String[] args) {
        byte nombrePlaces = 5;
        byte nombrePortes = 3;
        byte nombreProp = 1;

        short puissance = 362;
        short emissionCo2 = 333;
        short cylindree = 6714;

        int prix = 36000;
        int kilometrage = 22850;

        long immatriculation = 1231561561567L;

        float consommationCombinee = 12.5F;
        float consommationRoute = 20.4F;
        float consommationVille = 13.6F;

        double consommationMoyenne = 1.5156156879845198745e-1;

        boolean estEndommagee = true;

        char classeEnergetique = 'F';

        System.out.println("Dodge Challenger SRT");
        System.out.println("Prix: €" + prix );
        System.out.println("Kilométrage: " + kilometrage + "KM" );
        System.out.println("la voiture est endommagée: " + estEndommagee );
        System.out.println("Immatriculation: " + immatriculation );
        System.out.println("Cylindrée: " + cylindree );
        System.out.println("Puissance: " + puissance + "Kilowatt" );
        System.out.println("L'émission de Co2: " + emissionCo2 + "g/km" );
        System.out.println("La classe de l'éfficacité énergétique: " + classeEnergetique );
        System.out.println("Consommation Carburant Combinée: " + consommationCombinee );
        System.out.println("Consommation Carburant ville: " + consommationVille );
        System.out.println("Consommation Carburant route: " + consommationRoute );
        System.out.println("Consommation Carburant Moyenne: " + consommationMoyenne );
        System.out.println("Le nombre de propriétaires précédents: " + nombreProp );
        System.out.println("Le nombre de places: " + nombrePlaces );
        System.out.println("Le nombre de portes: " + nombrePortes );

    }
}
