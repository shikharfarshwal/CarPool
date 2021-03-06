package com.globalLogic.carRide.dto;


public class DriverDto {
    private String firstName;

    private String lastName;

    private String dlNo;

    private String vehicleType;

    private String registrationNo;

    public DriverDto() {
    }

    public DriverDto(String firstName, String lastName, String dlNo, String vehicleType, String registrationNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dlNo = dlNo;
        this.vehicleType = vehicleType;
        this.registrationNo = registrationNo;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDlNo() {
        return dlNo;
    }

    public void setDlNo(String dlNo) {
        this.dlNo = dlNo;
    }

    @Override
    public String toString() {
        return "DriverDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dlNo='" + dlNo + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", registrationNo='" + registrationNo + '\'' +
                '}';
    }
}
