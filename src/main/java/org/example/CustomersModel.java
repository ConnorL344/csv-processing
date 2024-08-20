package org.example;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class CustomersModel {
    @CsvBindByName(column = "Customer Ref")
    @CsvBindByPosition(position = 0)
    private String CustomerRef;

    @CsvBindByName(column = "Customer Name")
    @CsvBindByPosition(position = 1)
    private String CustomerName;

    @CsvBindByName(column = "Address Line 1")
    @CsvBindByPosition(position = 2)
    private String AddressLine1;

    @CsvBindByName(column = "Address Line 2")
    @CsvBindByPosition(position = 3)
    private String AddressLine2;

    @CsvBindByName(column = "Town")
    @CsvBindByPosition(position = 4)
    private String Town;

    @CsvBindByName(column = "County")
    @CsvBindByPosition(position = 5)
    private String County;

    @CsvBindByName(column = "Country")
    @CsvBindByPosition(position = 6)
    private String Country;

    @CsvBindByName(column = "Postcode")
    @CsvBindByPosition(position = 7)
    private String Postcode;

    public String getCustomerRef() {
        return CustomerRef;
    }

    public void setCustomerRef(String customerRef) {
        CustomerRef = customerRef;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        Postcode = postcode;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        AddressLine1 = addressLine1;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String town) {
        Town = town;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        AddressLine2 = addressLine2;
    }
}
