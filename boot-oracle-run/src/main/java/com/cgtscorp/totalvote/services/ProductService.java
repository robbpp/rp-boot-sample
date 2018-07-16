package com.cgtscorp.totalvote.services;

import com.cgtscorp.totalvote.component.ProductForm;
import com.cgtscorp.totalvote.domain.Product;

import java.util.List;

/**
 * Created on 2018/07/11 -- Roberto Palacios -- CGTS Services, Caracas.
 */
public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
