package com.cgtscorp.totalvote.rest;

import com.cgtscorp.totalvote.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 2018/07/11 -- Roberto Palacios -- CGTS Services, Caracas.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
}
