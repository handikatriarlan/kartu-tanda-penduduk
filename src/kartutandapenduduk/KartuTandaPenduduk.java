package kartutandapenduduk;

import javax.swing.*;

public class KartuTandaPenduduk {

    public static void main(String[] args) {
        String nik = JOptionPane.showInputDialog("Masukkan NIK:");
        String nama = JOptionPane.showInputDialog("Masukkan Nama:");

        String tempatLahir = JOptionPane.showInputDialog("Masukkan Tempat Lahir:");
        String str_tanggalLahir = JOptionPane.showInputDialog("Masukkan Tanggal Lahir:");
        String str_bulanLahir = JOptionPane.showInputDialog("Masukkan Bulan Lahir:");
        String str_tahunLahir = JOptionPane.showInputDialog("Masukkan Tahun Lahir:");

        int tanggalLahir = Integer.parseInt(str_tanggalLahir);
        int bulanLahir = Integer.parseInt(str_bulanLahir);
        int tahunLahir = Integer.parseInt(str_tahunLahir);

        String formattedTanggal = String.format("%02d", tanggalLahir);
        String formattedBulan = String.format("%02d", bulanLahir);
        String formattedTahun = String.format("%04d", tahunLahir);
        String ttl = tempatLahir.toUpperCase() + ", " + formattedTanggal + "-" + formattedBulan + "-" + formattedTahun;

        String jenisKelamin = JOptionPane.showInputDialog("Masukkan Jenis Kelamin:");
        String golDarah = JOptionPane.showInputDialog("Masukkan Golongan Darah:");
        String alamat = JOptionPane.showInputDialog("Masukkan Alamat:");
        String agama = JOptionPane.showInputDialog("Masukkan Agama:");
        String statusPerkawinan = JOptionPane.showInputDialog("Masukkan Status Perkawinan: (Belum Kawin/Sudah Kawin)");
        String pekerjaan = JOptionPane.showInputDialog("Masukkan Pekerjaan:");
        String kewarganegaraan = JOptionPane.showInputDialog("Masukkan Kewarganegaraan:");

        String message = "PROVINSI SUMATERA UTARA KOTA MEDAN\n\n"
                + "NIK: " + nik + "\n"
                + "Nama: " + nama.toUpperCase() + "\n"
                + "Tempat/Tgl Lahir: " + ttl.toUpperCase() + "\n"
                + "Jenis Kelamin: " + jenisKelamin.toUpperCase() + "\n"
                + "Golongan Darah: " + golDarah.toUpperCase() + "\n"
                + "Alamat: " + alamat.toUpperCase() + "\n"
                + "Status Perkawinan: " + statusPerkawinan.toUpperCase() + "\n"
                + "Pekerjaan: " + pekerjaan.toUpperCase() + "\n"
                + "Kewarganegaraan: " + kewarganegaraan.toUpperCase() + "\n"
                + "Agama: " + agama.toUpperCase();

        JOptionPane.showMessageDialog(null, message);
    }
}
