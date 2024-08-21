Project Overview

This console application is designed to ingest a CSV file that you place in the resource/data directory [customer_data_dummy.csv](https://github.com/user-attachments/files/16695256/customer_data_dummy.csv). 
The application reads each record from the CSV and sends it to a REST endpoint, which is part of a separate Spring Boot project. Located at https://github.com/ConnorL344/SpringBoot-Postgres/tree/master.

Getting Started
    Run the Spring Boot Application:
        Before anything else, make sure the Spring Boot application that handles the REST endpoint is up and running.
        Ensure the Database table is correctly added by running the following script: 
        CREATE TABLE public.customers ( 
          customer_ref varchar(255) NOT NULL, 
          customer_name varchar(255) NULL, 
          address_line_1 varchar(255) NULL, 
          address_line_2 varchar(255) NULL, 
          town varchar(255) NULL, 
          county varchar(255) NULL, 
          country varchar(255) NULL,                   
          postcode varchar(50) NULL, 
          CONSTRAINT customers_pk PRIMARY KEY (customer_ref));
    
        An example of how the SprintBoot-Demo project looks when connected: 
  ![image](https://github.com/user-attachments/assets/64b6dd01-1084-4c7a-b476-b060c0895170). 

Additional Info
    An example file is included to help you see how the data gets processed.
    Upon running the file once after a successful ingestion you will need to run the following script in Postgres or there will be a duplicate key error. 
      DELETE FROM customer;
