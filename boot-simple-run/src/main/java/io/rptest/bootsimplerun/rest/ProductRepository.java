package io.rptest.bootsimplerun.rest;

import io.rptest.bootsimplerun.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
