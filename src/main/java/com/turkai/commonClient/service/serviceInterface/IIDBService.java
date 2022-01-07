package com.turkai.commonClient.service.serviceInterface;


import com.turkai.commonClient.configuration.JNDDBConfiguration;
import com.turkai.commonClient.model.DTO.IDB.IDBSahisDTO;

public interface IIDBService {

    IDBSahisDTO isExistIDBSahis(long tc, JNDDBConfiguration jnddbConfiguration);
}
