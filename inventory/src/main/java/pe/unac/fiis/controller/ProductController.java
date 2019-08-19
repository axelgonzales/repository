package pe.unac.fiis.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.unac.fiis.domain.Product;
import pe.unac.fiis.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	
	private  final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping
	public ResponseEntity<?> insert(
			@RequestBody Product product
			) {
		
		Integer id = productService.insert(product);
		if (id<1) {
			return new ResponseEntity<>("Ocurrio un error al hacer insert en la bd",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<>(product,HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() {
		
		List<Product> products = productService.findAll();
		
		return new ResponseEntity<>(products,HttpStatus.OK);
		
	}
	
	@PutMapping("/{productId}")
	public ResponseEntity<?>update(
			@PathVariable  int productId,
			@RequestBody Product product
			) {
		
		product.setId(productId);
		
		productService.update(product);

		
		return new ResponseEntity<>(product,HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/{productId}")
	public ResponseEntity<?>delete(
	       @PathVariable int productId
	       ){
		
		productService.delete(productId);	
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("{productId}")
	public ResponseEntity<?>findId(
			@PathVariable int productId
			){
		Product product=productService.findId(productId);
		if (product == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(product,HttpStatus.OK);
	}
	
	

}
