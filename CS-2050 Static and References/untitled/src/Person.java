public class Person {
    static int personCount = 0;

    String firstName;

    String lastName;

    int age;

    Person(String fName, String lName, int age) {
        personCount++;
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;     // note two uses of identifier age
    }

    public String getfName() {
        return firstName;
    }

    public void setfName(String fName) {
        this.firstName = fName;
    }

    public String getlName() {
        return lastName;
    }

    public void setlName(String lName) {
        this.lastName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static int getPersonCount(){
        return personCount;
    }


    public boolean equals(Object o) {
        if( !(o instanceof Person) ) return false;
        Person p = (Person)o;
        if(  (this.lastName.equals(p.lastName)) && (this.firstName.equals(p.firstName))  ) return true;
        else return false;
    }

    void birthday() {
        this.age += 1;
        System.out.println("Happy Birthday " + this.firstName + " " + this.lastName);
    }



}
