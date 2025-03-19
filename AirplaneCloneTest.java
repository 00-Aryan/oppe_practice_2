// Complete the Java program to create two objects a1 and a2 of type Airplane. a2 should
// be created from a1 using cloning such that any later changes to a2 do not affect a1.
// • Class Airplane implements Cloneable interface and has/should have the following
// members:
// – Instance variables String company, eng of type Engine, and String model
// – Constructor to initialize the instance variables
// – Mutator methods as needed
// – Overridden method toString()
// – Implement method clone() that achieves deep copy using cloning

// • Class Engine implements Cloneable interface and has/should have the following mem-
// bers:

// – Instance variables String name and int numEngines
// – Constructor to initialize the instance variables
// – Mutator methods as needed
// – Overridden method toString()
// – Implement method clone()
// • Class AirplaneCloneTest contains the main method that takes the inputs and invokes
// appropriate methods to achieve the functionality.
// What you have to do
// • Implement method clone() in class Airplane
// • Implement method clone() in class Engine

import java.util.Scanner;
class Airplane implements Cloneable{
private String company;
private String model;
private Engine eng;
public Airplane(String c, String m, Engine e) {
company = c;
model = m;
eng = e;
}

Page 10

public String toString() {
return company+": " + model+eng;
}
public void setEngine(String n, int num) {
eng.setName(n);
eng.setNumEngines(num);
}
public void setModel(String m) {
model = m;
}
// Write code to implement the clone() method
}
class Engine implements Cloneable{
private String name;
private int numEngines;
// Write code to implement the clone() method
public Engine(String n,int num){
name = n; numEngines = num;
}
public void setName(String n) {
name = n;
}
public void setNumEngines(int n) {
numEngines = n;
}
public String toString() {
return "[" + name +", "+numEngines+"]";
}
}
public class AirplaneCloneTest{
public static void main(String[] args) throws CloneNotSupportedException {
Scanner sc = new Scanner(System.in);
Airplane a1 = new Airplane(sc.nextLine(),sc.next(),

new Engine(sc.next(),sc.nextInt()));

Airplane a2 = a1.clone();
sc.nextLine(); //Last escape character
a2.setModel(sc.next());
a2.setEngine(sc.next(),sc.nextInt());
System.out.println(a1);
System.out.println(a2);

Page 11

sc.close();
}
}


// Public test case 1:
// Input:
// Boeing
// 747 GE 4
// 737 RR 3
// Output:
// Boeing: 747[GE, 4]
// Boeing: 737[RR, 3]
// Public test case 1:
// Input:
// AirBus
// A330 GE 3
// A380 Williams 4
// Output:
// AirBus: A330[GE, 3]
// AirBus: A380[Williams, 4]
// Private test case 1:
// Input:
// TATA
// Indica TataMotors 4
// Safari TataMotors 3
// Output:
// TATA: Indica[TataMotors, 4]
// TATA: Safari[TataMotors, 3]
// Public test case 1:
// Input:
// Mahindra
// Scorpio MahindraMahindra 2
// Scorpio MahindraMotors 5
// Output:
// Mahindra: Scorpio[MahindraMahindra, 2]
// Mahindra: Scorpio[MahindraMotors, 5]