SELECT unique_id,name
FROM Employees as emp
LEFT JOIN EmployeeUNI as eu
ON   eu.id=emp.id;