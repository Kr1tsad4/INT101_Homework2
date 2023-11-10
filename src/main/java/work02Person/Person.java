package work02Person;
import work01Utilitor.Utilitor;

public class Person {

    private static int nextId = 1;
    private final int id;
    private String firstname;
    private String lastname;
    
    //2.6
    public Person(String firstname, String lastname) {
        this.firstname = Utilitor.testString(firstname);
        this.lastname = Utilitor.testString(lastname);
        this.id = nextId;
        nextId++;
    }
//    2.7
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("id=").append(id);
        sb.append(", firstname=").append(firstname);
        sb.append(", lastname=").append(lastname);
        sb.append('}');
        return sb.toString();
    }
//    2.8
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
    //2.9
    public void setFirstname(String firstname) {
        this.firstname = Utilitor.testString(firstname);
    }

    public void setLastname(String lastname) {
        this.lastname = Utilitor.testString(lastname);
    }
    //2.10
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }
    

    /*

       2.11 Show in this "work02Person" method how to use 2.6-2.10
            and check their correctness. */


}