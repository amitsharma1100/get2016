USE LIS;

INSERT INTO book_issue(issue_dt,accession_no,member_id,due_dt) VALUES ('2014/08/02',2,4,'2014/011/29');

CREATE VIEW myVIEW AS (SELECT  books.accession_no, titles.title_nm 
FROM books 
LEFT JOIN titles ON books.title_id = titles.title_id);

SELECT * FROM myVIEW;

CREATE VIEW book_view AS (SELECT members.member_nm, book_issue.member_id, myVIEW.title_nm, book_issue.accession_no, book_issue.issue_dt, book_issue.due_dt FROM book_issue 
LEFT JOIN members ON book_issue.member_id = members.member_id
LEFT JOIN myVIEW ON book_issue.accession_no = myVIEW.accession_no 
);

SELECT *,DATEDIFF(due_dt,issue_dt) AS issue_duration FROM book_view where DATEDIFF(due_dt,issue_dt) > 60;