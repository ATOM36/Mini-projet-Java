package views;

import controllers.BanquierController;
import controllers.DirecteurController;
import models.entity.Banquier;
import models.entity.Directeur;

import java.util.Scanner;

public class Login {
    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        System.out.println("Bienvenue sur --------------");
        int choice = getInput(scanner);

        if (choice == 0) {
            loggingIn();

        } else {
            System.out.println("Etes-vous sûr de vouloir quitter l'application ?");
            choice = getInput(scanner);

            if (choice == 0) {
                loggingIn();
            } else {
                System.out.println("A la prochaine fois sur -------------");
                System.exit(0);
            }
        }
    }

    private static int getInput(Scanner in) {
        int choice;

        do {
            System.out.println("\nTapez 0 pour connecter\nTapez 1 pour fermer l'application");
            choice = in.nextInt();

            if ((choice < 0) || (choice > 1))
                System.out.println("Entrée invalide");

        } while ((choice < 0) || (choice > 1));

        return choice;
    }

    private static void loggingIn() {
        System.out.println("Veuillez vous authentifier pour pouvoir  commencer\n");

        Scanner clavier = new Scanner(System.in);
        System.out.println("Quel est votre identifiant ?");
        long userID = clavier.nextLong();
        System.out.println("Quel est votre nom d'utilisateur ?");
        clavier.nextLine();
        String username = clavier.nextLine();
        System.out.println("Quel est votre mot de passe");
        String password = clavier.nextLine();

        Banquier userBanquier = BanquierController.getBanquier(userID);

        System.out.println(userBanquier.toString());
        Directeur userDirecteur = DirecteurController.getDirecteur(userID);
        boolean isChecked = (userBanquier != null) && (userBanquier.getUsername().equals(username)) &&
                (userBanquier.getPassword().equals(password));

        if(isChecked) {
            ViewBanquier view = new ViewBanquier(userBanquier);
        }

         Banquier theUser = new Banquier("ali", "fkdsjl", "fsd5354", "fsklf", "sdfkfsd@fdsfhks",
                  "000000000", 3461, "zeze", "ritou");
         ViewBanquier view = new ViewBanquier(theUser);
    }
}
