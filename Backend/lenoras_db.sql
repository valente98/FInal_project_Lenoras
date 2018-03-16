CREATE TABLE manager(
    manage_id SERIAL Primary Key,
    username text,
    Password_hash text,
    First_name text,
    Last_name text,
)

CREATE TABLE Owner(
    Owner_Id Primary key,
    username text,
    Password_hash text,
    first_name text,
    Last_name text,
)

CREATE TABLE Reservation(
    Costumer_id SERIAL Primary Key,
    first_name text,
    Last_name
    costumer_number numeric,
    amount_people numeric,
    what_date date,
    what_time time, 
)