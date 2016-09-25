CREATE DATABASE  IF NOT EXISTS employee ;

USE employee;

CREATE TABLE employeeinfo (
  ID varchar(100) NOT NULL,
  EmployeeName varchar(100) NOT NULL,
  EmployeeAge int(11) NOT NULL,
  PRIMARY KEY (ID)
);


INSERT INTO employeeinfo VALUES ('E121','Amit Sharma',21),('E321','Simran Kapoor',21),('E910','Ajinkya Pandey',22),('E978','Yash Jain',23);