create table post (
    id serial primary key,
    post varchar(255),
    user_fk int references user(id)
);