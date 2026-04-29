CREATE TABLE date_time (
    my_date DATE,
    my_time TIME,
    my_datetime DATETIME
);

INSERT INTO date_time
VALUES (CURRENT_DATE(), CURRENT_TIME, NOW()),
       (CURRENT_DATE() + 1, CURRENT_TIME - 1, NOW());

INSERT INTO date_time
VALUES ('1990-1-31', '23:59:59', '1990-1-31 23:59:59')