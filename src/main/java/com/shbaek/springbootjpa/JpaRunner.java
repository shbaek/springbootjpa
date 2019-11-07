package com.shbaek.springbootjpa;

import com.shbaek.model.entity.Item;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager em;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Item item = new Item();
        item.setName("휴지");
        item.setPrice(500);
        item.setStockQuantity(10);

        em.persist(item);



    }
}
