-- Created by Ugur Kartal

SELECT SUM(ci.POPULATION)
FROM CITY ci
LEFT JOIN COUNTRY co
ON ci.COUNTRYCODE = co.CODE
WHERE co.CONTINENT = 'Asia';