public class MethodReturnValue {
    public static void main(String[] args) {
        //untuk mengembalikan value didalam method kita butuh -> return
        System.out.println(penjumlahan(200,200));
        System.out.println(hitung(100,"+",200));
    }

    static int penjumlahan(int value1, int value2){
        var total = value1 + value2;
        return total;
    }
    //memanggil value di method percabangan
    static int hitung(int angka1, String operasi, int angka2){
        switch (operasi) {
            case "+":
                return angka1 + angka2;
            case "-":
                return angka1 - angka2;
            case "*":
                return angka1 * angka2;
            default:
                return 0;
        }


    }
}
