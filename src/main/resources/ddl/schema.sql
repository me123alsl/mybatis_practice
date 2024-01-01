create table  users
(
    id      bigint auto_increment
        primary key,
    name   varchar(255) null,
    email   varchar(255) null,
    country varchar(255) null,
    city   varchar(255) null,
    street  varchar(255) null,
    zipcode varchar(255) null
);