# CSA09 - Programming in Java

**Institution:** Saveetha Institute of Medical and Technical Sciences (SIMATS Engineering)  
**Student:** Kadiyala Showkath Ali  
**Course:** CSA09 – Programming in Java  

---

## 🎟️ Course Assignment: Concurrent Event-Ticket Booking Application (`SwiftBook Live`)

A robust, thread-safe desktop event ticketing system designed using Core Java, Object-Oriented Principles, Java Collections, Custom Exception Handling, SQLite JDBC Persistence, AWT Graphical User Interface, and Multithreading with Synchronization.

### 📄 Course Assignment Report (20 Pages - Topic on Every Page)
* **Word Document (.docx - 20 Pages):** [`CSA09_Course_Assignment_Report.docx`](./CSA09_Course_Assignment_Report.docx)
* **PDF Report (20 Pages):** [`CSA09_Course_Assignment_Report.pdf`](./CSA09_Course_Assignment_Report.pdf)
* **HTML Report (Printable 20 Pages):** [`CSA09_Course_Assignment_Report.html`](./CSA09_Course_Assignment_Report.html)
* **Markdown Report:** [`CSA09_Course_Assignment_Report.md`](./CSA09_Course_Assignment_Report.md)

#### 20-Page Topic Outline:
1. **Page 1:** Title Page & Student Identification
2. **Page 2:** Problem Statement & Background Context
3. **Page 3:** Objectives & Course Outcomes (CO1–CO4) Mapping
4. **Page 4:** System Requirements & Environment Specifications
5. **Page 5:** System Architecture & Relational Data Design
6. **Page 6:** GUI Layout & Event-Driven Architecture Plan
7. **Page 7:** Algorithm & Pseudocode for Booking Workflow
8. **Page 8:** Source Code – Core Event Domain Models (Part 1: Event & ConcertEvent)
9. **Page 9:** Source Code – Sports Event & Seat Entity (Part 2: SportsEvent, SeatStatus, Seat)
10. **Page 10:** Source Code – Custom Exception & Inventory Engine (Part 1: bookSeat)
11. **Page 11:** Source Code – Inventory Engine (Part 2: cancelSeat & getAvailableSeats)
12. **Page 12:** Source Code – Database Access Layer (BookingDAO)
13. **Page 13:** Source Code – Graphical User Interface (Part 1: Layout & Seat Matrix)
14. **Page 14:** Source Code – Graphical User Interface (Part 2: Handlers & Listeners)
15. **Page 15:** Source Code – Concurrency Simulation & Launcher (BookingSimulation & Main)
16. **Page 16:** Test Plan & Test Execution Matrix (TC1–TC6)
17. **Page 17:** Execution Outputs & Screenshot Evidence
18. **Page 18:** In-Depth Technical Analysis & Discussion
19. **Page 19:** Modern Tool Usage, Debugging & SDG Relevance
20. **Page 20:** Conclusion, Future Enhancements & References

---

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
`Arithmetic.java`, `MaxOfTwo.java`, `LeapYear.java`, `Fibonacci.java`, `Factorial.java`, `RightTrianglePattern.java`, `Search.java`, `GCD.java`, `Prime.java`, `Sort.java`, `Table.java`, `LeftTrianglePattern.java`, `LCM.java`, `BinaryToDecimal.java`, `DecimalToBinary.java`, `Sum.java`, `Product.java`, `Power.java`, `AreaOfCircle.java`, `Sphere.java`, `Palindrome.java`, `Armstrong.java`, `RightTriangleNumberPattern.java`, `PerfectNumber.java`, `MaxInArray.java`, `SecondMaxInArray.java`, `MinInArray.java`, `SecondMinInArray.java`, `BubbleSort.java`, `InsertionSort.java`.
