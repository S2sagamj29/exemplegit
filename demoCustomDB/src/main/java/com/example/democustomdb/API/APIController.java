package com.example.democustomdb.API;

import com.example.democustomdb.DAO.Imp.ServiceAPI;
import com.example.democustomdb.DTO.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/TestApi")
public class APIController {

    @Autowired
    ServiceAPI service;

    @GetMapping("/GetInfo")
    public List<> getInfo(@RequestParam("category") String category , @RequestParam("code") String code){

        return service.getInfo(category,code);
    }


}
