public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(6));
        System.out.println(factorialRecursive(8));
        System.out.println(1*2*3*4*5*6*7*8);
    }

    //perulangan untuk mencari faktorial
    static int factorialLoop(int value){
        var result = 1;

        for (var counter = 1; counter <= value; counter++){
            result += counter;
        }

        return result;
    }

    //factorialrecursive bisa panggil methodnya sendiri
    static int factorialRecursive(int value){
        if (value == 1){
            return 1;
        }else {
            return value * factorialRecursive(value - 1);
        }
    }
    //problem dengan recursive method
    //jangan terlalu banyak menggunakan recursive karena java akan terjadi error
    //yang disebut StackOverflow
}


