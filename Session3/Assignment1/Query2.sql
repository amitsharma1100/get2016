USE LIS;

INSERT INTO members(member_nm,addressline1,adddessline2,category) VALUES ("SHOBHIT","Alwar","Rajasthan","Premium Member");

SELECT member_nm AS Name, LENGTH(member_nm) AS LengthOfName FROM members 
where LENGTH(member_nm) = (SELECT MAX(LENGTH(member_nm)) FROM members);