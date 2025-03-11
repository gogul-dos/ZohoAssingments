public class Main {
    public static void main(String[] args) {
        // Employee emp = new Employee(1, "Gogul", "Mechanical", 25000, "gogul@gmail.com");
        // System.out.println("The Department is: "+emp.getDepartment());
        // System.out.println("The EmployeeID is: "+emp.getEmployeeId());
        // System.out.println("The Name is: "+emp.getName());
        // System.out.println("The Salary is: "+emp.getSalary());
        // System.out.println("The Employee Count is: "+Employee.getEmployeeCount());

        // Book book = new Book("Chetan Bhagat", "Chetan Prakash Bhagat", "200", 900,2014);
        // System.out.println("The Author name is: "+book.getAuthor());
        // System.out.println("The ISBN is: "+book.getISBN());
        // System.out.println("The Author name is: "+book.getTitle());
        // System.out.println("The Book got published in: "+book.getPublishedYear());
        // System.out.println("The Price before is: "+book.getPrice());
        // System.out.println();
        // System.out.println();
        // book.setPrice(1120);
        // System.out.println("The Price After is: "+book.getPrice());

        // Flight flight = new Flight("Arab_Emirates", "Saudi_Arabia", "India", 5, false);
        // flight.bookSeat(5);
        // flight.cancelSeat(3);
        // System.out.println("The Name of the flight is: "+flight.getFlightName());
        // System.out.println("The Destination of the flight is: "+flight.getDestination());
        // System.out.println("The Starting Point of the flight is: "+flight.getStartingPoint());
        // System.out.println("The travel time of the flight is: "+flight.getTravelTimeInHours());
        // System.out.println("The number  of available seats is: "+Flight.getAvailableSeats());
    
        // Movie movie = new Movie("96", "Prem Kumar", "VJS", "Trisha", "Govind Vasantha", 500, 2018, "Nandha Gopal", true);
        // System.out.println(movie.getActor());
        // System.out.println(movie.getActress());
        // System.out.println(movie.getDirector());
        // System.out.println(movie.getMovieName());
        // System.out.println(movie.getMusicDirector());
        // System.out.println(movie.getNumberOfArtists());
        // System.out.println(movie.getProducer());
        // System.out.println(movie.getReleaseYear());

        Team warriors = new Team("Warriors", "San Francisco", "Western Conference");
        Player curry = new Player("Stephen Curry", "Point Guard", 30, warriors);

        curry.playGame();
        curry.train();

        warriors.playGame();
        warriors.hireCoach();
    
    
    
    
    
    }
}
