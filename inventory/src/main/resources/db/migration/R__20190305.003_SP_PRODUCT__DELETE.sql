DELIMITER ;;
CREATE  PROCEDURE `product__delete`(
IN p_id int)
BEGIN
DELETE FROM product
 WHERE id=p_id;
END ;;
DELIMITER ;
