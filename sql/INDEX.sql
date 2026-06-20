-- Indexes are used to find values within a specific column more quickly
-- UPDATE will be slower but SELECT becomes faster

-- Show all indexes from the table 'party'
SHOW INDEXES FROM party;

-- Create an index for 'subject_number' column for faster search
CREATE INDEX subject_number ON party(subject_number);

-- Multi index for multiple columns
CREATE INDEX multi_idx ON party(party_id, subject_number, name); -- Sequence is important

-- Delete an index
ALTER TABLE party DROP INDEX multi_idx;