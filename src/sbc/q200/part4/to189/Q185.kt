package sbc.q200.part4.to189

/*
    파일 입출력
 */

// 코틀린의 파일 입출력은 근본적으로 자바 표준 라이브러리에 의존하며 코틀린 확장함수가 이를 보조
import java.io.*

fun main()
{
    var file = File("./out/hello.txt")

    if (!file.exists())
        file.createNewFile()

    val outputStream:OutputStream = file.outputStream()
    outputStream.write(35)

    val osw:OutputStreamWriter = outputStream.writer()
    osw.write("파일 입출력")
    osw.close()

    val inputStream:InputStream = file.inputStream()
    println(inputStream.read())

    val isr:InputStreamReader = inputStream.reader()
    println(isr.readText())
    isr.close()
}