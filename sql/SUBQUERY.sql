-- SUBQUERY has query within another query where it gets the result of subquery and treats it as an actual value
-- It can be used inside SELECT or WHERE statements and uses parenthesis to highlight the subquery

SELECT name, age, (SELECT AVG(age) FROM party as avg_age) -- Subquery
FROM party;

SELECT name, role FROM party
WHERE join_date > (SELECT MAX(join_date) FROM party); -- Subquery in operators

SELECT name, role FROM party
WHERE subject_number IN (SELECT subject_number FROM subject); -- Subquery as categories