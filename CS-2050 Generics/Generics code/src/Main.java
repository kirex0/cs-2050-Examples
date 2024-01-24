public class Main {
    public static void main(String[] args) {
        //Play around with this code too! Make boxes, print out data, compare boxes and see what happens!

        //creating person object referenced by p1
        Person p1 = new Person("John", "Doe", 30);

        //Question 1: What data type is b1?
        Box<String> b1 = new Box<String>("Hello There");

        //run the code to see what this prints!
        System.out.println("Box of string has " + b1.getMyT());

        //Question 2: What data type is b2?
        Box<Double> b2 = new Box<Double>(3.14169265);

        //run the code to see what this prints!
        System.out.println("Box of double has " + b2.getMyT());

        //Question 3: Can we use another class for the data type for box?
        Box<Person> boxOfPerson = new Box<Person>(p1);
        System.out.println(boxOfPerson.tThing.getfName());



        //Question 4: Can you run this? Try it! What happens and why?

       /* if (boxOfPerson == b2) {
            System.out.println("boxOfPerson and b2 are the same");
        } else {
            System.out.println("boxOfPerson and b2 are not the same");
        }*/
        Person p2 = new Person("Example", "Student", 22);

        p1 = p2;
        //Question 5: What is the first name of the person object being referenced to in boxOfPerson?
        System.out.println(boxOfPerson.tThing.getfName());



    }
}