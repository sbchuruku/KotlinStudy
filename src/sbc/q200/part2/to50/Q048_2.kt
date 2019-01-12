package part2.to50
/*
    힙 영역 존재의 이유 (메모리 생성 순서는 책 참조)
 */
fun main(args: Array<String>) {

    val product:Product = createProduct() // 초기화
    processProduct(product) // 금액 + 500
    printProductInfo(product) // 출력

}

fun createProduct():Product {
    val apple = Product() // 초기화
    apple.name = "Apple"
    apple.price = 1000

    return apple
}

fun processProduct(product:Product) {
    product.price += 500 // 현재 금액 + 500
}

fun printProductInfo(product:Product) {
    println("이름:${product.name}") // 이름 출력
    println("가격:${product.price}") // 가격 출력
}