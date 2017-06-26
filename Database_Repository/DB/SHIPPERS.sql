drop table shippers;
CREATE TABLE shippers (
ShipperID NUMBER(10,0) NOT NULL,
ShipperName VARCHAR2(50 BYTE),
Phone NUMBER(10,0));
insert into shippers ( ShipperID, ShipperName, Phone ) VALUES ( 1, 'Speedy Express ', 5035559831 );
insert into shippers ( ShipperID, ShipperName, Phone ) VALUES ( 2, 'United Package ', 5035553199 );
insert into shippers ( ShipperID, ShipperName, Phone ) VALUES ( 3, 'Federal Shipping ', 5035559931 );
