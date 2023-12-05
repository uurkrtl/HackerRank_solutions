-- Created by Ugur Kartal

SELECT ci.NAME
FROM CITY ci
LEFT JOIN COUNTRY co
ON ci.CountryCode = co.Code
WHERE co.CONTINENT = 'Africa';