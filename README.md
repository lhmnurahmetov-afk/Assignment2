# Vehicle Management System

## Overview
This project demonstrates **OOP concepts** in Java: inheritance, abstraction, polymorphism, and composition.  
It has an abstract `Vehicle` class with `Car`, `Motorcycle`, and `Truck` subclasses.  
A `Driver` class can be associated with vehicles.

## Class Hierarchy
- **Vehicle (abstract)**: `brand`, `year`, `startEngine()`, `stopEngine()`, `displayInfo()`  
- **Car**: `doors`, `fuelType`  
- **Motorcycle**: `hasSidecar`  
- **Truck**: `capacity`, `numAxles`  
- **Driver**: `name`, `licenseNumber`

## How to Run
1. Compile:  
   ```bash
   javac *.java
   
Example output:
Toyota engine started.
Brand: Toyota
Year: 2020
Doors: 4
Fuel Type: Petrol
Toyota engine stopped.

Reflection:
This project shows how abstract classes and polymorphism let different vehicles share behavior, while allowing specific details. Composition with Driver adds modularity and realism.
