CREATE TABLE Department (
  id int,
  Name VARCHAR);

INSERT INto department VALUES (1,'First department'), (2,'Second department');

CREATE TABLE Employee (
  id int,
  department_id INT,
  name VARCHAR,
  salary int);

INSERT INTO employee VALUES
(1,1,'Ivan',10),
(2,2,'Petr',10),
(3,1,'Igor',90),
(4,2,'Olga',90),
(5,1,'Vika',11),
(6,2,'Konstantin',91),
(7,2,'Pavel',91);

SELECT id, name
FROM Employee AS employees
WHERE employees.salary = (SELECT MAX(salary) FROM Employee AS innerEmployee
                          WHERE innerEmployee.department_id = employees.department_id);

select distinct on (department_id) id, name
from employee
order by department_id, salary desc