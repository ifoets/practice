/*Top Earners */
/*Write a query to find the maximum total earnings(salary*months) for all employees as well as the total number of employees 
who have maximum total earnings. Then print these values as 2 space-separated integers.*/

select max(salary*months), space(2), (select count(name) from employee where salary*months = (select max(salary*months) from employee))
from employee;

/*Revising Aggregations - The Count Function*/
/*Query a count of the number of cities in CITY having a Population larger than 100,000*/
select count(name)
from city
where population>100000;

/*Revising Aggregations - The Sum Function*/
/*Query the total population of all cities in CITY where District is California.*/
select sum(population)
from city
where district='California';

/*Revising Aggregations - Averages*/
/*Query the average population of all cities in CITY where District is California.*/
select avg(population)
from city
where district='California';

/*Average Population*/
/*Query the average population for all cities in CITY, rounded down to the nearest integer.*/
select round(avg(population))
from city;

/*Japan Population*/
/*Query the sum of the populations for all Japanese cities in CITY. The COUNTRYCODE for Japan is JPN.*/
select sum(population)
from city
where countrycode='JPN';

/*Population Density Difference*/
/*Query the difference between the maximum and minimum populations in CITY.*/
select max(population)-min(population)
from city;

/*The Blunder*/
/*Samantha was tasked with calculating the average monthly salaries for all employees in the EMPLOYEES table, 
but did not realize her keyboard's  key was broken until after completing the calculation. She wants your help finding the difference between 
her miscalculation (using salaries with any zeros removed), and the actual average salary.

Write a query calculating the amount of error (i.e.:  average monthly salaries), and round it up to the next integer.*/
SELECT CEIL(AVG(Salary) - AVG(REPLACE(Salary, '0', ''))) 
FROM EMPLOYEES;

/*Weather Observation Station 2*/
/*Query the following two values from the STATION table:

The sum of all values in LAT_N rounded to a scale of 2 decimal places.
The sum of all values in LONG_W rounded to a scale of 2 decimal places.*/
select round(sum(LAT_N),2) as lat, round(sum(LONG_W),2) as lon
from station;

/*Weather Observation Station 13*/
/*Query the sum of Northern Latitudes (LAT_N) from STATION having values greater than 38.7880 and less than 137.2345 . Truncate your answer to 4 decimal places.*/
select round(sum(LAT_N),4)
from station
where LAT_N > '38.7880' and LAT_N < '137.2345';

/*Weather Observation Station 14*/
/*Query the greatest value of the Northern Latitudes (LAT_N) from STATION that is less than 137.2345. Truncate your answer to 4 decimal places.*/
select round(max(LAT_N),4)
from station
where LAT_N < '137.2345';

/*Weather Observation Station 15*/
/*Query the Western Longitude (LONG_W) for the largest Northern Latitude (LAT_N) in STATION that is less than 137.2345 . Round your answer to 4 decimal places.*/
select round(LONG_W,4)
from station
where LAT_N=(select max(LAT_N) from station where LAT_N<'137.2345');

/*Weather Observation Station 16*/
/*Query the smallest Northern Latitude (LAT_N) from STATION that is greater than 38.7780. Round your answer to 4 decimal places.*/
select round(min(LAT_N),4)
from station
where LAT_N > 38.7780;

/*Weather Observation Station 17*/
/*Query the Western Longitude (LONG_W) where the smallest Northern Latitude (LAT_N) in STATION is greater than 38.7780. Round your answer to 4 decimal places.*/
select round(LONG_W,4) 
from station
where LAT_N =(select min(LAT_N) from station where LAT_N > 38.7780);








































