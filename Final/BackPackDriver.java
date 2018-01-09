
/**
 * Write a description of class BackPackDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BackPackDriver
{
    public static void main(String[] args) {
        Backpack Backpack1 = new Backpack("NorthFace", 2);
        Backpack Backpack2 = new Backpack("Supreme", 3000);
        Student student1 = new Student(Backpack1, "Cody", 16);
        
        
        //3 After you have written your methods, you need to go through the following;
        
        //Print the static variable you created for your class
        System.out.println("There are " + Backpack1.getNumberOfBackpacks() + " backpacks\n");
        //Call the toString() method on both objects you created
        System.out.println(Backpack1);
        System.out.println(Backpack2);
        //Pass the objects to the changeIt
        changeit(Backpack1, Backpack2);
        //call the toString method after the changeit method
        System.out.println(Backpack1);
        System.out.println(Backpack2);
    }
    public static void changeit(Backpack b1, Backpack b2) {
        b1.changePencilCount(b2.getPencils());
        b1.changeBackpackCompany(b2.getBackpackCompany());
        //call the toString method
        System.out.println(b1);
        System.out.println(b2);
    }
}

