Project Overview

This console application processes a CSV file located in the resource/data directory. The application reads each record from the CSV and sends it to a REST endpoint, which is part of a separate Spring Boot project. You can find the Spring Boot project here.
Getting Started

    Run the Spring Boot Application:
        Before starting, make sure the Spring Boot application that handles the REST endpoint is up and running.

    Set Up the Database:

        Ensure that the required database table is set up by running the following script in your PostgreSQL database:

        sql

        CREATE TABLE public.customers ( 
          customer_ref varchar(255) NOT NULL, 
          customer_name varchar(255) NULL, 
          address_line_1 varchar(255) NULL, 
          address_line_2 varchar(255) NULL, 
          town varchar(255) NULL, 
          county varchar(255) NULL, 
          country varchar(255) NULL,                   
          postcode varchar(50) NULL, 
          CONSTRAINT customers_pk PRIMARY KEY (customer_ref)
        );

    Connect the Spring Boot Application:

        Once connected, the Spring Boot application should look something like this:
![image](https://github.com/user-attachments/assets/64d5961c-427e-4011-a779-9bab7411fbdc)

Additional Info

    A sample file is included to help you understand how the data is processed.

    After running the application and successfully ingesting the data, you must run the following script in PostgreSQL to avoid a duplicate key error on subsequent runs:

    sql

DELETE FROM customer;
