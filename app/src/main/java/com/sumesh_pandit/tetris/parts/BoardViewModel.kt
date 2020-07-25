package com.sumesh_pandit.tetris

import androidx.lifecycle.ViewModel

class BoardViewModel() : ViewModel() {
    val ROW = 36
    val COL = 20

    var board = Array(ROW) {
        Array(COL) { 0 }
    }

}