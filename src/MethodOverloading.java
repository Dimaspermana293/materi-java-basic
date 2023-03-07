public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Dimas");

    }
    //method overloading : boleh membuat method lebih dari satu
    //dengan syarat parameternya harus berbeda-beda!
    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String firstname){
        System.out.println("Dimas");
    }

}
