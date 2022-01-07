package com.turkai.commonClient.service.serviceInterface;


import com.turkai.commonClient.model.DBModel.OtonomBLGTPLAKTUyapKayitLog;
import com.turkai.commonClient.model.DBModel.OtonomKIHBISahisSucLog;
import com.turkai.commonClient.model.DTO.UyapKihbi.GenelDTO;
import com.turkai.commonClient.model.DTO.UyapKihbi.KihbiUyapDurumDTO;
import com.turkai.commonClient.configuration.JNDDBConfiguration;


import java.util.List;

public interface IUyapKihbiService {

    List<OtonomKIHBISahisSucLog> getKihbiList(long tc, JNDDBConfiguration jnddbConfiguration);

    List<OtonomBLGTPLAKTUyapKayitLog> getUyapList(long tc, JNDDBConfiguration jnddbConfiguration);

    GenelDTO getAll(List<String> servisList, long tc, JNDDBConfiguration jnddbConfiguration);

    KihbiUyapDurumDTO getKihbiUyapDurum(long tc, JNDDBConfiguration jnddbConfiguration);


}
