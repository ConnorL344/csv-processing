package org.example;

import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = System.getProperty("user.dir") + "\\src\\main\\resources\\data\\customer_data_dummy.csv";

        List<CustomersModel> customers = new CsvToBeanBuilder(new FileReader(fileName))
                .withType(CustomersModel.class)
                .withSkipLines(1)
                .build()
                .parse();

        for (CustomersModel customer : customers) {
            InsertNewCustomer(customer);
        }
    }

    public static void InsertNewCustomer(CustomersModel customer) throws Exception {
        try {
            URL apiUrl = new URL("http://localhost:8080/AddCustomer");

            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            // Convert the customer object to JSON
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonInputString = objectMapper.writeValueAsString(customer);

            // Write the JSON input string to the output stream
            try (OutputStream os = connection.getOutputStream()) {
                os.write(jsonInputString.getBytes("utf-8"));
            }

            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
