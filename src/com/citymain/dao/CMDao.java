package com.citymain.dao;

import com.citymain.datastore.CMDataStore;
import com.citymain.entities.CityMain;

import java.util.List;

public class CMDao {
    CMDataStore cmDataStore = new CMDataStore();
    public void setCityMain(int id, String name, int pepl) {
        cmDataStore.setCityMain(id,name,pepl);
    }

//    public void getCityMain(){
//     cmDataStore.setCityMain();
//    }

    public List<CityMain> cityMains(){
        return cmDataStore.cityMains();
    }
}
