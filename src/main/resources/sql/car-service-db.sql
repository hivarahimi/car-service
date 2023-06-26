create table CAR
(
    ID              BIGINT not null
        primary key,
    MILEAGE         INTEGER,
    PASSENGER_COUNT INTEGER,
    PRODUCTION_YEAR VARCHAR(255),
    REGISTRATION    VARCHAR(50),
    VERSION         INTEGER,
    VIN             VARCHAR(50),
    COLOR_ID        BIGINT
        constraint FKG0JVJCWNTCLCJD9CD2VMTA820
            references COLOR,
    STATUS_ID       BIGINT
        constraint FKNK07L1WWKQVDAPOAKGO8VO5QQ
            references CAR_STATUS,
    TYPE_ID         BIGINT
        constraint FK3YY0U5XKEVPIG6G0IUA829NQ4
            references CAR_TYPE
);
create table CAR_STATUS
(
    ID   BIGINT not null
        primary key,
    CODE INTEGER,
    TEXT VARCHAR(30)
);
create table CAR_TYPE
(
    ID          BIGINT not null
        primary key,
    CATEGORY    VARCHAR(50),
    MAKE        VARCHAR(50),
    MODEL       VARCHAR(50),
    NEED_DRIVER SMALLINT,
    PRICE       VARCHAR(255)
);
create table COLOR
(
    ID   BIGINT not null
        primary key,
    CODE VARCHAR(30),
    NAME VARCHAR(30)
);





