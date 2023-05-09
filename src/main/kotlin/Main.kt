fun main(args: Array<String>) {
    var numbers=totaled(arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62))
    println( takesIn("Omara","Tata","Mummy"))




}

//Lists assignment1. Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
fun totaled(number:Array<Int>) {
    var allnumbers = number[1] + number[4]
    println(allnumbers)

//(ii) prints out the index of 158 (1 point)
//    for(ele in number)

    var pick = number.indexOf(158)
    println(pick)

//(iii) prints out the elements in ascending order. (1 point)
var sorting=number.sorted()
    println(sorting)

}

//2. Given a list of Person objects, each with the attributes, name, age, height,
// and weight. Sort the list in order of descending age (2 points)
//fun Ob(persons:List<Any>) {
//    var people=listOf{
//        val persons = listOf(
//            Person("Alice", 25, 170, 60),
//            Person("Bob", 30, 180, 80),
//            Person("Charlie", 20, 165, 55)
//        )

//        val sortedPersons = persons.sortedByDescending { it.age }

    //    }
//}
//3. Create a function that takes in 3 names and returns a string array
// containing all 3 names. (2 points)
    fun takesIn(name1: String, name2: String, name3: String): Array<String> {
        var detail=arrayOf(name1, name2, name3)
        return detail
    }


//4. Write a function that takes in a list of Car objects each with a registration and
// mileage attribute and returns the average mileage of all the vehicles in the list. (3 points)
//fun ave(make:String,model:String,mileage=Int){
//    for(car in Car)
//    car=Car()
//
//}