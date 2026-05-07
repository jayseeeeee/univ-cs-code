-- Wildcard characters substitute characters in a string

-- '%' represents any characters
SELECT * FROM party
WHERE name LIKE '%n'; -- Everything that has 'n' in the end

-- '_' represents one random character
SELECT * FROM party
WHERE name LIKE '____'; -- Everything that has 4 any characters

-- Both wildcards can be combined
SELECT * FROM party
WHERE join_date LIKE '198_-0_-%'