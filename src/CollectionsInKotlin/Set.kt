package CollectionsInKotlin

class Cookie(
    val name : String,
    val softBaked : Boolean,
    val hasFilling : Boolean,
    val price : Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = true,
        hasFilling = false,
        price = 15.00
    ),
    Cookie(
        name = "Butter Cookies",
        softBaked = true,
        hasFilling = true,
        price = 20.00
    )
)

val fullMenu = cookies.map {
    "${it.name} - $${it.price}"
}

val softBakedMenu = cookies.filter {
    it.softBaked
}

val groupedMenu = cookies.groupBy { it.softBaked }

val softCookie = groupedMenu[true] ?: listOf()
val crunchyCookie = groupedMenu[false] ?: listOf()

val totalPrice = cookies.fold(0.0){ total , cookie ->
    total + cookie.price
}

val sortMenuByPrice = cookies.sortedBy {
    it.price
}

fun main(){
    val set = mutableSetOf("Aryan","Aryan")
    println(set.size)

    cookies.forEach{
        print("Menu Item : ${it.name}")
        print("Menu Item : ${it.price}")
        println()
    }

    fullMenu.forEach{
        print(it)
        println()
    }

    softBakedMenu.forEach{
        println("${it.name} - $${it.price}")
    }

    softCookie.forEach{
        println("${it.name} - $${it.price}")
    }

    crunchyCookie.forEach{
        println("${it.name} - $${it.price
        }")
    }

    println("Total Price: ${totalPrice}")

    sortMenuByPrice.forEach{
        println("${it.name} - $${it.price}")
    }
}

