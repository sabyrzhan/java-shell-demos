create table if not exists users
(
    id          int auto_increment primary key,
    name        varchar(255) not null,
    surname     varchar(255) not null
);