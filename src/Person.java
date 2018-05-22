public class Person {
    public String name;
    public String occupation;
    public int age;

    public Person (String name, String occupation, int age){
        setName(name);
        setOccupation(occupation);
        setAge(age);
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }
    public String getOccupation() {
        return occupation;
    }
    public int getAge() {
        return age;
    }

    public String toString(Person person){
        return "Name: " + person.getName() + ", Occupation: " + person.getOccupation() + ", Age :" + person.getAge();
    }
}
