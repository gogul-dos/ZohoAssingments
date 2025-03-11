public class Flight{
    static int availableSeats = 20;
    String flightName;
    String destination;
    String startingPoint;
    int travelTimeInHours;
    boolean isFull;

    public Flight(String flightName, String destination, String startingPoint, int travelTimeInHours, boolean isFull) {
        this.flightName = flightName;
        this.destination = destination;
        this.startingPoint = startingPoint;
        this.travelTimeInHours = travelTimeInHours;
        this.isFull = isFull;
    }
    public static int getAvailableSeats() {
        return availableSeats;
    }
    public static void setAvailableSeats(int availableSeats) {
        Flight.availableSeats = availableSeats;
    }
    public String getFlightName() {
        return flightName;
    }
    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getStartingPoint() {
        return startingPoint;
    }
    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }
    public int getTravelTimeInHours() {
        return travelTimeInHours;
    }
    public void setTravelTimeInHours(int travelTimeInHours) {
        this.travelTimeInHours = travelTimeInHours;
    }
    public boolean isFull() {
        return isFull;
    }
    public void setFull(boolean isFull) {
        this.isFull = isFull;
    }
    public void bookSeat(int seatCount) {
        if(this.isFull || seatCount>availableSeats){
            System.out.println("The seat count is unavailable");
        }
        else{
            System.out.println("The seats were booked!");
            availableSeats-=seatCount;
        }
    }

    public void cancelSeat(int seatCount) {
        if(availableSeats+seatCount>20){
            System.out.println("No seats were booked earlier!!");
        }
        else{
            System.out.println("The seats were Cancelled!");
            availableSeats+=seatCount;
        }
    }
}