package org.pluralsight.dao;

import org.pluralsight.model.Product;

import java.util.List;

public interface ProductDao {
    public void add(Product product);
    public List<Product> getAll();
}
