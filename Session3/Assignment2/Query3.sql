USE LIS;

CREATE VIEW title_view AS (SELECT titles.title_nm, books.price FROM books LEFT JOIN titles ON books.title_id = titles.title_id);

SELECT * FROM title_view WHERE title_view.price > ( SELECT MIN(price) FROM books);