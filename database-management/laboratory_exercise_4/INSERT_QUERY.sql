INSERT INTO Customer (CustomerNo, Name, Address, Phone, NumTransports)
VALUES ('CUST-006', 'NoQuote Logistics', 'Makati City', '+63-2-999-8888', 0);

INSERT INTO Quote (QuoteNo, QuoteDate, Descr, Price, CustomerNo)
VALUES ('Q-1007', '2026-04-01', 'Unconfirmed shipment: Cavite → Laguna', 25000, 'CUST-006');

INSERT INTO Service (ServiceNo, OrderDate, Descr, Price, FromAddress, ToAddress, TransportDate, Distance, CustomerNo, QuoteNo)
VALUES ('SVC-2007', '2026-04-05', 'Pending delivery of office supplies', 8000, 'Makati', 'Pasig', NULL, NULL, 'CUST-006', 'Q-1007');

INSERT INTO Vehicle (RegNo, Description, PurchaseCost, PurchaseDate)
VALUES ('CVT-9999', 'Brand new test truck', 3000000, '2026-04-10');

INSERT INTO Driver (IDNo, Name, Address, PhoneNo, CellNo)
VALUES ('DRV-007', 'A. Cruz', 'Makati City', '+63-2-700-7777', '+63-917-100-0007');

INSERT INTO ServiceHistory (ServiceNo, Mileage, ServiceDate, ServiceCost, RegNo)
VALUES ('VH-SVC-007', NULL, '2026-04-15', 10000, 'CVT-9999');
