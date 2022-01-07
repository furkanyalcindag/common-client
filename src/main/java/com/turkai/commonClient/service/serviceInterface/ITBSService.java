package com.turkai.commonClient.service.serviceInterface;

import com.turkai.commonClient.configuration.WSConfiguration;
import com.turkai.commonClient.model.RequestModel.TBS.TBSAracPlakaRequest;
import com.turkai.commonClient.model.ResponseModel.TBSResponse.AracDurumlariResponse;
import com.turkai.commonClient.model.ResponseModel.TBSResponse.AracSahibiResponse;

public interface ITBSService {

    AracSahibiResponse plakadanAracSahibiGetirService(WSConfiguration ws, TBSAracPlakaRequest tbsAracPlakaRequest);

    AracDurumlariResponse plakadanAracDurumuGetirService(WSConfiguration ws, TBSAracPlakaRequest tbsAracPlakaRequest);


}
