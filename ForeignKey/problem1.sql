create table Post (
    id serial primary key,
    post varchar(255),
    user_fk int
);