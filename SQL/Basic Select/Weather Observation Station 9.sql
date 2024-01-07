-- Created by Ugur Kartal

SELECT DISTINCT(t.CITY)
FROM STATION AS t
WHERE LOWER(SUBSTR(CITY,1,1)) NOT IN ('a','e','i','o','u');