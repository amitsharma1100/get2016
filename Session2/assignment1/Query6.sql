USE LIS;

SELECT  t.title_id,s.subject_nm AS Subject,p.publisher_nm AS Publisher 
FROM titles t
INNER JOIN subjects s ON t.subject_id=s.subject_id
INNER JOIN publishers p ON t.publisher_id=p.publisher_id;