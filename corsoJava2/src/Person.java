public class Person {
    private String name;

    public Person(){
        this.name = "Ancora nessun nome";
    }

    public Person (String initialName){
        this.name = initialName;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }

    public void printOutput(){
        System.out.println("Name : " + name);
    }

    public boolean sameName(Person otherPerson){
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}
