USE LIS;

SELECT  DISTINCT bi.issue_dt,bi.accession_no,bi.member_id,bi.due_dt,ti.title_nm FROM book_issue bi,titles ti,books bo
WHERE ti.title_id IN (SELECT title_id FROM titles WHERE title_id IN(SELECT bi.accession_no)) ORDER BY bi.issue_dt ASC;