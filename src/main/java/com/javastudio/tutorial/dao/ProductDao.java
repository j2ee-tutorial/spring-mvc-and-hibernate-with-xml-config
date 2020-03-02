package com.javastudio.tutorial.dao;

import com.javastudio.tutorial.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ProductDao {

    Logger logger = LoggerFactory.getLogger(ProductDao.class);
    final SessionFactory sessionFactory;

    public ProductDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Product> list() {
        if (sessionFactory == null)
            logger.warn("Session factory is null");
        else
            logger.info(sessionFactory.toString());

        Session session = sessionFactory.getCurrentSession();
        List<Product> products = session.createQuery("select t from Product t").list();
        return products;
    }
}
