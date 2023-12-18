package org.pluralsight.services;

import org.pluralsight.dao.SimpleProductDAO;
import org.pluralsight.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class ProductServiceImpl implements ProductService {

    private final SimpleProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(SimpleProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public void addProduct(Product product) {
        productDAO.add(product);
    }

    public Iterable<Object> getAll() {
        return Collections.singleton(productDAO.getAll());
    }

}

