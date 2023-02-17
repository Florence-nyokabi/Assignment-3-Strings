fun main() {
    // Invoking instituitionName
    instituitionName("AkiraChix")

    // Invoking Introduction
    var a = introduction("Florence", 19)
    println(a)
    var b =introduction("Ian", 6)
    println(b)

    // Invoking getLength
    var c = getLength("assignment")
    println(c)
    var d = getLength("codehive")
    println(d)

    //  Invoking checkName
    checkName("Nyokabi")
    checkName("Florence")
}

/*
Question 1
Given a string “akirachix”. Write a function that prints out a string composed
of the first, third and fourth characters of the string
 */

fun instituitionName(instituiton: String){
    val instituition = "AkiraChix"
    println(instituition[0] + "" + instituition[2] + instituition[3])
}


/*
Question 2
Write a function that takes in 2 parameters, name and age and returns a
String with this structure “Hi, my name is x and I am y years old.” Where x and
y are the provided name and age respectively.
 */

fun introduction(name: String, age: Int):String{
    return "Hi, my name is $name and I am $age years old."
}


/*
Question 3
Write a function that takes in a String and returns its length.
 */

fun getLength(text: String):Int{
    return text.length
}


/*
Question 4
Write a function that takes in a name and prints out “That’s me!” when your
name is passed to it, otherwise it prints out “I don’t know who that is”
 */

fun checkName(person:String){
    var firstName = "Florence"
    if(person.equals(firstName)){
        println("That's me!")
    }
    else
    {
      println("I don' know who that is!")
    }
}
