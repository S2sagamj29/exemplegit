package com.example.democustomdb.repo;

import com.example.democustomdb.DTO.Info;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Component
public class getInfoImp implements getInfo{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Info> getInfoApi(String price , String code) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT *");
        sb.append("FROM DEMOCUSTOMDB.CATEGORY_ENTITY a");
        sb.append("INNER JOIN DEMOCUSTOMDB.ROLE ON a.price = :price AND b.code =:code");
        Query query = em.createNativeQuery(sb.toString(),Info.class);
        query.setParameter("price",price);
        query.setParameter("code",code);




        return query.getResultList();
    }
}
