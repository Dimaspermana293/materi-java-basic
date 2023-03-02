public class SwitchStatement {
    public static void main (String[] args){
        var nilai = "E";

        switch (nilai){
            case "A":
                System.out.println("Hebat, Anda lulus dengan sangat baik");
            break;
                case "B":
                    System.out.println("Nilai Anda Baik");
            break;
            case "C":
                System.out.println("Nilai Anda cukup baik");
            break;
            case "D":
                System.out.println("Anda Tidak Lulus");
            break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan!");
        }

        //Switch Lambda atau yang versi singkatnya
        //Run JAVA Ver >=14
//        switch (nilai){
//            case "A" -> System.out.println("Nilai kamu bagus banget");
//            case "B" -> System.out.println("Nilai kamu baik");
//            case "C" -> System.out.println("Cukup Baik");
//            case "D" -> System.out.println("Anda Tidak Lulus");
//            default -> {
//                System.out.println("Kayanya Anda Salah Jurusan!");
//            }
//
//
//        }
    }
}
