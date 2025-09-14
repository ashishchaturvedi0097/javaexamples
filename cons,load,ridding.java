// CONSTRUCTOR OVERLOADING:

// Default constructor

class Main {
    Main(){
        System.out.println("Bike is created");
    }
// Parameterized constructor
    Main(int a){
        System.out.println( a);
    }
public static void main(String[] args) {
    Main obj = new Main();
    Main obj2 = new Main(5);
}
}

//METHOD OVERLOADING:
class METHODOVERLOADING{
    int figure(int a, int b) {
        System.out.println(a+b);
        return a;
    }
    double figure(double a, double b) {
        System.out.println(a+b);
        return a;
    }
    int figure(int s){
        System.out.println(s*s);
        return s;
    }
    public static void main(String[] args) {
        METHODOVERLOADING m1=new METHODOVERLOADING();
        m1.figure(6,7);
        m1.figure(5.5,6.3);
        m1.figure(4);
        
    }   
}

//method overriding:
class vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class bike extends vehicle{
    void run(){
        System.out.println("Bike is running");
    }
    public static void main(String[] args) {
        vehicle v1 =new vehicle();
        bike obj=new bike();
        obj.run();
        v1.run();
        
    }
}

