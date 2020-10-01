/**
 * Created by Axel Jeansson
 * Date: 2020-10-01
 * Time: 12:51
 * Project: HealthyPets
 * Copyright: MIT
 */
abstract public class Djur {

    //Inkapsling
    private int vikt;
    private String name;

    public Djur() {
    }

    public Djur(int vikt, String name) {
        this.vikt = vikt;
        this.name = name;
    }

    public void setVikt(int vikt){
        this.vikt = vikt;
    }

    public int getVikt() {
        return vikt;
    }

    public String getName() {
        return name;
    }

    public int amountOfFood(){
        return 0;
    }
}
