public class Student {
    private static int globalId = 0;

    private int id;

    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName){
    globalId++;
    this.id = globalId;
    this.firstName  = firstName;
    this.lastName = lastName;
    }
}