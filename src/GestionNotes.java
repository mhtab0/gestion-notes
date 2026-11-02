import java.util.Scanner;

public class GestionNotes {
    public static void main(String[] args){
        //System.out.println("==============================");
        System.out.println("RELEVE DE NOTE - L2");
        System.out.println("==============================");


        Scanner clavier = new Scanner(System.in);
        String prenom = "Awa";
        String nom = "Ndiaye";
        int age = 20;
        String matricule = "ISI-2026-0142";



        System.out.println("Entrer prenom");
        prenom = clavier.nextLine();
        System.out.println("Entrer nom");
        nom = clavier.nextLine();
        System.out.println("Entrer age");
        age = clavier.nextInt();
        clavier.nextLine();
        System.out.println("Enter votre matricule :");
        matricule = clavier.nextLine();

        final double POIDS_devoir = 0.4;
        final double POIDS_examen = 0.6;
        final int COEF_ALGO = 3;
        final int COEF_BD = 2;
        final int COEF_ANG = 1;

        System.out.println("Saisir note devoir Algoritme");
        double devoirAlgo = clavier.nextDouble();

        System.out.println("Saisir note examen Algorithme");
        double examenAlgo = clavier.nextDouble();

        System.out.println("Sasir note devoir BD");
        double devoirBD = clavier.nextDouble();

        System.out.println("Saisir note examen BD");
        double examenBD = clavier.nextDouble();

        System.out.println("Saisir note devoir ANG");
        double devoirANG = clavier.nextDouble();

        System.out.println("Saisir note examen ANG");
        double examenANG = clavier.nextDouble();

        double moyenneAlgo = devoirAlgo * POIDS_devoir + examenAlgo * POIDS_examen;
        double moyenneBD = devoirBD * POIDS_devoir + examenBD * POIDS_examen;
        double moyenneANG = devoirANG * POIDS_devoir + examenANG * POIDS_examen;

        System.out.println("Brut : " + moyenneAlgo + " | " + moyenneBD + " | " + moyenneANG);
        clavier.close();




    }
}
