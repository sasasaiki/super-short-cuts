package com.example.supershortcuts.ui.main

import org.junit.Test

import org.junit.Assert.*

class MyClassTest {



//    cmd+f8でブレークポイントの切り替え、いくつか打っておこう
//    cmd+shft+f8で詳細表示、もう一回押せば一覧表示だ
//    ブレークポイントのないところでこのコマンドなら直接一覧表示ができる。
//    矢印キーで選んでspaceでswichしたりdeleteで消すこともできる
//    さて、実行してみよう、
//    さっき紹介した実行のコマンドのrをdに変えることでデバッグ実行することができる。
//    ctrl+dとshift+ctrl+dとctrl+opt+dだ
//    デバッグ左下のこの辺りの機能はよく使うと思うけど、もちろんマウスを触る必要はない
//    ステップオーバーはF8
//    ステップインはf7
//    ステップアウトはshift+f8
//    ブレークポイントまで再開したければcmd+opt+r
//    さらに、ブレークポイントを置くほどじゃないけどここで止めたいというときは
//    opt+f9でカーソル位置まで実行ができる。
//    せっかく止めたからこの変数の中身を見てみよう
//    opt＋上で選んでopt+F8で式評価開ける。

    @Test
    fun outPutName() {
        MyClass().outPutName("first","last")
    }

    @Test
    fun outPutNameAndScore() {
    }

    @Test
    fun outPutNameAndAge() {
    }

    @Test
    fun getParent() {
    }

    @Test
    fun doBar() {
    }

    @Test
    fun doFoo() {
    }

    @Test
    fun longAuguments() {
    }
}