import java.util.ArrayList;

public class WorkingWithFilesMain {

    public static void main(String[] args) {
        ArrayList<Person> listOfPeople = new ArrayList<>();
        ArrayList<Person> infoReadFromFile = new ArrayList<>();
        WorkingWithFiles wwf = new WorkingWithFiles();

        listOfPeople.add(new Person("Sam", "Trainee IT Consultant", 21));
        listOfPeople.add(new Person("Joel", "Primary School Teacher", 24));
        listOfPeople.add(new Person("Andrew", "Trainee Teacher", 54));
        listOfPeople.add(new Person("Helen", "Reverend", 49));
        listOfPeople.add(new Person("Eddie", "Trainee Teacher", 22));

        for (Person person : listOfPeople){
            System.out.println(person.toString(person));
        }
        wwf.writeToFile(listOfPeople);
        wwf.readFromFile(infoReadFromFile);
        for (Person newPeople : infoReadFromFile){
            System.out.println(newPeople.toString(newPeople));
        }
    }
}
