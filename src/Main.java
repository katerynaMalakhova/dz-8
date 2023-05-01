public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Kateryna", "Malakhova");
        Student student2 = new Student("Kateryna2", "Malakhova2");
        Student student3 = new Student("Kateryna3", "Malakhova3");

        String task1 = "вивчити інкапсуляцію";
        String task2 = "вивчити оператори";
        String task3 = "вивчити цикли";

        Group group = new Group();
        group.createGroup(student1, task1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addTask(task2);
        group.addTask(task3);
        group.changeHeadman(student2);
        group.updateStudent(3, "updatedName", "updatedLastName");
        group.deleteStudent(student2);
    }

}