public class WhileLoop {
    public static void main (String[] args){
        var number = 1;

        //hanya perlu kondisi saja tidak perlu init dan post
        while (number <= 10){
            System.out.println("Ulang ke-" + number);
            number++;
        }
    }
}
