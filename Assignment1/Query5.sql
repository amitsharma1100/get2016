USE LIS;

/*
Write a SELECT command to display the second maximum price
of a book.
*/

SELECT MAX(price) FROM books WHERE price NOT IN (SELECT MAX(price) FROM books);