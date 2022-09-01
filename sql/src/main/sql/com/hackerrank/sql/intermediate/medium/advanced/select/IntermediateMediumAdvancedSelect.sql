/*Binary Tree Nodes */
/*Write a query to find the node type of Binary Tree ordered by the value of the node. Output one of the following for each node:

Root: If node is root node.
Leaf: If node is leaf node.
Inner: If node is neither root nor leaf node.*/

SELECT N as num,
CASE 
    WHEN P IS NULL THEN 'Root'
    WHEN (SELECT COUNT(*) FROM BST WHERE num=P)=0 THEN 'Leaf'
    ELSE 'Inner'
END
FROM BST ORDER BY N ASC;

/*New Companies*/
/*Given the table schemas below, write a query to print the company_code, founder name, total number of lead managers, 
total number of senior managers, total number of managers, and total number of employees. Order your output by 
ascending company_code.*/

select c.company_code, c.founder, 
count(distinct e.lead_manager_code),
count(distinct e.senior_manager_code), 
count(distinct e.manager_code), 
count(distinct e.employee_code)
from employee e
join company c using(company_code)
group by 1, 2
order by 1