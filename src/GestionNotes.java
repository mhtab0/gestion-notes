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

        final double POIDS_DEVOIR = 0.4;
        final double POIDS_EXAMEN = 0.6;
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

        double moyenneAlgo = devoirAlgo * POIDS_DEVOIR + examenAlgo * POIDS_EXAMEN;
        double moyenneBD = devoirBD * POIDS_DEVOIR + examenBD * POIDS_EXAMEN;
        double moyenneANG = devoirANG * POIDS_DEVOIR + examenANG * POIDS_EXAMEN;

        int sommeCoefs = COEF_ALGO + COEF_BD + COEF_ANG;
        double moyenneGenerale = (moyenneAlgo * COEF_ALGO + moyenneBD * COEF_BD + moyenneANG * COEF_ANG) / sommeCoefs;

        System.out.printf("Algorithmique  (coef %d) : %.2f\n", COEF_ALGO, moyenneAlgo);
        System.out.printf("Base de données (coef %d) : %.2f\n", COEF_BD, moyenneBD);
        System.out.printf("Anglais         (coef %d) : %.2f\n", COEF_ANG, moyenneANG);

        System.out.println("------------------------------------");
        System.out.printf("Moyenne générale          : %.2f\n", moyenneGenerale);
        System.out.println("====================================");


    clavier.close();




    }
}
