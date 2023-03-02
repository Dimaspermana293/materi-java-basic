public class DoWhile {
    public static void main (String[] args){
        var vounter = 100;

        //do while ini akan menjalankan sekali dulu walaupun itu salah
        do {
            System.out.println("Perulangan ke- "+ vounter);
            vounter++;
        }while (vounter<=10);
    }
}
