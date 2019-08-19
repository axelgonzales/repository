


DELIMITER ;;
CREATE  PROCEDURE `product__find_all`()
BEGIN
	SELECT 
		id 				as product_id,
        name			as product_name,
        quanty			as product_quanty,
        type			as product_type,
        priece 			as product_priece
    FROM
		product;
END ;;
DELIMITER ;


DELIMITER ;;
CREATE  PROCEDURE `product__find_id`(
IN p_id int)
BEGIN
	SELECT 
		id 				as product_id,
        name			as product_name,
        quanty			as product_quanty,
        type			as product_type,
        priece 			as product_priece
    FROM
		product
		WHERE id=p_id;

END ;;
DELIMITER ;


DELIMITER ;;
CREATE  PROCEDURE `product__insert`(
IN p_name varchar(45),
IN p_quanty int,
IN p_type int,
IN p_priece int
)
BEGIN

INSERT INTO product 
(name,quanty,type,priece)
VALUES
(p_name,p_quanty,p_type,p_priece);

SELECT last_insert_id();

END ;;
DELIMITER ;

DELIMITER ;;
CREATE  PROCEDURE `product__update`(
IN p_id int,
IN p_name varchar(45),
IN p_quanty int,
IN p_type int,
IN p_priece int
)
BEGIN

UPDATE product
SET name=p_name,
     quanty=p_quanty,
	type=p_type,
    priece=p_priece
WHERE id=p_id ;

select last_insert_id();
END ;;
DELIMITER ;

