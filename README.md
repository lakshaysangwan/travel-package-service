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

## High-Level Diagram

![Higher-Level Design](https://imgur.com/UyJexlt.jpg)

## Low-Level Diagram

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

### How to Run

#### Using IntelliJ IDEA:

1. Clone the repository
    ```bash
    git clone https://github.com/lakshaysangwan/travel-package-service.git
    ```
2. Open IntelliJ IDEA and go to `File -> Open`, navigate to the `travel-package-service` directory and click `OK`.
3. Let IntelliJ IDEA import the project automatically.
4. Make sure Lombok plugin is installed in IntelliJ (Go to `Preferences/Settings -> Plugins`, search for `Lombok Plugin`
   and install if not present).
5. Right-click on the `TravelPackageServiceApplication.java` file in the `src` folder and
   choose `Run 'TravelPackageServiceApplication.main()'`.

#### Using Eclipse:

1. Clone the repository
    ```bash
    git clone https://github.com/lakshaysangwan/travel-package-service.git
    ```
2. Open Eclipse, go to `File -> Import -> Maven -> Existing Maven Projects`.
3. Navigate to the `travel-package-service` directory and click `Finish`.
4. Install Lombok in Eclipse if not already installed (You can download it
   from [here](https://projectlombok.org/setup/eclipse)).
5. Right-click on the `TravelPackageServiceApplication.java` file in the `src` folder and
   choose `Run As -> Java Application`.

> Note: These steps assume that you have a basic Maven or Gradle setup integrated into your project for dependency
> management. If you're not using these, make sure to include the required libraries manually (e.g., Lombok).

## Author

Lakshay Sangwan (with ChatGPT)
