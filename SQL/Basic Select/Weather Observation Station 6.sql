-- Created by Ugur Kartal

SELECT t.CITY
FROM STATION AS t
WHERE LOWER(SUBSTR(CITY,1,1)) IN ('a','e','i','o','u');