USE factory;

SELECT *
FROM employees
ORDER BY salary DESC
LIMIT 3;

SELECT
  title,
  (SELECT count(*)
   FROM employees
   WHERE employees.department_id = departments.id) AS number
FROM departments;

SELECT DISTINCT
  employees.id,
  (SELECT sum(salaries_paid.salary)
   FROM salaries_paid
   WHERE salaries_paid.employee_id = employees.id) AS max_salary
FROM employees, salaries_paid
ORDER BY max_salary DESC
LIMIT 2;

SELECT *
FROM employees
WHERE id NOT IN (SELECT employee_id
                 FROM employees_courses);

SELECT *
FROM employees
WHERE id IN
      (SELECT employee_id
       FROM employees_courses
       GROUP BY employee_id
       HAVING count(employee_id) >= 2);

SELECT *
FROM posts
WHERE id =
      (SELECT post_id
       FROM employees
       GROUP BY post_id ASC
       HAVING count(post_id) >= 1
       LIMIT 1);

SELECT ((SELECT count(*)
         FROM employees_tangibles) / (SELECT count(*)
                                      FROM employees)) AS avg_teng_count;

SELECT tangible_id
FROM employees_tangibles
GROUP BY tangible_id DESC
HAVING count(tangible_id) >= 1
LIMIT 1;

SELECT department_id
FROM employees
WHERE id IN (SELECT employee_id
             FROM (
                    SELECT
                      employees_tangibles.employee_id AS employee_id,
                      SUM(tangibles.price)            AS totals
                    FROM employees_tangibles, tangibles
                    GROUP BY employee_id ASC
                    LIMIT 1) AS total);

SELECT
  t1.name_first,
  t1.name_last
FROM employees t1
INNER JOIN salaries_paid t2
