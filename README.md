# Course Registration and GPA Helper (Kotlin)

## Project Overview
This project is a console-based Course Registration and GPA Helper application developed using the Kotlin programming language. The application allows a student to register courses, view registered courses, and calculate their Grade Point Average (GPA) based on credit units and letter grades.

## Purpose
The project was created as part of a learning module to demonstrate understanding of Kotlin fundamentals, program structure, and problem-solving techniques.

---

## Features
- Add courses with course name, credit units, and grade
- View all registered courses
- Calculate GPA using weighted grade points
- Input validation for grades and credit units
- Menu-driven console interface

---

## Technologies Used
- Kotlin
- Java Development Kit (JDK)
- Visual Studio Code
- Command Line Interface (CLI)

---

## Software Demo Video
https://youtu.be/2BLT3OdUWTE

## How the Application Works
When the program starts, the user is presented with a menu that allows them to:
1. Add a course
2. View registered courses
3. Calculate GPA
4. Exit the application

Courses are stored in a mutable list, and GPA is calculated by converting letter grades into grade points and computing a weighted average based on credit units.

---

## Grade Point System
| Grade | Point |
|------|-------|
| A | 4.0 |
| B | 3.0 |
| C | 2.0 |
| D | 1.0 |
| F | 0.0 |

---

## Project Structure
CourseGPAHelper/
│
├── Main.kt
└── README.md

## How to Run the Program
1. Open the project folder in Visual Studio Code
2. Open a terminal in the project directory
3. Compile the program:
kotlinc Main.kt -include-runtime -d app.jarv;
java -jar app.jar

## Learning Websites
- [Understanding Kotlin syntax and program flow](https://kotlinlang.org/docs/basic-syntax.html)
- [Applying loops and conditional statements](https://www.jetbrains.com/help/idea/create-your-first-kotlin-app.html)
- https://en.wikipedia.org/wiki/Kotlin
