public class Student {

    private static int globalId = 0;

    public int getId() {
        return id;
    }

    private int id;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName){
    globalId++;
    this.id = globalId;
    this.firstName  = firstName;
    this.lastName = lastName;
    }

}