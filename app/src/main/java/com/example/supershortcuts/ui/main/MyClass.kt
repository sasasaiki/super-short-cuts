package com.example.supershortcuts.ui.main

class MyClass {





    //    リファクタリングしましょう。 コードをきれいに保つのはとても大切なことだ。
//    まずはここ、同じ処理が三つ出てきている、 一つのメソッドにまとめたいね
//    alt + 上下で範囲を広げ
//    cmd + alt + m を押す
//    素敵なメソッド名を入れてエンターを押せば完了。
//    このコマンドのもっとも素晴らしいところは、引数と戻り値まで正しく生成してくれるところだ。
//    変数でも同様の機能があります。
//    ここでfirst plus last が二回出てきていますね。変数にまとめてみましょう。
//    カーソルを置きcmd + opt + v
//    できました。
//    逆に変数を展開したい時はcmd + opt + nが使える。
//    元に戻りました。
//    if you want to it on property cmd + alt + p　でプロパティにできる。
//    まあ今回は必要ないね
//    これらのショートカットはctr + t　で一覧表示、実行もできます。
//    ショートカットキーも表示されるからまずはctrl+tを覚えるのがいいかもしれません.

    fun outPutName(first: String, last: String, upperCase: Boolean = false) {
        val fullName = if (upperCase) {
            first + last
        } else {
            (first + last).toUpperCase()
        }

        println(fullName)
    }

    fun outPutNameAndScore(first: String, last: String, upperCase: Boolean = false, score: Int) {
        val fullName = if (upperCase) {
            first + last
        } else {
            (first + last).toUpperCase()
        }

        println("$fullName score:$score")
    }

    fun outPutNameAndAge(first: String, last: String, age: Int, upperCase: Boolean = false) {
        val fullName = if (upperCase) {
            first + last
        } else {
            (first + last).toUpperCase()
        }

        println("$fullName age:$age")
    }

















    //    次にこのクラス。 ChildClassとParentClass。
//    ChildはParentの中にいた方が自然かもしれない。
//    そんな時はChildクラスの上でF6を押します。
//    今回はParentの中に移動したいのでto anotherclassを選択。
//    .Parentとうち エンター移動できました。
//    これの何がいいかというと、Childが使われていた場所での全てのimportが自動で書き換わることだ
//    他のファイルでたくさん使われていた場合にすごく助かる。
//    次はParetを他のファイルに切り出してみよう
//    同じくParentClassの上でF6
//    upperclassを選択しenter、必要であればクラス名を変更します。
//    ok. 切り出せました。
//    もちろんこれもimportがしっかり書き換わります。
    // moving class
    val parent = Parent()

    class Child {
        // TODO:
    }

    class Parent {
        val other = Child()
    }



















//    次はこのメソッドを見てみよう。
//    引数が2,1となっているね。これをひっくり返したいときはどうする？
//    こんな時は、カンマの上でalt+enter
//    FLipを選んでenter。以上だ
//    引数が二つ以上ある これらを並び替えたい、ならcmd+F6だ
//    引数の一覧が出るから、alt + 矢印で好きに入れ替えよう
//    最後にctrl+エンターを押せばok. 青いボタンは大抵ctrl+enterで押すことができる。
//    順番といえばこの行とこの行の順番も変えたい。
//    alt + shit + 矢印で解決しよう。滑らかに行を移動させることができる。
//    さらに、メソッド、メンバ変数、クラスの順番を変えたい時、alt+shift+矢印だと、こうなってしまいます
//    その代わりにメソッドの上でcmd+shift+矢印
//    このように上下のメソッドやメンバの位置と入れ替えることができる。

    fun DoBar(argument1: Int, argument2: String) {
        println(argument2)
        println(argument1)
    }

    fun DoFoo(argument1: String, argument2: Int, argument3: Int, argument4: Int) {
        println(argument4)
        println(argument3)
        println(argument1)
        println(argument2)
    }




































    fun longAuguments(first: String, second: Int, third: Int, fourth: Int,fifth: String, sixth: Int, seventh: Int, eighth: Int){
        println(first)
        println(second)
        println(third)
        println(fourth)
        println(fifth)
        println(sixth)
        println(seventh)
        println(eighth)
    }








//    ok　
//    最後にalt+cmd+lでフォーマットするのを忘れないようにしよう。
//    これだけでは不要なimportは消えないから
//    opt+ctrl+oでcleanしよう。
//    合わせてやりたいなら
//    shift+alt+cmd+l tabtab スペースでチェック入れる
//    もしこの最高のclassをコピーしたければF5で可能だ。
//    これでリファクタは終わり、ありがとう！？？？？？






    enum class NAME{
        ABEL,
        ABRAHAM,
        ACHIM,
        ADALBERT,
        ADALBRECHT,
        ADAM,
        ADELBERT,
        ADOLF,
        ADRIAN,
        ALBAN,
        ALBERT,
        ALBRECHT,
        ALEXANDER,
        ALEXIS,
        ALFONS,
    }

//    enum class NAME(val lowerCase:String){
//        ABEL("abel"),
//        ABRAHAM("abraham"),
//        ACHIM("achim"),
//        ADALBERT("adalbert"),
//        ADALBRECHT("adalbrecht"),
//        ADAM("adam"),
//        ADELBERT("adelbert"),
//        ADOLF("adolf"),
//        ADRIAN("adrian"),
//        ALBAN("alban"),
//        ALBERT("albert"),
//        ALBRECHT("albrecht"),
//        ALEXANDER("alexander"),
//        ALEXIS("alexis"),
//        ALFONS("alfons"),
//    }






}
