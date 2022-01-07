package com.turkai.commonClient.service.serviceInterface;

import com.turkai.commonClient.configuration.WSConfiguration;
import com.turkai.commonClient.model.RequestModel.KullaniciBilgi;


public interface IGeneralService {

    KullaniciBilgi setKullaniciBilgi(WSConfiguration ws, String tlpKullaniciAdi, String tlpIP, String tlpTC, String tlpNdnAck, String tlpNdnKod);

    boolean isValidateParamEncoding(String requestParam);

    boolean isValidateParamHTML(String requestParam);

    boolean plateRegexControl(String requestParam);
}
