package com.citymain.manager;

import com.citymain.dao.CMDao;
import com.citymain.entities.CityMain;

import java.util.ArrayList;
import java.util.List;

public class CMManager {
    CMDao cmDao = new CMDao();
    List<CityMain> list = cmDao.cityMains();

    public void setCityMain(int id, String name, int pepl) {

        cmDao.setCityMain(id,name,pepl);
    }

    public void getCityMainList(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public void SingleCityMain(int id){
//        System.out.println("single");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getid()==id) {
                System.out.println(list.get(i));
            }
        }
    }
    public void UpdateCityMain(int id, String name, int pepl){
//        System.out.println("Update");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getid()==id) {
                list.get(i).setname(name);
                list.get(i).setPepl(pepl);
                System.out.println(list.get(i));
            }
        }
    }
    public void DeleteCityMain(int id){
//        System.out.println("Delete");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getid()==id) {
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getid()==id) {
                System.out.println("found");
                break;
            }else {
                System.out.println("File Deleted");
                break;
            }
        }
    }

}
