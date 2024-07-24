package org.project.SesiPertamaJavaBasic;

public class ConditionalStatement {

    public static void main(String[] args) {

        //digunakan untuk mengambil keputusan
        /**
         * if..else
         * if..else..if
         * nested if
         * switch statement, ?
         */


        //Rumusnya adalah
        //Jika, Maka, Keputusan

        //IF.. ELSE
        int angka = 100000;

        if (angka == 1000000){
            System.out.println("Selamat anda benar");
        }else {
            System.out.println("Maaf, anda belum selesai");
        }

        //IF..ELSE.IF.ELSE
        if (angka == 200000){
            System.out.println("Kondisi ke 1"); //keputusan 1
        }
        else if (angka == 300000){
            System.out.println("Kondisi ke 2"); //keputusan 2
        }
        else {
            System.out.println("Kondisi ke 3"); //keputusan 3
        }
        //output akan menunjukkan keputusan 3 karena nilai variable 100000


        //SWITCH STATEMENTS

        String alphabet = "popo";

        switch (alphabet){
            case "ABCSSD":
                System.out.println("Switch Case 1");
                break;
            case "123432":
                System.out.println("Switch Case 2");
                break;
            default: //Otomatis akan dikeluarkan jiak case a dan b tidak ada
                System.out.println("Kondisi tidak terpenuhi antara case 1 dan case 2");
                break;
        }

        // Tanda Tanya ?
        // RUMUS = tipe_data nama_variable = KONDISI 1 ? Ini Keputusan False;

        // Apakah kondisi 1 ini true, baru keputusan

        int number = 10;
        String hasil = number == 9 ? "Kita bikin kertas" : "Dadu";

        //jika iya hasil kertas, jika tidak dadu

        System.out.println("Ini hasilnya : " + hasil    );

        if (number == 10){
            System.out.println("Kertas");
        } else {
            System.out.println("Dadu");
        }

        System.out.println("Contoh pakai if else " + hasil);


    }



}
