package arrayobject.Student;

public class Student {

    private String name = "Reshabh";
    private int age = 19;
    private int semester;
    private boolean partTime;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return ("The name of the student is: " + getName() + " and the age of the student is: " + getAge());
    }

}
