SELECT name,unique_id
FROM Employees as emp
left JOIN EmployeeUNI as eu
ON   eu.id=emp.id;