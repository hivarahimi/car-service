insert into CAR_STATUS (ID, CODE, TEXT)
values (1,100,'AVAILABLE');
insert into CAR_STATUS (ID, CODE, TEXT)
values (2,101,'RENTED');
insert into CAR_STATUS (ID, CODE, TEXT)
values (3,102,'RESERVED');
insert into CAR_STATUS (ID, CODE, TEXT)
values (4,103,'OUT_OF_CLASS');
insert into CAR_STATUS (ID, CODE, TEXT)
values (5,104,'MAINTENANCE');

insert into CAR_TYPE (ID, CATEGORY, MAKE, MODEL, NEED_DRIVER, PRICE)
values (1,'SUV','Ford','Explorer','1','7000');
insert into CAR_TYPE (ID, CATEGORY, MAKE, MODEL, NEED_DRIVER, PRICE)
values (2,'Sedan','Toyota','Camry','1','6000');
insert into CAR_TYPE (ID, CATEGORY, MAKE, MODEL, NEED_DRIVER, PRICE)
values (3,'Sedan','Volkswagen','Beetle','1','3000');
insert into CAR_TYPE (ID, CATEGORY, MAKE, MODEL, NEED_DRIVER, PRICE)
values (4,'Sedan','Honda','Civic','1','5000');
insert into CAR_TYPE (ID, CATEGORY, MAKE, MODEL, NEED_DRIVER, PRICE)
values (5,'Hatchback','Chevrolet','Spark','1','1000');
insert into CAR_TYPE (ID, CATEGORY, MAKE, MODEL, NEED_DRIVER, PRICE)
values (6,'SUV','Ford','electrical','1','79000');
insert into CAR_TYPE (ID, CATEGORY, MAKE, MODEL, NEED_DRIVER, PRICE)
values (7,'Hatchback','Toyota','sport','1','34000');

insert into COLOR (ID, CODE, NAME)
values (1,'#000000','Black');
insert into COLOR (ID, CODE, NAME)
values (2,'#FFFFFF','White');
insert into COLOR (ID, CODE, NAME)
values (3,'#FF0000','Red');
insert into COLOR (ID, CODE, NAME)
values (4,'#C0C0C0','Silver');
insert into COLOR (ID, CODE, NAME)
values (5,'#808080','Gray');

insert into CAR (ID, MILEAGE, PASSENGER_COUNT, PRODUCTION_YEAR, REGISTRATION, VERSION, VIN, COLOR_ID, STATUS_ID,
                 TYPE_ID)
values (1,2000,5,2020,'ABCD 123',0,'5TFDY5F1XEX336353',1,1,6),
       (2,2900,5,2021,'EFGH 456',0,'2HGFC2F59HH565768',2,2,6),
       (3,1000,2,2020,'EAFD 453',0,'1FTEW1E53LFA74105',4,1,6),
       (4,3000,4,2020,'TYRE 7456',0,'4FTEW1E53LFA74105',3,2,6),
       (5,6000,5,2020,'CDFS 53453',0,'6FTEW1E53LFA74105',4,1,6),
       (6,800,5,2020,'RDVX 53',0,'7FTEW1E53LFA74105',5,2,6),
       (7,1000,2,2020,'EAFD 453',0,'1FTEW1E53LFA74105',4,1,7),
       (8,1000,2,2020,'EAFD 453',0,'1FTEW1E53LFA74105',4,1,7);
