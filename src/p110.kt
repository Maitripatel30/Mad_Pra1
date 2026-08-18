class Car(
    var company: String,
    var year: Int,
    var owner: String,
    var milesDrive: Int,
    var originalPrice: Double
) {

    fun currentPrice(): Double {
        return originalPrice - (milesDrive * 10)
    }

    fun displayInformation() {
        println("------------")
        println("Car Information: $company, $year")
        println("Car Owner: $owner")
        println("Miles Drive: $milesDrive")
        println("Original Car Price: $originalPrice")
        println("Current Car Price: ${currentPrice()}")
        println("------------")
    }
}

fun main() {
    val car1 = Car("BMW", 2018, "Aman", 105, 100000.0)
    car1.displayInformation()
    val car2 = Car("BMW", 2019, "Karan", 20, 400000.0)
    car2.displayInformation()
    val carList = ArrayList<Car>()
    carList.add(Car("Toyota", 2017, "KJS", 100, 1080000.0))
    carList.add(Car("Maruti", 2020, "NPP", 200, 4000000.0))

    for (car in carList) {
        car.displayInformation()
    }
}