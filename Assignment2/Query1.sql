USE LIS;

/*
 Create a View which can be used to display member name and
all issue details of the member using a simple SELECT command.
*/

CREATE VIEW issuedBookDetails AS
(
SELECT m.member_nm,bi.accession_no,b.title_id,t.title_nm 
FROM members m,book_issue bi,books b,titles t
WHERE m.member_id=bi.member_id && bi.accession_no=b.accession_no && b.title_id=t.title_id
);