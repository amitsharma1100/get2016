USE LIS;

CREATE TABLE IF NOT EXISTS members (
member_id int PRIMARY KEY AUTO_INCREMENT,
member_nm VARCHAR(50),
addressline1 VARCHAR(50),
addressline2 VARCHAR(50),
category VARCHAR(50)
);

ALTER TABLE book_issue
ADD CONSTRAINT FOREIGN KEY (member_id) REFERENCES members(member_id);

ALTER TABLE book_return
ADD CONSTRAINT FOREIGN KEY (member_id) REFERENCES members(member_id);