package com.example.democustomdb.repo;

import com.example.democustomdb.DTO.Info;
import org.springframework.stereotype.Component;

import java.util.List;


public interface getInfo {
    List<Info> getInfoApi(String price, String code);
}
