USE LIS;

INSERT INTO book_issue(issue_dt,accession_no,member_id,due_dt) VALUES ('2014/08/21',2,2,'2014/011/29');

SELECT * FROM book_issue where DATEDIFF(due_dt,issue_dt) > 60;