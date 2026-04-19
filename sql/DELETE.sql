-- Deletes all row from table 'subject'
DELETE FROM subject;

-- Deletes all entries that match the specified condition(s)
DELETE FROM subject
WHERE is_alive = FALSE OR is_alive IS NULL;