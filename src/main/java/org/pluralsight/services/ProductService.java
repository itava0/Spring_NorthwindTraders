package org.pluralsight.services;


import org.pluralsight.model.Product;

public interface ProductService {
    void addProduct(Product product);

    Iterable<Object> getAll();
}

