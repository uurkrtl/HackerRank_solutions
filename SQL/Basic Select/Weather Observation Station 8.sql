-- Created by Ugur Kartal

SELECT DISTINCT(t.CITY)
FROM STATION AS t
WHERE LOWER(SUBSTR(CITY,LENGTH(CITY),1)) IN ('a','e','i','o','u')
AND LOWER(SUBSTR(CITY,1,1)) IN ('a','e','i','o','u');