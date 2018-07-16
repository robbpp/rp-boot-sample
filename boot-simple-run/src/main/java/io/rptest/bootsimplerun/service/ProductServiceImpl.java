package io.rptest.bootsimplerun.service;

import io.rptest.bootsimplerun.component.ProductFormToProduct;
import io.rptest.bootsimplerun.component.ProductForm;
import io.rptest.bootsimplerun.domain.Product;
import io.rptest.bootsimplerun.rest.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    private ProductFormToProduct productFormToProduct;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ProductFormToProduct productFormToProduct) {
        this.productRepository = productRepository;
        this.productFormToProduct = productFormToProduct;
    }


    @Override
    public List<Product> listAll() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Product getById(Long id) {
        Product prd = new Product();
        Optional<Product> prodresult = productRepository.findById(id);
        if (prodresult.isPresent()){
            prd = prodresult.get();
        }
        return prd;
    }

    @Override
    public Product saveOrUpdate(Product product) {
        productRepository.save(product);
        return product;
    }


    public void delete(Long id) {
        productRepository.deleteById(id);

    }

    @Override
    public Product saveOrUpdateProductForm(ProductForm productForm) {
        Product savedProduct = saveOrUpdate(productFormToProduct.convert(productForm));

        System.out.println("Saved Product Id: " + savedProduct.getId());
        return savedProduct;
    }
}
