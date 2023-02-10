CREATE TABLE Post ( 
    id SERIAL PRIMARY KEY, 
    post varchar(255), 
    user_fk int REFERENCES User(id)
);

/*ALTER TABLE Post ADD FOREIGN KEY(user_fk) ;*/