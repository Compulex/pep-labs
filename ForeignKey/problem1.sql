CREATE TABLE Post ( 
    id SERIAL PRIMARY KEY, 
    post varchar(255), 
    user_fk int 
);

/*ALTER TABLE Post ADD FOREIGN KEY(user_fk) REFERENCES User(id);*/