-- CREATE DATABASE databaseManagement;
/* =============================================
   Transport Company Lab
   Contains: DDL + Sample Data (38 rows)
   ============================================= */

-- === Clean slate (drop in FK-safe order) ===
DROP TABLE IF EXISTS TransportDriver;
DROP TABLE IF EXISTS ServiceHistory;
DROP TABLE IF EXISTS Transport;
DROP TABLE IF EXISTS Driver;
DROP TABLE IF EXISTS Vehicle;
DROP TABLE IF EXISTS Service;
DROP TABLE IF EXISTS Quote;
DROP TABLE IF EXISTS Customer;

-- === Create tables ===
CREATE TABLE Customer (
    CustomerNo      VARCHAR(20)  PRIMARY KEY,
    Name            VARCHAR(120) NOT NULL,
    Address         VARCHAR(200),
    Phone           VARCHAR(30),
    NumTransports   INTEGER DEFAULT 0 CHECK (NumTransports >= 0)
);

CREATE TABLE Quote (
   QuoteNo         VARCHAR(20)  PRIMARY KEY,
   QuoteDate       DATE         NOT NULL,
   Descr           VARCHAR(300),
   Price           NUMERIC(12,2) CHECK (Price >= 0),
   CustomerNo      VARCHAR(20)  NOT NULL,
   FOREIGN KEY (CustomerNo)
       REFERENCES Customer(CustomerNo)
       ON UPDATE CASCADE
       ON DELETE RESTRICT
);

CREATE TABLE Service (
     ServiceNo       VARCHAR(20)  PRIMARY KEY,
     OrderDate       DATE         NOT NULL,
     Descr           VARCHAR(300),
     Price           NUMERIC(12,2) CHECK (Price >= 0),
     FromAddress     VARCHAR(200) NOT NULL,
     ToAddress       VARCHAR(200) NOT NULL,
     TransportDate   DATE,
     Distance        NUMERIC(10,2) CHECK (Distance IS NULL OR Distance >= 0),
     CustomerNo      VARCHAR(20)  NOT NULL,
     QuoteNo         VARCHAR(20),
     CONSTRAINT fk_service_customer
         FOREIGN KEY (CustomerNo)
             REFERENCES Customer(CustomerNo)
             ON UPDATE CASCADE
             ON DELETE RESTRICT,
     CONSTRAINT fk_service_quote
         FOREIGN KEY (QuoteNo)
             REFERENCES Quote(QuoteNo)
             ON UPDATE CASCADE
             ON DELETE SET NULL
);

CREATE TABLE Vehicle (
     RegNo           VARCHAR(20)  PRIMARY KEY,
     Description     VARCHAR(200),
     PurchaseCost    NUMERIC(12,2) CHECK (PurchaseCost IS NULL OR PurchaseCost >= 0),
     PurchaseDate    DATE
);

CREATE TABLE Driver (
    IDNo            VARCHAR(20)  PRIMARY KEY,
    Name            VARCHAR(120) NOT NULL,
    Address         VARCHAR(200),
    PhoneNo         VARCHAR(30),
    CellNo          VARCHAR(30)
);

CREATE TABLE Transport (
   TransportNo     VARCHAR(20)  PRIMARY KEY,
   Date            DATE         NOT NULL,
   Description     VARCHAR(300),
   Cost            NUMERIC(12,2) CHECK (Cost IS NULL OR Cost >= 0),
   RegNo           VARCHAR(20)  NOT NULL,
   ServiceNo       VARCHAR(20)  NOT NULL,
   CONSTRAINT fk_transport_vehicle
       FOREIGN KEY (RegNo)
           REFERENCES Vehicle(RegNo)
           ON UPDATE CASCADE
           ON DELETE RESTRICT,
   CONSTRAINT fk_transport_service
       FOREIGN KEY (ServiceNo)
           REFERENCES Service(ServiceNo)
           ON UPDATE CASCADE
           ON DELETE RESTRICT
);

CREATE TABLE TransportDriver (
     TransportNo     VARCHAR(20)  NOT NULL,
     IDNo            VARCHAR(20)  NOT NULL,
     PRIMARY KEY (TransportNo, IDNo),
     FOREIGN KEY (TransportNo)
         REFERENCES Transport(TransportNo)
         ON UPDATE CASCADE
         ON DELETE CASCADE,
     FOREIGN KEY (IDNo)
         REFERENCES Driver(IDNo)
         ON UPDATE CASCADE
     ON DELETE RESTRICT
);

CREATE TABLE ServiceHistory (
    ServiceNo       VARCHAR(20)  PRIMARY KEY,
    Mileage         INTEGER CHECK (Mileage IS NULL OR Mileage >= 0),
    ServiceDate     DATE NOT NULL,
    ServiceCost     NUMERIC(12,2) CHECK (ServiceCost IS NULL OR ServiceCost >= 0),
    RegNo           VARCHAR(20)  NOT NULL,
    CONSTRAINT fk_servicehistory_vehicle
        FOREIGN KEY (RegNo)
            REFERENCES Vehicle(RegNo)
            ON UPDATE CASCADE
            ON DELETE RESTRICT
);

-- Helpful indexes
CREATE INDEX idx_quote_customer           ON Quote(CustomerNo);
CREATE INDEX idx_service_customer         ON Service(CustomerNo);
CREATE INDEX idx_service_quote            ON Service(QuoteNo);
CREATE INDEX idx_transport_service        ON Transport(ServiceNo);
CREATE INDEX idx_transport_vehicle        ON Transport(RegNo);
CREATE INDEX idx_servicehistory_vehicle   ON ServiceHistory(RegNo);
CREATE INDEX idx_td_driver                ON TransportDriver(IDNo);

-- Customers (5)
INSERT INTO Customer (CustomerNo, Name, Address, Phone, NumTransports)
VALUES ('CUST-001', 'Acme Manufacturing, Inc.', 'Dasmariñas, Cavite', '+63-46-123-4567', 3),
       ('CUST-002', 'GreenGrocer Foods',        'Bacoor, Cavite',     '+63-2-888-1122',  1),
       ('CUST-003', 'Sunrise Construction',     'Carmona, Cavite',    '+63-46-555-6677', 2),
       ('CUST-004', 'TechWorks PH',             'Santa Rosa, Laguna', '+63-49-700-7788', 1),
       ('CUST-005', 'Metro Logistics',          'Taguig City',        '+63-2-700-9911',  0);

-- Quotes (6)
INSERT INTO Quote (QuoteNo, QuoteDate, Descr, Price, CustomerNo)
VALUES ('Q-1001', '2026-02-15', '40 pallets steel bars: Dasmariñas → Taguig', 42000, 'CUST-001'),
       ('Q-1002', '2026-02-20', 'Produce (reefer): Silang → QC',              18000, 'CUST-002'),
       ('Q-1003', '2026-02-28', 'Excavator move: Carmona → Batangas Port',    60000, 'CUST-003'),
       ('Q-1004', '2026-03-02', 'IT racks: Santa Rosa → Taguig',              23000, 'CUST-004'),
       ('Q-1005', '2026-03-02', 'Finished goods: Taguig → Dasmariñas',        15000, 'CUST-005'),
       ('Q-1006', '2026-03-04', 'Equipment crates: Dasmariñas → Biñan',       12000, 'CUST-001');

-- Services (6)
INSERT INTO Service (ServiceNo, OrderDate, Descr, Price, FromAddress, ToAddress, TransportDate, Distance, CustomerNo, QuoteNo)
VALUES ('SVC-2001', '2026-02-17', 'Deliver steel bars (2 trips)', 42000, 'Dasmariñas', 'FTI, Taguig', '2026-02-18', 52.5, 'CUST-001', 'Q-1001'),
       ('SVC-2002', '2026-02-22', 'Reefer delivery of mixed produce', 18000, 'Silang Public Market', 'Commonwealth, QC', '2026-02-23', 65.0, 'CUST-002', 'Q-1002'),
       ('SVC-2003', '2026-03-01', 'Heavy equipment move (low-bed trailer)', 60000, 'Carmona Industrial Park', 'Batangas Port', '2026-03-03', 98.0, 'CUST-003', 'Q-1003'),
       ('SVC-2004', '2026-03-05', 'Rush delivery of machine parts', 12000, 'Dasmariñas', 'Santa Rosa Tech Park', '2026-03-06', 24.0, 'CUST-001', 'Q-1006'),
       ('SVC-2005', '2026-03-06', 'IT racks on pallet', 23000, 'Santa Rosa', 'BGC, Taguig', '2026-03-07', 39.0, 'CUST-004', 'Q-1004'),
       ('SVC-2006', '2026-03-06', 'Backhaul finished goods', 15000, 'BGC, Taguig', 'Dasmariñas', '2026-03-07', 39.5, 'CUST-005', 'Q-1005');

-- Vehicles (5)
INSERT INTO Vehicle (RegNo, Description, PurchaseCost, PurchaseDate)
VALUES ('CVT-3140', '10-wheeler flatbed', 3200000, '2022-08-10'),
       ('CVT-9021', 'Reefer truck 6W', 2800000, '2023-05-20'),
       ('CVT-7712', 'Prime mover + low-bed trailer', 6500000, '2021-11-08'),
       ('CVT-5525', 'Aluminum van 6W', 2550000, '2022-03-18'),
       ('CVT-4433', 'Drop-side 4W', 1800000, '2021-06-01');

-- Drivers (6)
INSERT INTO Driver (IDNo, Name, Address, PhoneNo, CellNo)
VALUES ('DRV-001', 'R. Santos',      'Dasmariñas, Cavite', '+63-46-700-1111', '+63-917-100-0001'),
       ('DRV-002', 'M. Dela Cruz',   'Bacoor, Cavite',     '+63-46-700-2222', '+63-917-100-0002'),
       ('DRV-003', 'J. Navarro',     'Carmona, Cavite',    '+63-46-700-3333', '+63-917-100-0003'),
       ('DRV-004', 'K. Villanueva',  'Silang, Cavite',     '+63-46-700-4444', '+63-917-100-0004'),
       ('DRV-005', 'P. Ramos',       'Santa Rosa, Laguna', '+63-49-700-5555', '+63-917-100-0005'),
       ('DRV-006', 'L. Gomez',       'Taguig City',        '+63-2-700-6666',  '+63-917-100-0006');

-- Transports (8)
INSERT INTO Transport (TransportNo, Date, Description, Cost, RegNo, ServiceNo)
VALUES ('TRN-5001', '2026-02-18', 'Trip 1: steel bars',         18000, 'CVT-3140', 'SVC-2001'),
       ('TRN-5002', '2026-02-18', 'Trip 2: steel bars',         18000, 'CVT-3140', 'SVC-2001'),
       ('TRN-5003', '2026-02-23', 'Reefer produce delivery',    12000, 'CVT-9021', 'SVC-2002'),
       ('TRN-5004', '2026-03-03', 'Low-bed: excavator move',    35000, 'CVT-7712', 'SVC-2003'),
       ('TRN-5005', '2026-03-06', 'Rush machine parts',          8000, 'CVT-5525', 'SVC-2004'),
       ('TRN-5006', '2026-03-07', 'IT racks to BGC',            15000, 'CVT-5525', 'SVC-2005'),
       ('TRN-5007', '2026-03-07', 'Backhaul finished goods',    10000, 'CVT-4433', 'SVC-2006'),
       ('TRN-5008', '2026-03-07', 'Extra run for IT racks',      9000, 'CVT-4433', 'SVC-2005');

-- TransportDriver (12)
INSERT INTO TransportDriver (TransportNo, IDNo)
VALUES ('TRN-5001','DRV-001'),
       ('TRN-5002','DRV-001'),
       ('TRN-5003','DRV-004'),
       ('TRN-5004','DRV-002'),
       ('TRN-5004','DRV-003'),
       ('TRN-5005','DRV-005'),
       ('TRN-5006','DRV-005'),
       ('TRN-5006','DRV-006'),
       ('TRN-5007','DRV-006'),
       ('TRN-5007','DRV-001'),
       ('TRN-5008','DRV-005'),
       ('TRN-5008','DRV-006');

-- ServiceHistory (6)
INSERT INTO ServiceHistory (ServiceNo, Mileage, ServiceDate, ServiceCost, RegNo)
VALUES ('VH-SVC-001', 125000, '2025-12-10', 18500, 'CVT-3140'),
       ('VH-SVC-002',  82000, '2026-01-12', 22000, 'CVT-9021'),
       ('VH-SVC-003', 210000, '2026-02-05', 36500, 'CVT-7712'),
       ('VH-SVC-004',  95000, '2026-03-01', 15000, 'CVT-5525'),
       ('VH-SVC-005', 140000, '2026-02-20', 12000, 'CVT-3140'),
       ('VH-SVC-006',  60000, '2026-02-27',  9000, 'CVT-4433');