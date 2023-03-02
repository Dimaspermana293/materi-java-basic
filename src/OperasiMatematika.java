public class OperasiMatematika {

    public static void main (String[] args){
        //operasi matematika
        int a = 100;
        int b = 7;

        System.out.println(a+b); //107

    //augmented assignment
        int c = 100;

        c += 10;
        System.out.println(c); //110
        //unary operator
        //operator yang ditempatkan didepan variable
        int tambah = 100;
        int kurang = 10;

        tambah++;
        System.out.println(tambah);
        kurang--;
        System.out.println(kurang);

        //Operasi Perbandingan(boolean)
        int seratus =100;
        int duaratus = 200;

        System.out.println(seratus > duaratus);
        System.out.println(seratus < duaratus);
        System.out.println(seratus >= duaratus);
        System.out.println(seratus <= duaratus);
        System.out.println(seratus == duaratus);
        System.out.println(seratus != duaratus);
        System.out.println("-");


        //Operator Boolean
        // && -> Dan -> dua duanya dipake
        // || -> atau -> salah satunya true ya TRUE
        // ! -> negasi -> kebalikannya

        //study case
        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen || lulusNilai;
        System.out.println(lulus);



    }

}
