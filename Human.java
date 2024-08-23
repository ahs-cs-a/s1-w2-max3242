public class Human {
    private String name;
    private String eyeColor;
    private int age;
    public Human(String n, String e) {
        name=n; 
        eyeColor=e;
        printState();
    }
    public Human(String n, int a) {
        name=n;
        age=a;
        printState();
    }
    public Human(int a, String e) {
        age=a;
        eyeColor=e;
        printState();
    }       public Human(String n, String e, int a) {
        name=n;
        eyeColor=e;
        age=a;
        printState();
    }
    public void walking(){
        System.out.println("Walking ...");
    }
 
    public void running(){
        System.out.println("Running ...");
    }
 
    //NEW THIS WEEK
    public String name(){
        return name;
    }
    
    public void printState(){
        System.out.println("Name: " + name);
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Age: "+age);
    }
 }
 