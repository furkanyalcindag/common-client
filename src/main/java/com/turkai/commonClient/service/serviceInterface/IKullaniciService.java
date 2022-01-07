package com.turkai.commonClient.service.serviceInterface;


import com.turkai.commonClient.configuration.WSConfiguration;
import com.turkai.commonClient.model.ResponseModel.KullaniciResponse.KullaniciYetkiResponse;

public interface IKullaniciService {

    KullaniciYetkiResponse kullaniciDogrulaLDAPService(WSConfiguration ws, String pPBIK, String pParola, String pIP);

    KullaniciYetkiResponse projeKullaniciEkle(WSConfiguration ws, String pKullaniciAdi);

    KullaniciYetkiResponse projeKullaniciCikar(WSConfiguration ws, String pKullaniciAdi);
}
