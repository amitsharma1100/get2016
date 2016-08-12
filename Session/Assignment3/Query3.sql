USE LIS;

CREATE VIEW members_book_view AS
(SELECT book_issue.accession_no, book_issue.issue_dt,book_issue.due_dt, members.category FROM book_issue 
LEFT JOIN members
ON book_issue.member_id=members.member_id);

SELECT * FROM members_book_view
WHERE category NOT IN ('Faculty');
