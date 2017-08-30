USE LIS;

/*
Write a SELECT command to display information on the books
that have been returned after their due dates. The information
should include book issue date, title, member name and due
date.
Note: Use Correlated Subquery.
*/

SELECT bi.issue_dt AS Issue_Date, t.title_nm AS Title,
m.member_nm AS Member, bi.due_dt AS Due_Date FROM book_issue bi
INNER JOIN members m ON bi.member_id = m.member_id
INNER JOIN books b ON bi.accession_no = b.accession_no
INNER JOIN titles t ON b.title_id = t.title_id
WHERE (bi.issue_dt, bi.accession_no, bi.member_id) IN
(SELECT br.issue_dt, br.accession_no, br.member_id FROM book_return br
WHERE TIMESTAMPDIFF(DAY, bi.due_dt, br.return_dt) > 0);