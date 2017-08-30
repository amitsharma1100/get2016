USE ECOMMERCE;

SELECT c1.category_id,c1.category_nm,IFNULL(c2.category_nm,'Top Category') AS Parent_Category 
FROM categories c1 LEFT JOIN categories c2 ON c1.parent_id=c2.category_id ORDER BY c1.category_nm;