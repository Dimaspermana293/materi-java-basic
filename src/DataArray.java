public class DataArray {
    public static void main(String[] args) {
        //Membuat array
        String[] arrayNama = new String[5]; //cara pertama

        String[] arrayString; //cara kedua
        arrayString = new String[5];

        arrayString[0] = "Dimas";
        arrayString[1] = "Fahri";
        arrayString[2] = "Rinto";
        arrayString[3] = "Khoerul";
        arrayString[4] = "Ria";

        System.out.println(arrayString[0]);

        //Array Initializer
        String[] namaAnggota = {
                "Dimas", "Fahri", "Anwar"
        };

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = new long[]{
                5200L, 5211L, 5232L
        };

        System.out.println(namaAnggota.length);
        System.out.println(arrayInt[3]);
        System.out.println(arrayLong[0]);

        //Array didalam array
        String[][] members = new String[][]{
                {"Eko", "Kurniawan"},
                {"Budi", "Kurniawan"},
                {"Dimas", "Permana"}
        };
        //Akses array
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
    }
}



