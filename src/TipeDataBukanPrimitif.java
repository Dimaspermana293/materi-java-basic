public class TipeDataBukanPrimitif {
    public static void main (String[] args){
        Integer nim = 52;
        Character nama = 'D';


        //Konversi primitif ke bukan primitif
        int npm = 293;
        Integer iniNomorMhs = npm;

        System.out.println(npm);

        //Konversi bukan primitf ke primitif
        short iniShort = iniNomorMhs.shortValue();
        long iniLong = iniNomorMhs.longValue();
    }

}
