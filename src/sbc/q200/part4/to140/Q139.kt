package sbc.q200.part4.to140

/*
    Map 인터페이스 살펴보기
 */

fun main()
{
    val map:Map<String,String> = mapOf("Apple" to "사과", "Banana" to "바나나")

    println(map.size)       // 키,값 쌍의 개수
    println(map.keys)       // 키들
    println(map.values)     // 값들
    println(map.entries)    // 키와 값 쌍
    println(map.isEmpty())  // 비어있으면 true 아니면 false
    println(map.containsKey("Cocoa"))   // "Cocoa" 는 키에 존재하지 않으므로 false
    println(map.containsValue("바나나")) // "바나나" 는 값에 존재하므로 true
    println(map["Apple"])   // "Apple" 키에 해당하는 값 "사과"
    println(map.getOrDefault("Cocoa","코코아")) // "Cocoa" 키에 해당하는 값이 없으므로 defaultValue "코코아"
}