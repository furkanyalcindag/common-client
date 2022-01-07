package com.turkai.commonClient.service.serviceInterface;


import com.turkai.commonClient.configuration.WSConfiguration;
import com.turkai.commonClient.model.RequestModel.MERNIS.KisiDogrulaRequest;
import com.turkai.commonClient.model.RequestModel.MERNIS.KisiRequest;
import com.turkai.commonClient.model.ResponseModel.MERNISResponse.KisiFotografResponse;
import com.turkai.commonClient.model.ResponseModel.MERNISResponse.TCKisiResponse;

public interface IMERNISService {

    KisiFotografResponse kisiFotografGetir(WSConfiguration ws, KisiRequest kisiRequest);

    TCKisiResponse TCKisiGetir(WSConfiguration ws, KisiRequest kisiRequest);

    boolean TCKisiDogrula(WSConfiguration ws, KisiDogrulaRequest kisiDogrulaRequest);

}
