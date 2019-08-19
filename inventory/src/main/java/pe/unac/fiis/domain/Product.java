package pe.unac.fiis.domain;

import lombok.Data;

@Data
public  class Product {

	private Integer id;
	private String name;
	private Integer quanty;
	private Integer type;
	private Double priece;
}
