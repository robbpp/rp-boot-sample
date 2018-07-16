package io.rptest.bootsimplerun.service;

import io.rptest.bootsimplerun.component.ProductForm;
import io.rptest.bootsimplerun.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
