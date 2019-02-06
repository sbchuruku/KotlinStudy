package sbc.q200.part4.to150

/*
    MutableMap 인터페이스 살펴보기
 */

fun main()
{
    val map:MutableMap<String,String> = mutableMapOf()
    println(map)

    println(map.put("Hi","こんにちは")) // Hi 라는 키가 map 에 없으므로 null
    println(map)

    println(map.put("Hi","你好")) // Hi 를 키로 하는 값을 바꾸고 이전에 있던 값 리턴
    println(map)

    map["Hi"] = "안녕" // Hi 를 키로 하는 값을 바꾼다.
    println(map)

    map.putAll(mapOf("How is it going" to "잘 지내?", "Bye!" to "잘 가!")) // map 에 map 을 추가
    println(map)

    println(map.remove("Hi")) // Hi 를 키로하는 쌍을 삭제하고 값을 출력
    println(map)

    println(map.remove("Bye!","잘"))  // Bye! 를 키, 잘 을 값으로 하는 쌍을 삭제. 그런 쌍이 존재하지 않으므로 false 리턴
    println(map)

    println(map.remove("Bye!","잘 가!")) // Bye! 를 키, 잘 가! 를 값으로 하는 쌍을 삭제. true 리턴
    println(map)

    map.clear() // map 에 모든 쌍을 삭제
    println(map)
}