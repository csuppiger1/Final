
/**
 * Write a description of class Phone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Backpack implements Comparable<Backpack>
{
    private String BackpackCompany;
    private int numberOfPencils;
    private static int numberOfBackpacks = 0;
    public Backpack(String cpny, int pnbr) {
        this.BackpackCompany = cpny;
        this.numberOfPencils = pnbr;
        numberOfBackpacks++;
    }
    public String getBackpackCompany() {
        return this.BackpackCompany;
    }
    public int getPencils() {
        return this.numberOfPencils;
    }
    public int getNumberOfBackpacks() {
        return this.numberOfBackpacks;
    }
    public void changePencilCount(int pnbr) {
        this.numberOfPencils = pnbr;
    }
    public void changeBackpackCompany(String cpny) {
        this.BackpackCompany = cpny;
    }
    public void sortBackpack() {
        System.out.println("Your Backpack is way to messy to sort.");
    }
    public String toString() {
        return "Your backpack is made by " + this.BackpackCompany + "\nthere are  " + this.numberOfPencils + " pencils in your backpack.\n";
    }
    public int compareTo(Backpack b1) {
        if(b1.getPencils() < this.getPencils()) {
            return 1;
        } else if (b1.getPencils() > this.getPencils()) {
            return -1;
        } else {
            return 0;
        }
    }
}
