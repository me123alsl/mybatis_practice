create table teams
(
    id   bigint auto_increment
        primary key,
    name varchar(255) null
);

create table users
(
    id      bigint auto_increment
        primary key,
    team_id bigint       not null,
    name    varchar(255) null,
    email   varchar(255) null,
    country varchar(255) null,
    city    varchar(255) null,
    street  varchar(255) null,
    zipcode varchar(255) null,
    constraint fk_user_team foreign key (team_id) references teams (id)
);

