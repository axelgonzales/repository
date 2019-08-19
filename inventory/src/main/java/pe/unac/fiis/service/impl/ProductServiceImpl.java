package pe.unac.fiis.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import pe.unac.fiis.domain.Product;
import pe.unac.fiis.repository.ProductRepository;
import pe.unac.fiis.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> findAll() {
		return this.productRepository.findAll();
	}

	@Override
	public Product findId(Integer productId) {
		// TODO Auto-generated method stub
		return this.productRepository.findId(productId);
	}

	@Override
	public Integer insert(Product product) {
		return  this.productRepository.insert(product);
	}

	@Override
	public Integer update(Product product) {
		// TODO Auto-generated method stub
		return this.productRepository.update(product);
	}

	@Override
	public void delete(Integer productId) {
		// TODO Auto-generated method stub
		this.productRepository.delete(productId);
		
	}

}
