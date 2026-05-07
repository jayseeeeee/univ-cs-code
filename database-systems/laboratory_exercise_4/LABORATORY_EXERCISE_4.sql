-- RIGHT JOIN
-- Show all customers and the services they have booked, including customers with no services.
SELECT c.CustomerNo, c.Name, s.ServiceNo, s.Descr, s.Price
FROM Service AS s
RIGHT JOIN Customer AS c
ON s.CustomerNo = c.CustomerNo;

-- Show all vehicles and the transport trips they were used for, including vehicles that were never used.
SELECT v.RegNo, v.Description, t.ServiceNo, t.Description
FROM Transport AS t
RIGHT JOIN Vehicle AS v
ON t.RegNo = v.RegNo;

-- 1. Show all customers and their quotes, including customers with no quotes.
SELECT c.CustomerNo, c.Name, q.QuoteNo, q.Price
FROM Quote AS q
RIGHT JOIN Customer AS c
ON q.CustomerNo = c.CustomerNo;

-- 2. Show all customers and the transports linked to their services, including customers with no transport.
SELECT c.CustomerNo, c.Name, t.TransportNo, t.Date
FROM Transport AS t
RIGHT JOIN Service AS s
ON t.ServiceNo = s.ServiceNo
RIGHT JOIN Customer AS c
ON s.CustomerNo = c.CustomerNo;

-- 3. Show all drivers and the transports they handled, including drivers with no assignments.
SELECT d.IDNo, d.Name, td.TransportNo
FROM TransportDriver AS td
RIGHT JOIN Driver AS d
ON td.IDNo = d.IDNo;

-- 4. Show all vehicles and the transports they were used for, including vehicles with no transport.
SELECT v.RegNo, v.Description, t.TransportNo, t.Date
FROM Transport AS t
RIGHT JOIN Vehicle AS v
ON t.RegNo = v.RegNo;

-- 5. Show all vehicles and their service history, including vehicles with no service records.
SELECT v.RegNo, v.Description, sh.ServiceDate, sh.ServiceCost
FROM ServiceHistory AS sh
RIGHT JOIN Vehicle AS v
ON sh.RegNo = v.RegNo;

-- 6. Show all quotes and the services linked to them, including quotes not yet converted to services.
SELECT q.QuoteNo, q.Descr, s.ServiceNo
FROM Service AS s
RIGHT JOIN Quote AS q
ON s.QuoteNo = q.QuoteNo;

-- 7. Show all customers and the number of transports they had, including customers with none.
SELECT c.CustomerNo, c.Name, COUNT(t.TransportNo) AS NumTransports
FROM Transport AS t
RIGHT JOIN Service AS s ON t.ServiceNo = s.ServiceNo
RIGHT JOIN Customer AS c ON s.CustomerNo = c.CustomerNo
GROUP BY c.CustomerNo, c.Name;

-- 8. Show all drivers and the number of transports they handled, including drivers with none.
SELECT d.IDNo, d.Name, COUNT(td.TransportNo) AS NumTransports
FROM TransportDriver AS td
RIGHT JOIN Driver AS d
ON td.IDNo = d.IDNo
GROUP BY d.IDNo, d.Name
ORDER BY NumTransports DESC;

-- 9. Show all customers, their quotes, and related services, including customers without quotes or services.
SELECT c.CustomerNo, c.Name, q.QuoteNo, s.ServiceNo
FROM Service AS s
RIGHT JOIN Quote AS q ON s.QuoteNo = q.QuoteNo
RIGHT JOIN Customer AS c ON q.CustomerNo = c.CustomerNo;

-- 10. Show all customers and the average price of their booked services, including customers with no services.
SELECT c.CustomerNo, c.Name, AVG(s.Price) AS AvgServicePrice
FROM Service AS s
RIGHT JOIN Customer AS c
ON s.CustomerNo = c.CustomerNo
GROUP BY c.CustomerNo, c.Name;

-- FULL JOIN
-- Show all customers and all services, including customers without services and services without customers.
SELECT c.Name, s.ServiceNo, s.Descr
FROM Customer AS c
FULL JOIN Service AS s
ON c.customerno = s.customerno;

-- Show all vehicles and all transport trips, including unused vehicles and transports with missing vehicle records.
SELECT v.RegNo, v.Description, t.TransportNo, t.Date
FROM Vehicle AS v
FULL JOIN Transport AS t
ON v.RegNo = t.RegNo;

-- 1. Show all customers and all quotes, including customers without quotes and quotes without customers.
SELECT c.CustomerNo, c.Name, q.QuoteNo, q.Price
FROM Customer AS c
FULL JOIN Quote AS q
ON c.CustomerNo = q.CustomerNo;

-- 2. Show all quotes and all services, including quotes not linked to services and services without quotes.
SELECT q.QuoteNo, q.Descr, s.ServiceNo, s.Descr
FROM Quote AS q
FULL JOIN Service AS s
ON q.QuoteNo = s.QuoteNo;

-- 3. Show all services and all transports, including services without transports and transports without services.
SELECT s.ServiceNo, s.Descr, t.TransportNo, t.Date
FROM Service AS s
FULL JOIN Transport AS t
ON s.ServiceNo = t.ServiceNo;

-- 4. Show all vehicles and all service history records, including vehicles without service history and service history without vehicles.
SELECT v.RegNo, v.Description, sh.ServiceNo, sh.ServiceDate
FROM Vehicle AS v
FULL JOIN ServiceHistory AS sh
ON v.RegNo = sh.RegNo;

-- 5. Show all drivers and all transports, including drivers without transports and transports without drivers.
SELECT d.IDNo, d.Name, td.TransportNo
FROM Driver AS d
FULL JOIN TransportDriver AS td
ON d.IDNo = td.IDNo;

-- 6. Show all customers and all transports, including customers without transports and transports without customers.
SELECT c.CustomerNo, c.Name, t.TransportNo, t.Date
FROM Customer AS c
FULL JOIN Service AS s ON c.CustomerNo = s.CustomerNo
FULL JOIN Transport AS t ON s.ServiceNo = t.ServiceNo;

-- 7. Show all drivers and all vehicles, including drivers without vehicles and vehicles without drivers.
SELECT d.IDNo, d.Name, v.RegNo, v.Description
FROM Driver AS d
FULL JOIN TransportDriver AS td ON d.IDNo = td.IDNo
FULL JOIN Transport AS t ON td.TransportNo = t.TransportNo
FULL JOIN Vehicle AS v ON t.RegNo = v.RegNo;

-- 8. Show all customers, quotes, and services, including customers without quotes/services and quotes/services without customers.
SELECT c.CustomerNo, c.Name, q.QuoteNo, s.ServiceNo
FROM Customer AS c
FULL JOIN Quote AS q ON c.CustomerNo = q.CustomerNo
FULL JOIN Service AS s ON q.QuoteNo = s.QuoteNo;

-- 9. Show all customers and all quotes made in March 2026, including customers without quotes and quotes without customers.
SELECT c.CustomerNo, c.Name, q.QuoteNo, q.QuoteDate
FROM Customer AS c
FULL JOIN Quote AS q
ON c.CustomerNo = q.CustomerNo
WHERE q.QuoteDate BETWEEN '2026-03-01' AND '2026-03-31' OR q.QuoteNo IS NULL;

-- 10. Show all vehicles and their total mileage from service history, including vehicles without service history and service history without vehicles.
SELECT v.RegNo, v.Description, SUM(sh.Mileage) AS TotalMileage
FROM Vehicle AS v
FULL JOIN ServiceHistory AS sh
ON v.RegNo = sh.RegNo
GROUP BY v.RegNo, v.Description;