package com.java.designpatterns.initial.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.java.designpatterns.initial.entities.Product;

import org.springframework.stereotype.Component;

@Component
public class ProductRepository {

    private Map<Long, Product> map = new HashMap<>();

	public void save(Product obj) {
		map.put(obj.getId(), obj);
	}

	public Product findById(Long id) {
		return map.get(id);
	}
	
	public List<Product> findAll() {
		return new ArrayList<Product>(map.values());
	}
}
