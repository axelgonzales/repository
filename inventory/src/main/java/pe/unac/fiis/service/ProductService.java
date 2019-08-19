package pe.unac.fiis.service;

import java.util.List;

import pe.unac.fiis.domain.Product;

public interface ProductService {

	List<Product> findAll();
	Product findId(Integer productId);
	Integer insert(Product product);
	Integer update(Product product);
	void delete(Integer productId);
}
