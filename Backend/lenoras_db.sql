CREATE TABLE manager(
    manage_id SERIAL primary Key,
    username text,
    Password_hash text,
    First_name text,
    Last_name text,
    manager_type text
);

CREATE TABLE Owner(
    username text,
    Password_hash text,
    first_name text,
    Last_name text
);

CREATE TABLE Reservation(
    Costumer_id SERIAL primary Key,
    first_name text,
    Last_name text,
    costumer_number numeric,
    amount_people numeric,
    what_date date,
    what_time time 
);