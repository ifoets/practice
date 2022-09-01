/*Population Census */
/*Given the CITY and COUNTRY tables, query the sum of the populations of all cities where the CONTINENT is 'Asia'.

Note: CITY.CountryCode and COUNTRY.Code are matching key columns.*/
select sum(c.population)
from city c 
join country ct on c.countrycode=ct.code
where ct.CONTINENT='Asia';

/*African Cities*/
/*Given the CITY and COUNTRY tables, query the names of all cities where the CONTINENT is 'Africa'.

Note: CITY.CountryCode and COUNTRY.Code are matching key columns.*/
select c.name
from city c 
join country ct on c.countrycode=ct.code
where ct.CONTINENT='Africa';

/*Average Population of Each Continent*/
/*Given the CITY and COUNTRY tables, query the names of all the continents (COUNTRY.Continent) and their respective average city populations (CITY.Population) rounded down to the nearest integer.

Note: CITY.CountryCode and COUNTRY.Code are matching key columns.*/
select ct.Continent, floor(avg(c.population))
from country ct
join city c on c.countrycode=ct.code
group by ct.Continent

