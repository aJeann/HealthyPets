import javax.swing.*;

/**
 * Created by Axel Jeansson
 * Date: 2020-10-01
 * Time: 12:51
 * Project: HealthyPets
 * Copyright: MIT
 */
public class Katt extends Djur implements Maträknare {
    //Arv
    public Katt(int vikt, String name) {
        super(vikt, name);
    }

    //Polymorfism
    @Override
    public int amountOfFood() {
        int viktIGram = getVikt() * 1000;
        return viktIGram / 150;
    }
    //Interface
    @Override
    public void PrintInfo() {
        JOptionPane.showMessageDialog(null, "Katten " + getName() +
                " väger " + getVikt() + "kg och ska därför ha " + amountOfFood() + "g " + Matlista.kattfoder + ".");
    }
}
