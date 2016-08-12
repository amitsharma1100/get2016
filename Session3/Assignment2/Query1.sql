USE LIS;

CREATE VIEW VIEW_book_sub_title AS (
SELECT titles.title_id, subjects.subject_id, subjects.subject_nm FROM titles 
LEFT JOIN subjects ON titles.subject_id = subjects.subject_id
);


SELECT VIEW_book_sub_title.subject_id, VIEW_book_sub_title.subject_nm, COUNT(VIEW_book_sub_title.subject_nm)
AS noOfbooksPurchasedSoFar
FROM VIEW_book_sub_title 
RIGHT JOIN books ON VIEW_book_sub_title.title_id = books.title_id 
GROUP BY VIEW_book_sub_title.subject_nm
ORDER BY VIEW_book_sub_title.subject_nm;


