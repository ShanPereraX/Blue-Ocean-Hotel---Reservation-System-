package model;

public class BookingLists {
    private String bookingID;
    private String roomNo;
    private String checkInDate;
    private String checkOutDate;
    private String paymentStatus;

    public BookingLists(String bookingID, String roomNo, String checkInDate, String checkOutDate, String paymentStatus) {
        this.bookingID = bookingID;
        this.roomNo = roomNo;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.paymentStatus = paymentStatus;
    }

    public String getBookingID() {
        return this.bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getRoomNo() {
        return this.roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getCheckInDate() {
        return this.checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return this.checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
