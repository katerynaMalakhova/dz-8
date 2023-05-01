import java.util.List;
import java.util.ArrayList;

public class Group {
    private Student headman;
    private List<Student> listOfStudents = new ArrayList<>();
    private List<String> listOfTasks  = new ArrayList<>();

    public void createGroup(Student student, String task){
        this.headman = student;
        this.listOfStudents.add(student);
        this.listOfTasks.add(task);
    }

    public void changeHeadman(Student student){
        this.headman = student;
    }
    public void addStudent(Student student){
        this.listOfStudents.add(student);
    }
    public void deleteStudent(Student student){
        if (listOfStudents.contains(student)) {
            if (student != this.headman)
                this.listOfStudents.remove(student);
            else {
                this.listOfStudents.remove(student);
                this.headman = listOfStudents.get(1);
            }
        } else System.out.println("no such student in the group");
    }
    //if student is a headman - set another headman
    // if no other student in the group - print message no group exists

    public void updateStudent(int id, String firstName, String lastName){
        for (Student s : listOfStudents){
            if (s.getId() == id) {
                s.setFirstName(firstName);
                s.setLastName(lastName);
            return;}
        }
    }
    public void addTask(String task){
        this.listOfTasks.add(task);
        }

}
