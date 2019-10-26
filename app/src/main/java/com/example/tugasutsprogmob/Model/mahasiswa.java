package com.example.tugasutsprogmob.Model;

public class mahasiswa {
    private String nama;
    private String nim;
    private String alamat;
    private String email;

    public mahasiswa(String nim, String nama, String alamat, String email) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String nohp) {
        alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }
}

