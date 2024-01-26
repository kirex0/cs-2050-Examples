
public class Main {
    public static void main(String[] args) {
        //References and Objects
        //------------------------------------------------------
        //creating a person object referenced by p1
        Person p1 = new Person("John", "Doe", 30);

        //printing the values of the object referenced by p1
        System.out.println(p1.getfName());
        System.out.println(p1.getlName());
        System.out.println(p1.getAge());

        //creating a new person object referenced by p1
        p1 = new Person("Jane", "Doe", 25);

        //Question 1: what happened to the first person object?
        //Question 2: Is this bad?

        //printing the values of the object referenced by p1
        System.out.println(p1.getfName());
        System.out.println(p1.getlName());
        System.out.println(p1.getAge());

        //creating a person object referenced by p2
        Person p2 = new Person("John", "Smith", 40);

        //Question 3: what does this do?
        p2 = p1;

        //Question 4: What does this do?
        p2.setlName("BAD");

        //Question 5 A): what will this print?
        //System.out.println(p1.getlName());

        // 5 B): Why?


        //------------------------------------------------------
        //Static Keyword
        //------------------------------------------------------
        //Question 6: Whaat is static?
        //Question 7: How do we access the static variable personCount? Are there multiple ways to access it?
        //Question 8: A) What is the value of personCount RIGHT NOW? B) Why?  C) How do we change it? D) What is the value of personCount by default?

        //Question 9: What do these 2 lines of code output?
        //System.out.println(p1.getPersonCount());
        //System.out.println(Person.getPersonCount());

    }


}

