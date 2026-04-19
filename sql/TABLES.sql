-- Create table by specifying the table name as 'test'
-- It should contain the column name and its data type
CREATE TABLE test (
     subject_number INT, -- Integer identifier
     first_name VARCHAR(50), -- Variable-length string
     last_name VARCHAR(50), -- Variable-length string
     height DECIMAL(2,2), -- Numeric with precision/scale
     birth_date DATE, -- Calendar date
     birth_time TIME, -- Calendar date
     powers TEXT, -- Large text field
     is_alive BOOLEAN, -- True/False flag
     created_at TIMESTAMP, -- Date + time
     residence CHAR(100), -- Fixed-length string
     profile_picture BLOB, -- Binary large object (images/files)
     preferences JSON -- Structured JSON data
);

-- Select all columns from table 'test'
SELECT * FROM test;

-- Renames the table 'test' to 'subject'
RENAME TABLE test TO subject;

-- Deletes the table 'subject'
DROP TABLE subject;

-- Add a new column 'quotation' in the table 'subject'
ALTER TABLE subject ADD quotation TEXT;

-- Rename the column 'quotation' to 'catchphrase' instead
ALTER TABLE subject RENAME COLUMN quotation TO catchphrase;

-- Change the column 'catchphrase' datatype from 'text' to 'varchar' with 500 max characters instead
ALTER TABLE subject MODIFY COLUMN catchphrase VARCHAR(500);

-- Change the column datatype and sequence
-- The 'subject_number' column should come after the 'last_name' column
ALTER TABLE subject MODIFY subject_number INT AFTER last_name;
-- The 'subject_number' column is placed first before all column
ALTER TABLE subject MODIFY subject_number INT FIRST;

-- Deletes the column 'created_at' from the table 'subject'
ALTER TABLE subject DROP COLUMN created_at;