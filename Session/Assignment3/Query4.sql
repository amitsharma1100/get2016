USE LIS;

CREATE VIEW title_author_view 
AS (SELECT title_author.title_id, authors.author_nm 
FROM title_author
LEFT JOIN authors
ON title_author.author_id=authors.author_id);

SELECT DISTINCT title_author_view.author_nm FROM title_author_view
RIGHT JOIN books ON 
title_author_view.title_id=books.title_id;