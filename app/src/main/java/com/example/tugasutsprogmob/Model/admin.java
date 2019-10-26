package com.example.tugasutsprogmob.Model;

public class admin {
    private String namadosen;
    private String Nidn;
    private String gelar;
    private String email;
    private String alamat;

    public admin(String nama,String Nidn, String gelar, String email, String alamat) {
        this.namadosen = nama;
        this.Nidn = Nidn;
        this.gelar = gelar;
        this.email = email;
        this.alamat = alamat;
    }
    public String getNama() {
        return namadosen;
    }
    public void setNama(String nama) {
        this.namadosen = nama;
    }

    public String getNidn() {
        return Nidn;
    }
    public void setNipn(String Nidn) {
        this.Nidn = Nidn;
    }

    public String getGelar() {
        return gelar;
    }
    public void setGelar(String gelar) {
        this.gelar = gelar;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}