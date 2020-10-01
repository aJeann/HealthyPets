import javax.swing.*;

/**
 * Created by Axel Jeansson
 * Date: 2020-10-01
 * Time: 12:51
 * Project: HealthyPets
 * Copyright: MIT
 */
public class Orm extends Djur implements Maträknare {

    private static int mat = 20;

    public Orm(int vikt, String namn){
        super(vikt, namn);

    }

    @Override
    public int amountOfFood() {
        return mat;
    }

    @Override
    public void PrintInfo() {
        JOptionPane.showMessageDialog(null, "Ormen " + getName() +
                " väger " + getVikt() + "kg och ska ha " + amountOfFood() + "g " + Matlista.ormpellets + ".");
    }
}
