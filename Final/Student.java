
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student implements Comparable<Student>
{
    private Backpack backpack;
    private String name;
    private int age;
    public Student(Backpack b1, String nm, int ag) {
        this.backpack = b1;
        this.name = nm;
        this.age = ag;
    }
    public void setBackpack(Backpack b1) {
        this.backpack = b1;
    }
    public void setName(String nm) {
        this.name = nm;
    }
    public void setAge(int ag) {
        this.age = ag;
    }
    public String getName() {
        return this.name;
    }
    public Backpack getBackpack() {
        return this.backpack;
    }
    public int getAge() {
        return this.age;
    }
    public String toString() {
        return "This student is " + this.age + " years old\n their name is " + this.name + "/n They have a " + this.backpack.getBackpackCompany() + "backpack with " + this.backpack.getPencils() + " pencils in it\n";
    }
    public int compareTo(Student s1) {
        if(s1.getAge() < this.getAge()) {
            return 1;
        } else if (s1.getAge() > this.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
