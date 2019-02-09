package sbc.q200.part4.to189

/*
    FileTreeWalk 클래스 : 디렉토리 순회하기
 */

import java.io.File

fun main()
{
    val fileTree:FileTreeWalk = File("./").walk()
        .maxDepth(1)
        .onEnter { file ->
            println("새 디렉토리 방문:${file.name}")
            true
        }

    for (file in fileTree)
        println(file.name)
}