package collections

fun main(args: Array<String> ) {

    val namesToAge = mapOf (Pair("Peter", 25),  Pair("Roger", 30) )
    val namesToage2 = mapOf(
        "Peter" to 25 ,
        "Roger" to 30,

    )

    println(namesToAge == namesToage2)

    println(namesToAge.keys)
    println(namesToAge.values)
    println(namesToAge.entries)



    val countryToInhabitants = mutableMapOf(
        "Germany" to 83_000_000,
        "USA" to 331_000_000,

    )

    countryToInhabitants.put("Australia", 23_000_000)
    countryToInhabitants.putIfAbsent("USA", 330_000_000) // não substitui o valor se já existir


    println(countryToInhabitants)



    println(countryToInhabitants.contains("Germany"))
    println(countryToInhabitants.containsKey("France"))
    println(countryToInhabitants.containsValue(200_000_000))

    println(countryToInhabitants.get("USA"))
    println(countryToInhabitants.getOrDefault("France", 0))


    namesToAge.entries.forEach{
        it
        println("${it.key} is ${it.value} years old")

        // key se refere ao nome e value a idade de cada par do map
    }
}