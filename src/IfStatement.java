public class IfStatement {
    public static void main (String[] args){

        //If Statement
        //Kondisi

        //studycase cek kelulusan ujian
        var nilaiUts = 70;
        var nilaiUas = 80;

//        if(nilaiUts >= 75 && nilaiUas >= 75){
//            System.out.println("Kamu Lulus");
//        }else {
//            System.out.println("Maaf, silahkan ulang semester selanjutnya!");
//        }

        if (nilaiUts >= 80 && nilaiUas >= 80){
            System.out.println("Nilai Akhir kamu: A");
        } else if (nilaiUts >= 70 && nilaiUas >= 70) {
            System.out.println("Nilai Akhir kamu: B");
        } else if (nilaiUts >= 60 && nilaiUas >= 60) {
            System.out.println("Nilai Akhir kamu: C");
        } else if (nilaiUts >= 50 && nilaiUas >= 50) {
            System.out.println("Nilai AKhir Kamu: D");
        }else {
            System.out.println("Nilai Akhir kamu: E");
        }
    }

}
