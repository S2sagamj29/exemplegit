package com.example.democustomdb.DAO.Imp;

import com.example.democustomdb.DTO.Info;
import com.example.democustomdb.repo.NewCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAPIImp implements ServiceAPI{

   @Autowired
    NewCategoryRepo newCategoryRepo;

    @Override
    public List<Info> getInfo(String price ,String code) {
        List<Info> list = newCategoryRepo.getInfoApi(price ,code);

        return list;
    }
}
