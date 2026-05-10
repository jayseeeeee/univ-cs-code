-- Show all column entries from table 'test'
SELECT * FROM subject;

-- Show only specific column entries from table 'subject'
SELECT subject_number, name FROM subject;

-- Show specific columns from table 'subject' without duplicate entries
SELECT DISTINCT join_date FROM party;

-- Show column entries that meet the specified condition
SELECT * FROM subject WHERE subject_number = 11;
SELECT * FROM subject WHERE name = 'Kali Prasad';
SELECT * FROM subject WHERE height >= 1.6;
SELECT * FROM subject WHERE birth_date < '1970-01-01';
SELECT * FROM subject WHERE subject_number != 2;
SELECT * FROM subject WHERE height IS NULL;
SELECT * FROM subject WHERE name IS NOT NULL;