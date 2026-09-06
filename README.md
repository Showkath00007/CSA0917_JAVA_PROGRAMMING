# CSA09 - Programming in Java

**Institution:** Saveetha Institute of Medical and Technical Sciences (SIMATS Engineering)  
**Student:** Kadiyala Showkath Ali  
**Course:** CSA09 – Programming in Java  

---

## 🎟️ Course Assignment: Concurrent Event-Ticket Booking Application (`SwiftBook Live`)

A robust, thread-safe desktop event ticketing system designed using Core Java, Object-Oriented Principles, Java Collections, Custom Exception Handling, SQLite JDBC Persistence, AWT Graphical User Interface, and Multithreading with Synchronization.

### 📄 Course Assignment Report
* **PDF Report (14 Pages):** [`CSA09_Course_Assignment_Report.pdf`](./CSA09_Course_Assignment_Report.pdf)
* **HTML Report (Printable):** [`CSA09_Course_Assignment_Report.html`](./CSA09_Course_Assignment_Report.html)
* **Markdown Report:** [`CSA09_Course_Assignment_Report.md`](./CSA09_Course_Assignment_Report.md)

### 🏗️ Architecture & Package Structure
```
src/com/swiftbook/booking/
├── model/
│   ├── Event.java                      # Abstract base event
│   ├── ConcertEvent.java               # Concrete concert with VIP surcharge (+40%)
│   ├── SportsEvent.java                # Concrete sports with Premium surcharge (+25%)
│   ├── SeatStatus.java                 # Enum: AVAILABLE, BOOKED, HELD
│   ├── Seat.java                       # Seat entity
│   └── SeatInventory.java              # Thread-safe inventory with HashMap and Iterator
├── exception/
│   └── SeatAlreadyBookedException.java # User-defined checked exception
├── dao/
│   └── BookingDAO.java                 # SQLite JDBC persistence layer
├── gui/
│   └── BookingGUI.java                 # AWT desktop seat selection & booking interface
├── concurrency/
│   └── BookingSimulation.java          # Multithreaded race condition demonstration
└── Main.java                           # Application interactive launcher
```

### 🚀 How to Run the Project

#### Option 1: Using the helper script
```bash
./run.sh
```

#### Option 2: Command Line (javac & java)
Compile:
```bash
javac -cp "lib/*:." -d bin $(find src -name "*.java")
```

Run Interactive Launcher:
```bash
java -cp "lib/*:bin" com.swiftbook.booking.Main
```

Run Concurrency Simulation directly:
```bash
java -cp "lib/*:bin" com.swiftbook.booking.concurrency.BookingSimulation
```

---

## 💻 Beginner Java Programming Exercises

This repository also contains 30 foundational Java console programs:

| # | Program File | Description |
|---|---|---|
| 1 | `Arithmetic.java` | Basic arithmetic calculations |
| 2 | `MaxOfTwo.java` | Maximum of two numbers |
| 3 | `LeapYear.java` | Leap year checking |
| 4 | `Fibonacci.java` | Fibonacci series generator |
| 5 | `Factorial.java` | Factorial calculation |
| 6 | `RightTrianglePattern.java` | Right triangle star pattern |
| 7 | `Search.java` | Linear search in integer array |
| 8 | `GCD.java` | Greatest Common Divisor |
| 9 | `Prime.java` | Prime number verification |
| 10 | `Sort.java` | Selection sort on array |
| 11 | `Table.java` | Multiplication table generator |
| 12 | `LeftTrianglePattern.java` | Left-aligned triangle star pattern |
| 13 | `LCM.java` | Least Common Multiple |
| 14 | `BinaryToDecimal.java` | Binary to decimal conversion |
| 15 | `DecimalToBinary.java` | Decimal to binary conversion |
| 16 | `Sum.java` | Sum of two numbers |
| 17 | `Product.java` | Product of two numbers |
| 18 | `Power.java` | Power calculation (base^exp) |
| 19 | `AreaOfCircle.java` | Area of a circle |
| 20 | `Sphere.java` | Volume and surface area of sphere |
| 21 | `Palindrome.java` | Palindrome check |
| 22 | `Armstrong.java` | Armstrong number check |
| 23 | `RightTriangleNumberPattern.java` | Number pattern triangle |
| 24 | `PerfectNumber.java` | Perfect number check |
| 25 | `MaxInArray.java` | Maximum element in array |
| 26 | `SecondMaxInArray.java` | Second maximum in array |
| 27 | `MinInArray.java` | Minimum element in array |
| 28 | `SecondMinInArray.java` | Second minimum in array |
| 29 | `BubbleSort.java` | Bubble sort implementation |
| 30 | `InsertionSort.java` | Insertion sort implementation |
