/*Revising the Select Query I*/
/*Query all columns for all American cities in the CITY table with populations larger than 100000. 
The CountryCode for America is USA*/
select * 
from city 
where  population>100000 and countrycode='USA';

/*Revising the Select Query II*/
/*Query the NAME field for all American cities in the CITY table with populations larger than 120000. 
The CountryCode for America is USA.*/
select name 
from city 
where  population>120000 and countrycode='USA';

/*Select All*/
/*Query all columns (attributes) for every row in the CITY table.*/
select *
from city;

/*Select By ID*/
/*Query all columns for a city in CITY with the ID 1661.*/
select *
from city
where id=1661;

/*Japanese Cities' Attributes*/
/*Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN.*/
select *
from city
where countrycode='JPN';

/*Japanese Cities' Names*/
/*Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.*/
select name
from city
where countrycode='JPN';

/*Weather Observation Station 1*/
/*Query a list of CITY and STATE from the STATION table.*/
select city, state
from station;

/*Weather Observation Station 3*/
/*Query a list of CITY names from STATION for cities that have an even ID number. Print the results in any order, but exclude duplicates from the answer.*/
select distinct city
from station
where id%2=0;

/*Weather Observation Station 4*/
/*Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.*/
select count(*)-count(distinct city)
from station;

/*Weather Observation Station 6*/
/*Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.*/
SELECT distinct city 
FROM station 
where (city like 'A%' or
           city like 'E%' or
           city like 'I%' or 
           city like 'O%' or
           city like 'U%')
order by city;

/*Weather Observation Station 7*/
/*Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates.*/
SELECT distinct city 
FROM station 
where (city like '%a' or
           city like '%e' or
           city like '%i' or 
           city like '%o' or
           city like '%u')
order by city;

/*Weather Observation Station 8*/
/*Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. Your result cannot contain duplicates.*/
SELECT distinct city 
FROM station 
where (city like 'A%' or
           city like 'E%' or
           city like 'I%' or 
           city like 'O%' or
           city like 'U%')
       and
           (city like '%a' or
           city like '%e' or
           city like '%i' or 
           city like '%o' or
           city like '%u')
order by city;

/*Weather Observation Station 9*/
/*Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.*/
SELECT distinct city 
FROM station 
where (city not like 'A%' and
           city not like 'E%' and
           city not like 'I%' and 
           city not like 'O%' and
           city not like 'U%')
order by city;

/*Weather Observation Station 10*/
/*Query the list of CITY names from STATION that do not end with vowels. Your result cannot contain duplicates.*/

SELECT distinct city 
FROM station 
where (city not like '%a' and
           city not like '%e' and
           city not like '%i' and 
           city not like '%o' and
           city not like '%u')
order by city;

/*Weather Observation Station 11*/
/*Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.*/
SELECT distinct city 
FROM station 
where (city not like 'A%' and
           city not like 'E%' and
           city not like 'I%' and 
           city not like 'O%' and
           city not like 'U%')
       or
           (city not like '%a' and
           city not like '%e' and
           city not like '%i' and 
           city not like '%o' and
           city not like '%u')
order by city;

/*Weather Observation Station 12*/
/*Query the list of CITY names from STATION that do not start with vowels and do not end with vowels. Your result cannot contain duplicates.*/
SELECT distinct city 
FROM station 
where (city not like 'A%' and
           city not like 'E%' and
           city not like 'I%' and 
           city not like 'O%' and
           city not like 'U%')
       and
           (city not like '%a' and
           city not like '%e' and
           city not like '%i' and 
           city not like '%o' and
           city not like '%u')
order by city;

/*Higher Than 75 Marks*/
/*Query the Name of any student in STUDENTS who scored higher than  Marks. Order your output by the last three characters of each name.
 If two or more students both have names ending in the same last three characters (i.e.: Bobby, Robby, etc.), secondary sort them by ascending ID.*/
 select name
 from students
 where marks>75
 order by Right(name,3), id asc;
 
 /*Employee Names*/
 /*Write a query that prints a list of employee names (i.e.: the name attribute) from the Employee table in alphabetical order.*/
 select name
 from employee
 order by name;

/*Employee Salaries*/
/*Write a query that prints a list of employee names (i.e.: the name attribute) for employees in Employee
 having a salary greater than 2000 per month who have been employees for less than 10 months. Sort your result by ascending employee_id.*/
 select name
 from employee
 where salary>2000 and months<10
 order by employee_id;








































































































