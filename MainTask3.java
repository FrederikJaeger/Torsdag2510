import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> student1Passed = new ArrayList<>();
        student1Passed.add("Matematik");
        student1Passed.add("Java 1.0");

        Student student1 = new Student("Linda", student1Passed);
        Student student2 = new Student("Alfred", new ArrayList<>());

        ArrayList<String> teacher1CanTeach = new ArrayList<>();
        teacher1CanTeach.add("Java 1.0");

        Teacher teacher1 = new Teacher("Hr. Skæg", teacher1CanTeach);
        Teacher teacher2 = new Teacher("Hr. Vimse", new ArrayList<>());

        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);

        for (Person person : persons) {
            if (!person.addCourse("Java 1.0")) {
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette fag.");
                }
            }
        }
    }
}
