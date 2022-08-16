package com.example.democustomdb.DAO.Imp;

import com.example.democustomdb.DTO.Info;

import java.util.List;

public interface ServiceAPI {
   List<Info> getInfo(String price , String code);
}
