package com.customermanagement.OCP.OCPBad;

public class CustomerOCPBad {
    private String name;
    private String email;
    private String mobileNo;
    private String address;

    public CustomerOCPBad(String name, String email, String mobileNo, String address) {
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void display(String format) {
        if (format.equals("console")) {
            System.out.println("Name: " + name + " Email : " + email);
        } else if (format.equals("csv")) {
            System.out.println("Print details in CSV format");
            System.out.println(name + "," + email);
        } else if (format.equals("xml")) {
            System.out.println("<student><name>" + name + "</name><email>" + email + "</email>");
        }
    }
    // The display method has the responsibility of displaying customer data in different format, i.e. console, CSV & XML.
    // This violates the OCP as the 'CustomerOCPBad' class is not closed for modification.
    // If we want to add support for displaying student data in a new format, we would have to modify the 'CustomerOCPBad' class when is not desirable.
}
