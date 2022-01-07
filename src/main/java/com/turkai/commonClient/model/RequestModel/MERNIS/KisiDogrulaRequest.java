package com.turkai.commonClient.model.RequestModel.MERNIS;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.turkai.commonClient.model.RequestModel.KullaniciBilgi;


public class KisiDogrulaRequest {

    private String tcNo;
    private String ad;
    private String soyad;
    private KullaniciBilgi kullaniciBilgi;


    @JsonGetter("tc")
    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    @JsonGetter("auth")
    public KullaniciBilgi getKullaniciBilgi() {
        return kullaniciBilgi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setKullaniciBilgi(KullaniciBilgi kullaniciBilgi) {
        this.kullaniciBilgi = kullaniciBilgi;
    }

}
