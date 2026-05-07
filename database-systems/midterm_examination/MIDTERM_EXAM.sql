DROP TABLE IF EXISTS Payment;
DROP TABLE IF EXISTS RestaurantOrder;
DROP TABLE IF EXISTS Reservation;
DROP TABLE IF EXISTS RestaurantTable;
DROP TABLE IF EXISTS Customer;

CREATE TABLE Customer (
    CustomerId INT PRIMARY KEY AUTO_INCREMENT,
    CustomerName VARCHAR(99) NOT NULL,
    PhoneNumber INTEGER (20),
    EmailAddress VARCHAR(50) NOT NULL
);

CREATE TABLE RestaurantTable (
    TableNumber INTEGER PRIMARY KEY,
    SeatingCapacity INTEGER NOT NULL,
    Status VARCHAR(30) NOT NULL CHECK (Status IN ('Available', 'Occupied'))
);

CREATE TABLE Reservation (
    ReservationId INTEGER PRIMARY KEY AUTO_INCREMENT,
    ReservationDate DATE NOT NULL,
    ReservationTime TIME NOT NULL,
    NumberOfGuest INTEGER NOT NULL CHECK (NumberOfGuest > 0),
    CustomerId INTEGER NOT NULL,
    TableNumber INTEGER NOT NULL,
    CONSTRAINT reservation_customer
     FOREIGN KEY (CustomerId)
         REFERENCES Customer(CustomerId)
         ON UPDATE CASCADE
         ON DELETE RESTRICT,
    CONSTRAINT reservation_table
     FOREIGN KEY (TableNumber)
         REFERENCES RestaurantTable(TableNumber)
         ON UPDATE CASCADE
         ON DELETE RESTRICT
    );

    CREATE TABLE RestaurantOrder (
     OrderId INTEGER PRIMARY KEY AUTO_INCREMENT,
     OrderDate DATE NOT NULL,
     Amount NUMERIC(10,2) NOT NULL CHECK (Amount >= 0),
     ReservationId INTEGER NOT NULL,
     CONSTRAINT order_reservation
         FOREIGN KEY (ReservationId)
             REFERENCES Reservation(ReservationId)
             ON UPDATE CASCADE
             ON DELETE RESTRICT
);

CREATE TABLE Payment (
     PaymentId INTEGER PRIMARY KEY AUTO_INCREMENT,
     OrderId INTEGER NOT NULL,
     PaymentDate DATE NOT NULL,
     PaymentMethod VARCHAR(99) NOT NULL,
     PaymentStatus VARCHAR(50) NOT NULL CHECK (PaymentStatus IN ('Paid', 'Pending')),
     CONSTRAINT payment_order
         FOREIGN KEY (OrderId)
             REFERENCES RestaurantOrder(OrderId)
             ON UPDATE CASCADE
             ON DELETE RESTRICT
);
