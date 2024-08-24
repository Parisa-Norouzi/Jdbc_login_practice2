CREATE TABLE if not exists users (
                          User_id serial primary key ,
                          First_Name varchar(255),
                          Last_Name varchar(255),
                          UserName varchar (255),
                          Password varchar (50)
);