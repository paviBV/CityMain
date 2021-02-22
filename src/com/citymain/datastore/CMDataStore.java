package com.citymain.datastore;

import com.citymain.entities.CityMain;

import java.util.ArrayList;
import java.util.List;

public class CMDataStore {
    List<CityMain> cityMainList = new ArrayList<>();

    public void setCityMain(int id, String name, int pepl) {

        CityMain cityMain = new CityMain();
        cityMain.setid(id);
        cityMain.setname(name);
        cityMain.setPepl(pepl);
        cityMainList.add(cityMain);

    }
//    public void setCityMain(){
//        setCityMain("C001", "Managalore", 3567778);
//        setCityMain("C002", "Bangalore", 5678889);
//        setCityMain("C003", "Udupi", 3567778);
//        setCityMain("C004", "Bantwal", 5678889);
//    }
//    public void getCityMainList(){
//        for (int i = 0; i < cityMainList.size(); i++) {
//            System.out.println(cityMainList.get(i));
//        }
//    }

   public  List<CityMain> cityMains(){
        return cityMainList;
   }
}
