-- Created by Ugur Kartal

SELECT IF (s.Marks < 70, 'NULL', s.Name), g.Grade, s.Marks
FROM Students AS s, Grades AS g
WHERE s.Marks BETWEEN g.Min_Mark AND g.Max_Mark
ORDER BY g.GRADE DESC, s.NAME;