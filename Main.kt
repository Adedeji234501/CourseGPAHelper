// Converts a letter grade to its corresponding grade point
fun getGradePoint(grade: String): Double {
    return when (grade) {
        "A" -> 4.0
        "B" -> 3.0
        "C" -> 2.0
        "D" -> 1.0
        "F" -> 0.0
        else -> -1.0 // Invalid grade
    }
}

fun main() {

    // List to store all registered courses
    val courses = mutableListOf<Course>()

    while (true) {
        println("\n=== COURSE REGISTRATION & GPA HELPER ===")
        println("1. Add Course")
        println("2. View Courses")
        println("3. Calculate GPA")
        println("4. Exit")
        print("Choose an option: ")

        val choice = readLine()

        when (choice) {
            "1" -> {
                print("Enter course name: ")
                val name = readLine() ?: ""

                print("Enter credit units: ")
                val creditUnits = readLine()?.toIntOrNull()

                // Validate credit units input
                if (creditUnits == null || creditUnits <= 0) {
                    println("Invalid credit units. Please enter a valid number.")
                } else {
                    print("Enter grade (A-F): ")
                    val grade = readLine()?.uppercase() ?: ""

                    // Validate grade input
                    if (getGradePoint(grade) < 0) {
                        println("Invalid grade entered. Please use A, B, C, D, or F.")
                    } else {
                        val course = Course(name, creditUnits, grade)
                        courses.add(course)
                        println("Course added successfully!")
                    }
                }
            }

            "2" -> {
                if (courses.isEmpty()) {
                    println("No courses registered yet.")
                } else {
                    println("\nRegistered Courses:")
                    for ((index, course) in courses.withIndex()) {
                        println(
                            "${index + 1}. ${course.name} | " +
                            "Units: ${course.creditUnits} | " +
                            "Grade: ${course.grade}"
                        )
                    }
                }
            }
            "3" -> {
                // Check if any courses have been added
                if (courses.isEmpty()) {
                    println("No courses available to calculate GPA.")
                } else {
                    var totalGradePoints = 0.0
                    var totalCreditUnits = 0
                    var hasInvalidGrade = false

                    // Loop through each course to calculate GPA
                    for (course in courses) {
                        val gradePoint = getGradePoint(course.grade)

                        // Check for invalid grade
                        if (gradePoint < 0) {
                            println("Invalid grade found for course: ${course.name}")
                            hasInvalidGrade = true
                            break
                        }

                        totalGradePoints += gradePoint * course.creditUnits
                        totalCreditUnits += course.creditUnits
                    }

                    // Only calculate GPA if all grades were valid
                    if (!hasInvalidGrade) {
                        val gpa = totalGradePoints / totalCreditUnits
                        println("Your GPA is: %.2f".format(gpa))
                    }
                }
            }
            "4" -> {
                println("Exiting program...")
                break
            }
            else -> println("Invalid option. Try again.")
        }
    }
}
// This class represents a course
class Course(
    val name: String,
    val creditUnits: Int,
    val grade: String
)

