Classes interaction:

The client interacts with RentalService to book a car.

RentalService is looking for affordable cars by checking them through Car class.

After the car is found, the Reservation object is created, which connects the client and the selected car with the rental dates.

The system can support many cars, customers and reservations, keeping this information in collections (for example, lists).