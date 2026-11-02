import java.util.Scanner;

public class GestionNotes {
    public static void main(String[] args){
        System.out.println("==============================");
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
        clavier.close();
        final double devoir = 0.4;
        final double examen = 0.6;
        final int COEF_ALGO = 3;
        final int COEF_BD = 2;
        final int COEF_ANG = 1;


    }
}
