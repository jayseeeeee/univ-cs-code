-- Transactions are not saved automatically
SET AUTOCOMMIT = OFF;

-- Create a checkpoint to current changes
COMMIT;

-- Rollback to the changes made in the commit checkpoint
ROLLBACK;