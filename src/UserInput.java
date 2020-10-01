import javax.swing.*;

/**
 * Created by Axel Jeansson
 * Date: 2020-10-01
 * Time: 12:54
 * Project: HealthyPets
 * Copyright: MIT
 */
public class UserInput {

    UserInput() {
        Orm hypno = new Orm(1, "Hypno");
        Hund dogge = new Hund(10, "Dogge");
        Hund sixten = new Hund(5, "Sixten");
        Katt ove = new Katt(3, "Ove");
        Katt venus = new Katt(5, "Venus");



        while (true) {
            String input = JOptionPane.showInputDialog(null, "Vilket djur ska få mat? \nTryck på cancel för att avsluta.");
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Du har avslutat programmet.");
                System.exit(0);
            }

            input = input.toLowerCase();

            if (input.equals("sixten")) {
                sixten.PrintInfo();
            } else if (input.equals("dogge")) {
                dogge.PrintInfo();
            } else if (input.equals("hypno")) {
                hypno.PrintInfo();
            } else if (input.equals("ove")) {
                ove.PrintInfo();
            } else if (input.equals("venus")) {
                venus.PrintInfo();
            } else
                JOptionPane.showMessageDialog(null,"Djuret finns inte. Försök igen.");

            sixten.setVikt(7);
        }
    }
}
