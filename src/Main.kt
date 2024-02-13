import kotlin.math.PI

fun main() {
    println("Select a shape to calculate area:")
    println("1. Circle")
    println("2. Square")
    println("3. Rectangle")
    println("4. Triangle")
    print("Enter your choice: ")

    val choice = readLine()?.toIntOrNull()

    when (choice) {
        1 -> calculateCircleArea()
        2 -> calculateSquareArea()
        3 -> calculateRectangleArea()
        4 -> calculateTriangleArea()
        else -> println("Invalid choice.")
    }
}

fun calculateCircleArea() {
    print("Enter the radius of the circle: ")
    val radius = readLine()?.toDoubleOrNull()
    if (radius != null && radius > 0) {
        val area = PI * radius * radius
        println("The area of the circle is: $area")
    } else {
        println("Invalid input for radius.")
    }
}

fun calculateSquareArea() {
    print("Enter the side length of the square: ")
    val side = readLine()?.toDoubleOrNull()
    if (side != null && side > 0) {
        val area = side * side
        println("The area of the square is: $area")
    } else {
        println("Invalid input for side length.")
    }
}

fun calculateRectangleArea() {
    print("Enter the length of the rectangle: ")
    val length = readLine()?.toDoubleOrNull()
    print("Enter the width of the rectangle: ")
    val width = readLine()?.toDoubleOrNull()
    if (length != null && width != null && length > 0 && width > 0) {
        val area = length * width
        println("The area of the rectangle is: $area")
    } else {
        println("Invalid input for length or width.")
    }
}

fun calculateTriangleArea() {
    print("Enter the base length of the triangle: ")
    val base = readLine()?.toDoubleOrNull()
    print("Enter the height of the triangle: ")
    val height = readLine()?.toDoubleOrNull()
    if (base != null && height != null && base > 0 && height > 0) {
        val area = 0.5 * base * height
        println("The area of the triangle is: $area")
    } else {
        println("Invalid input for base length or height.")
    }
}
