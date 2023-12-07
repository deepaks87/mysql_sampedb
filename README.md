# Employees Sample Database
A sample database with an integrated test suite, used to test your applications and database servers.

## Prerequisites
You need a MySQL database server > 5.0 and run the commands below through a user that has the following privileges:

``SELECT, INSERT, UPDATE, DELETE, 
CREATE, DROP, RELOAD, REFERENCES, 
INDEX, ALTER, SHOW DATABASES, 
CREATE TEMPORARY TABLES, 
LOCK TABLES, EXECUTE, CREATE VIEW``

## How to use it
```
1. Download the repository
2. Extract the zip file
3. Change the directory to extracted one
4. Run
   mysql -u[user] -p < ./employees.sql
```
