package com.dmdev.hw13;

import java.time.LocalDateTime;

public class Complaint {
    private final int id;
    private final LocalDateTime dateTime;
    private final String fullName;
    private final String phoneNumber;
    private final String complaintText;

    public Complaint(int id, LocalDateTime dateTime, String fullName, String phoneNumber, String complaintText) {
        this.id = id;
        this.dateTime = dateTime;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.complaintText = complaintText;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", complaintText='" + complaintText + '\'' +
                '}';
    }
}
