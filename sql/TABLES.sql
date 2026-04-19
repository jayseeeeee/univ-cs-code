-- Create table by specifying the table name as 'test'
-- It should contain the column name and its data type
CREATE TABLE test (
     subject_number INT, -- Integer identifier
     first_name VARCHAR(50), -- Variable-length string
     last_name VARCHAR(50), -- Variable-length string
     height DECIMAL(3,2), -- Numeric with precision/scale
     birth_date DATE, -- Calendar date
     birth_time TIME, -- Calendar date
     powers TEXT, -- Large text field
     is_alive BOOLEAN, -- True/False flag
     created_at TIMESTAMP, -- Date + time
     residence CHAR(100), -- Fixed-length string
     profile_picture BLOB, -- Binary large object (images/files)
     preferences JSON -- Structured JSON data
);

-- Renames the table 'test' to 'subject'
RENAME TABLE test TO subject;

-- Deletes the table 'subject'
DROP TABLE subject;