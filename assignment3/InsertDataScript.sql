USE LIS;

INSERT INTO members (member_nm,addressline1,addressline2,category) VALUES("Amit Sharma","Mansarovar","Jaipur","M");
INSERT INTO members (member_nm,addressline1,addressline2,category) VALUES("Juhi Mishra","Somsarovar","Nainital","F");

INSERT INTO subjects (subject_nm) VALUES("Databases");
INSERT INTO subjects (subject_nm) VALUES("SalesForce");

INSERT INTO publishers (publisher_nm) VALUES ("Sudershan Publications");
INSERT INTO publishers (publisher_nm) VALUES ("Dhanpat Rai Books");
 
INSERT INTO authors (author_nm) VALUES ("H.F. Korth");
INSERT INTO authors (author_nm) VALUES ("Suresh Sharma");

INSERT INTO titles (title_nm,subject_id,publisher_id) VALUES ("An Insight Of Database",1,1);
INSERT INTO titles (title_nm,subject_id,publisher_id) VALUES ("Lets SalesForce",2,2);

INSERT INTO books (title_id,purchase_dt,price,status) VALUES (1,'2016-08-10',250,"available");
INSERT INTO books (title_id,purchase_dt,price,status) VALUES (2,'2015-11-05',358,"borrowed");

INSERT INTO book_issue (issue_dt,accession_no,member_id,due_dt) VALUES ('2016-08-15',1,1,'2016-08-30');
INSERT INTO book_issue (issue_dt,accession_no,member_id,due_dt) VALUES ('2016-02-06',2,2,'2016-02-21');

INSERT INTO title_author (title_id,author_id) VALUES (1,1);
INSERT INTO title_author (title_id,author_id) VALUES (2,2);

INSERT INTO book_return(return_dt,accession_no,member_id,issue_dt) VALUES ('2016-08-31',1,1,'2016-08-15');
INSERT INTO book_return(return_dt,accession_no,member_id,issue_dt) VALUES ('2016-02-25',1,1,'2016-02-21');