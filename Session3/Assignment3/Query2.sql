USE LIS;

CREATE VIEW view_issue_count AS(SELECT accession_no,COUNT(*) AS counter 
FROM book_issue GROUP BY accession_no HAVING counter > 2); 

CREATE VIEW book_title_view AS (SELECT books.accession_no, titles.title_nm 
FROM books LEFT JOIN titles ON books.title_id = titles.title_id);

SELECT book_title_view.title_nm FROM book_title_view 
INNER JOIN view_issue_count ON book_title_view.accession_no = view_issue_count.accession_no;

