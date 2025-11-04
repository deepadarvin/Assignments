package language.basics;


 class EmployeeData {

    // Employee data
    String emp1 = "Bharath";
    String emp2 = "ABC";
    String emp3 = "XYZ";

    int id1 = 1234;
    int id2 = 1235;
    int id3 = 1236;
}

public class EmpGroups {

    public static void main(String[] args) {

        EmployeeData e = new EmployeeData();

        // Arrays to store names and IDs
        String[] empname = { e.emp1, e.emp2, e.emp3 };
        int[] empid = { e.id1, e.id2, e.id3 };

        // Loop to print employee details
        for (int i = 0; i < empname.length; i++) {
            System.out.println("Employee Name: " + empname[i] + ", Employee ID: " + empid[i]);
        }
    }
}






