package chapter02

fun main() {
    // .. (1 ~100) 양끝을 포함한다.
    for (i in 1..20) {
        println("넘버 : $i")
    }

    for (i in 20 downTo 2) {
        println("넘버 : $i")
    }

    for (i in 20 downTo 2 step 2) {
        println("넘버 : $i")
    }

    for (i in 1 until 20) {
        println("넘버 : $i")
    }

    val mapData = HashMap<String, String>()
    mapData["JAVA"] = "SPRING"
    mapData["PHP"] = "Laravel"
    mapData["GO"] = "Gin"

    for ((language,framework) in mapData) {
        println("$language 의 대표 framework 는 $framework")
    }

    val list = arrayListOf("window","linux","unix","macOs")
    for ((index, os) in list.withIndex()) {
        println("$index : $os")
    }

}