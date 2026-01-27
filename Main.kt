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
                val creditUnits = readLine()?.toIntOrNull() ?: 0

                print("Enter grade (A-F): ")
                val grade = readLine()?.uppercase() ?: ""

                val course = Course(name, creditUnits, grade)
                courses.add(course)

                println("Course added successfully!")
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
            "3" -> println("Calculate GPA selected")
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

