package part1.to30
/*
    Label 기능
 */
fun main(args : Array<String>) : Unit {

    var x = 0
    var y = 0

    outer@while (x <= 20) {

        y = 0

        while (y <= 20) {

            if (x+y == 15 && x-y == 5)
                break@outer // break 이후 해당 Label 밖으로 나감

            y += 1

        }

        x += 1

    }

    println("x:$x, y:$y")

}