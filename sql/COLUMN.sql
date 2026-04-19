-- Add a new column 'quotation' in the table 'subject'
ALTER TABLE subject ADD quotation TEXT;

-- Rename the column 'quotation' to 'catchphrase' instead
ALTER TABLE subject RENAME COLUMN quotation TO catchphrase;

-- Change the column 'catchphrase' datatype from 'text' to 'varchar' with 500 max characters instead
ALTER TABLE subject MODIFY catchphrase VARCHAR(500);

-- Change the column datatype and sequence
-- The 'subject_number' column should come after the 'last_name' column
ALTER TABLE subject MODIFY subject_number INT AFTER last_name;
-- The 'subject_number' column is placed first before all column
ALTER TABLE subject MODIFY subject_number INT FIRST;

-- Deletes the column 'created_at' from the table 'subject'
ALTER TABLE subject DROP created_at;