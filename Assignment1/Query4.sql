USE LIS;

/*
Write a SELECT command to display information of those books
whose price is equal to the most expensive book purchase so far.
*/
SELECT title_nm FROM titles WHERE title_id
IN (SELECT title_id FROM books WHERE price=
(SELECT max(price) FROM books)
);