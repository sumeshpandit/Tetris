package com.sumesh_pandit.tetris

class PartS(var row:Int, var col:Int): Part(row,col) {

    init {
        id = 5
        pointB = Point(row, col + 1);
        pointC = Point(row + 1, col);
        pointD = Point(row + 1, col-1);
    }

    override fun moveDown() {
        pointA.moveDown()
        pointB.moveDown()
        pointC.moveDown()
        pointD.moveDown()
    }

    override fun moveLeft() {
        pointA.moveLeft()
        pointB.moveLeft()
        pointC.moveLeft()
        pointD.moveLeft()
    }

    override fun moveRight() {
        pointA.moveRight()
        pointB.moveRight()
        pointC.moveRight()
        pointD.moveRight()
    }

    override fun rotate() {
        if(!rotated) {
            pointB.x--
            pointB.y--

            pointC.x--
            pointC.y++

            pointD.y += 2
            rotated = true
        } else {
            pointB.x++
            pointB.y++

            pointC.x++
            pointC.y--

            pointD.y -= 2

            rotated = false
        }
    }
}