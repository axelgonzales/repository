package pe.unac.fiis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import pe.unac.fiis.domain.Product;

@Mapper
@Component
public interface ProductRepository {

	List<Product> findAll();
	Product findId(Integer productId);
	Integer insert(Product product);
	Integer update(Product product);
	void delete(Integer productId);
}
