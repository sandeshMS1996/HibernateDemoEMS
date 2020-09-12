use employeedb;
create table Employee (
   id INT NOT NULL AUTO_INCREMENT,
   empName VARCHAR(30) NOT NULL,
   salary  DECIMAL(10,2) NOT NULL,
   departement    VARCHAR(30) NOT NULL,
   PRIMARY KEY (id)
);