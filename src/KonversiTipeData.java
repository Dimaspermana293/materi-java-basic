public class KonversiTipeData {
    public static void main (String[] args){
        byte iniByte = 127;
        short iniShort = iniByte;
        int iniInt = iniShort;


        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;

        System.out.println(iniShort);
    }
}
