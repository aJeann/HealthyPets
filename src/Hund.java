import javax.swing.*;

/**
 * Created by Axel Jeansson
 * Date: 2020-10-01
 * Time: 12:51
 * Project: HealthyPets
 * Copyright: MIT
 */
public class Hund extends Djur implements Maträknare {

    public Hund(int vikt, String name) {
        super(vikt, name);
    }


    @Override
    public int amountOfFood() {
        int viktIGram = getVikt() * 1000;
        return viktIGram / 100;
    }

    @Override
    public void PrintInfo() {
        JOptionPane.showMessageDialog(null, "Hunden " + getName() +
                " väger " + getVikt() + "kg och ska därför ha " + amountOfFood() + "g " + Matlista.hundfoder + ".");
    }

}
