fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")

}


fun printNotificationSummary(numberOfMessages: Int) {
    when{
        numberOfMessages in 0..100-> println(" You have $numberOfMessages notifications")
        numberOfMessages > 100 -> println(" Your phone is blowing up! You have $numberOfMessages+ notifications.")
        else -> println("$numberOfMessages")
    }
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    val conditionedPriceOnMonday: Int = if(isMonday) 25 else 30

    return when(age){
        in 0..12 -> 15
        in 13..60 -> conditionedPriceOnMonday
        in 61..100 -> 20
        else -> -1
    }

}