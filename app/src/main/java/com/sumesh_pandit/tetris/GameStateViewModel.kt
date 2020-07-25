package com.sumesh_pandit.tetris

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class GameStateViewModel(var points: Int = 0): ViewModel() {
    var notifyPoints = MutableLiveData<Int>()

    var board = Array(36) {
        Array(20) { 0 }
    }

    var part: Part = PartI(0, 0)

    fun addScore(p:Int) {
        points += p
        notifyPoints.value = points
    }

}