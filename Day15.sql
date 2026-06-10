Create database Employees_DB;
Show databases;
 
select database();
 
use Employees_DB;
CREATE table Employees(
emp_id INT primary KEY,
emp_name varchar(80),
department varchar(60),
emp_mail varchar(70),
salary decimal(10,2),
email varchar(200),
joining_date DATE
);
select * from Employees;
 
 
INSERT INTO Employees(emp_id, emp_name, department, salary, email, joining_date)
values
(101, 'vas', 'IT', 60000, 'vasudhasurabhi24@gmail.com', '2026-06-22'),
(102, 'vysh', 'IT', 50000, 'vysh27@gmail.com', '2026-06-22'),
(103, 'rupa', 'IT', 40000, 'rupa29@gmail.com', '2026-06-22'),
(104, 'malli', 'IT', 90000, 'malli72@gmail.com', '2026-06-22');
select* from Employees
where department='IT';
SET SQL_SAFE_UPDATES = 0;
UPDATE Employees
SET salary = salary + 5000
WHERE department = 'IT';
SET SQL_SAFE_UPDATES = 1;
SELECT *
FROM Employees
ORDER BY salary DESC;



SELECT *
FROM Employees
ORDER BY salary DESC
LIMIT 2;

SELECT COUNT(*) AS total_employees
FROM Employees;



SELECT AVG(salary) AS average_salary
FROM Employees;



SELECT department, COUNT(*) AS employee_count
FROM Employees
GROUP BY department;



SELECT department, COUNT(*) AS employee_count
FROM Employees
GROUP BY department
HAVING COUNT(*) > 1;



SELECT *
FROM Employees
WHERE email IS NULL;


SELECT *
FROM Employees
WHERE emp_name LIKE 'R%';


SELECT *
FROM Employees
WHERE salary BETWEEN 40000 AND 60000;



SELECT *
FROM Employees
WHERE department IN ('HR', 'IT');


ALTER TABLE Employees
ADD mobile_number VARCHAR(15);


ALTER TABLE Employees
RENAME COLUMN emp_name TO employee_name;


ALTER TABLE Employees
DROP COLUMN mobile_number;



TRUNCATE TABLE Employees;


DROP TABLE Employees;



SELECT e.employee_name, d.department_name
FROM Employees e
JOIN Departments d
ON e.department_id = d.department_id;


SELECT *
FROM Employees
WHERE salary > (
    SELECT AVG(salary)
    FROM Employees
);



SELECT email, COUNT(*) AS duplicate_count
FROM Employees
GROUP BY email
HAVING COUNT(*) > 1;


SELECT *
FROM Employees;


DELETE FROM Employees
WHERE email IS NULL;



CREATE TABLE Employees_Backup AS
SELECT *
FROM Employees;

