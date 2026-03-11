
mysql> use college;
Database changed
mysql> CREATE TABLE student (
    ->     id INT PRIMARY KEY,
    ->     name VARCHAR(10) NOT NULL,
    ->     address VARCHAR(10) NOT NULL,
    ->     age INT NOT NULL
    -> );
Query OK, 0 rows affected (0.11 sec)

mysql> INSERT INTO student VALUES (1,'Rahul','Mumbai',21);
Query OK, 1 row affected (0.02 sec)

mysql> INSERT INTO student VALUES (2,'Aman','Delhi',22);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO student VALUES (3,'Neha','Pune',20);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO student VALUES (4,'Riya','Thane',23);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO student VALUES (5,'Karan','Nashik',24);
Query OK, 1 row affected (0.02 sec)

mysql> SELECT
    -> SUM(age) AS total_age,
    -> AVG(age) AS average_age,
    -> MIN(age) AS minimum_age,
    -> MAX(age) AS maximum_age,
    -> COUNT(age) AS total_students
    -> FROM student;
+-----------+-------------+-------------+-------------+----------------+
| total_age | average_age | minimum_age | maximum_age | total_students |
+-----------+-------------+-------------+-------------+----------------+
|       110 |     22.0000 |          20 |          24 |              5 |
+-----------+-------------+-------------+-------------+----------------+
1 row in set (0.03 sec)