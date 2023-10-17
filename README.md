# Travel Package Management System

## Overview

This project is designed to manage different travel packages that include destinations and activities. Users can enroll
as passengers and sign up for activities offered at various destinations.

## Features

- Manage multiple travel packages.
- Different types of passengers: Standard, Gold, and Premium.
- Enroll passengers into travel packages.
- Sign up passengers for activities.
- List available activities with their remaining capacities.

## Technologies

- Java
- Lombok

## Higher-Level Design

![Higher-Level Design](https://imgur.com/UyJexlt.jpg)

## Low-Level Design

![Low-Level Design](https://i.imgur.com/4Fdhjfy.jpg)

## Classes

### Passenger

Abstract class that represents a passenger with properties like name, passenger number, and a list of signed-up
activities.

### StandardPassenger, GoldPassenger, PremiumPassenger

Derived from `Passenger`, these classes include specific features such as balance and discounts.

### Activity

Represents an activity with properties like name, description, cost, and capacity.

### Destination

Contains information about a destination including a list of activities.

### TravelPackage

Includes package name, passenger capacity, list of destinations (itinerary), and a list of enrolled passengers.

## How to Run

1. Clone the repository
   ```
   git clone https://github.com/lakshaysangwan/travel-package-service.git
   ```
2. Navigate into the directory
   ```
   cd travel-package-service
   ```
3. Compile and run
   ```
   javac *.java
   java Main
   ```

## Author

Lakshay Sangwan
