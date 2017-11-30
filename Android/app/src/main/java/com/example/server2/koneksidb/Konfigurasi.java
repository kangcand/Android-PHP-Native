package com.example.server2.koneksidb;

/**
 * Created by Server 2 on 29/11/2017.
 */

public class Konfigurasi
{


        //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
        //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
        //dimana File PHP tersebut berada
        //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
        public static final String URL_ADD="http://192.168.2.3/pegawai/tambahPgw.php";
        public static final String URL_GET_ALL="http://192.168.2.3/pegawai/tampilSemuaPgw.php";
        public static final String URL_GET_EMP="http://192.168.2.3/pegawai/tampilPgw.php?id=";
        public static final String URL_UPDATE_EMP="http://192.168.2.3/pegawai/updatePgw.php";
        public static final String URL_DELETE_EMP="http://192.168.2.3/pegawai/hapusPgw.php?id=";

        //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
        public static final String KEY_EMP_ID = "id";
        public static final String KEY_EMP_NAMA = "name";
        public static final String KEY_EMP_POSISI = "desg"; //desg itu variabel untuk posisi
        public static final String KEY_EMP_GAJI = "salary"; //salary itu variabel untuk gajih

        //JSON Tags
        public static final String TAG_JSON_ARRAY="result";
        public static final String TAG_ID = "id";
        public static final String TAG_NAMA = "name";
        public static final String TAG_POSISI = "desg";
        public static final String TAG_GAJI = "salary";

        //ID karyawan
        //emp itu singkatan dari Employee
        public static final String EMP_ID = "emp_id";

}
