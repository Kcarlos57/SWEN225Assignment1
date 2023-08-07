/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// line 113 "model.ump"
// line 239 "model.ump"
public class Estate {

    //------------------------
    // MEMBER VARIABLES
    //------------------------

    //Estate Attributes
    public String name;
    private List<Inside> estateCells;
    private Set<Person> playersInEstate;

    private final int[] origin = new int[2]; // row, col
    private final int[] widthHeight = new int[2]; // width, height

    //private Weapon weapon;

    //------------------------
    // CONSTRUCTOR
    //------------------------

    public Estate(String name) {
        this.name = name;
        estateCells = new ArrayList<Inside>();
    }

    //------------------------
    // INTERFACE
    //------------------------

    public boolean setEstateCells(List<Inside> aEstateCells) {
        boolean wasSet = false;
        estateCells = aEstateCells;
        wasSet = true;
        return wasSet;
    }

    public boolean setPlayersInEstate(Set<Person> aPlayersInEstate) {
        boolean wasSet = false;
        playersInEstate = aPlayersInEstate;
        wasSet = true;
        return wasSet;
    }


    /**
     * Sets the origin of the estate
     *
     * @param row
     * @param col
     * @return
     */
    public Estate setOrigin(int row, int col) {
        origin[0] = row;
        origin[1] = col;
        return this;
    }

    /**
     * Sets the width and height of the estate
     *
     * @param width
     * @param height
     * @return
     */
    public Estate setWidthHeight(int width, int height) {
        widthHeight[0] = width;
        widthHeight[1] = height;
        return this;
    }

    public List<Inside> getEstateCells() {
        return estateCells;
    }

    public Set<Person> getPlayersInEstate() {
        return playersInEstate;
    }

  /*
  public Weapon getWeapon()
  {
    return weapon;
  }

   */

    public void delete() {
    }


    /**
     * Adds a person to the players in the estate
     */
    // line 123 "model.ump"
    public void addPerson(Person person) {

    }


    /**
     * Removes a person to the players in the estate
     */
    // line 130 "model.ump"
    public boolean removePerson(Person person) {
        return false;
    }


    /**
     * Sets Weapon
     */
    // line 137 "model.ump"
    public void setWeapon(Person person) {

    }

    // line 141 "model.ump"
    public String toString() {
        return "Estate: " + this.name;
    }

    /**
     * Set the estate cells
     * Interior of the estate
     * @return
     */
    public Estate buildInside() {
        for (int i = origin[0]; i < origin[0] + widthHeight[0]; i++) {
            for (int j = origin[1]; j < origin[1] + widthHeight[1]; j++) {
                Inside inside = new Inside(i, j); // row, col
                estateCells.add(inside);
            }
        }

        return this;
    }

    /**
     * Check is plauer is inside the estate
     * By checking the players pos with each inside cell
     * @param x
     * @param y
     * @return
     */
    public boolean playerIsInside(int x, int y) {
        for (Inside inside : estateCells) {
            if (inside.getRow() == y && inside.getCol() == x) { // row, col
                return true;
            }
        }
        return false;
    }
}