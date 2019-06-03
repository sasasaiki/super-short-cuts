package com.example.supershortcuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.supershortcuts.ui.main.MainFragment

class MyActivity : AppCompatActivity() {




    // valueという変数が使われている、この変数が一体どこで宣言されてるか知りたいときはよくあると思う
    // そんなときcmd+clickで移動してる人？ok、まあまあいるね
    // キーボードならcmd+bで移動だ。
    // 宣言元でもう一度cmd+bを押すことで使用されている箇所を一覧表示すすことができる。
    private fun readValue(){
        println(value)
    }

    // さて、使用されてる箇所に関してもう少し詳しく見たいときはopt+f7を押す
    // これでも使用箇所を一覧で見ることができるし、さらに素晴らしいことに、writeとreadを分けて表示してくれるのだ
    // ここはread。
    // ここはwrite。どこで値が変更されているのか知りたいときなんかはすごく便利だ
    private fun writeValue(){
        value = "newValue"
    }

    // さらに、そもそもこのreadValueFunctionがどこを起点にして呼ばれているのか見たいときがあるよね。
    // そいうときは、ctrl+option+hが便利だ。
    // 調べたい変数やメソッドの上で押してみると、右にコールヒエラルキーが表示される
    // 見てみよう
    // readValueはthirdから呼ばれて、secondから呼ばれて、firstから呼ばれて最後にstartから呼ばれているのが一目でわかる。



    // ここにMyImpl2というやばい名前のくらすがあり何かを継承している
    // 親クラスを見たいときはクラスの上でcmd+U
    open class MyImpl : MyInterFace {
        override fun doBar() {
            println("bar")
        }
    }


    class MyImpl2 : MyInterFace {
        override fun doBar() {
            println("bar")
        }

    }


    // 次にインターフェースがこんな感じで使われている場合にdoBarの実装が見たいとする
    // doBarでcmd+bを押すとこのようにInterFaceに移動してしまう。
    // これじゃdoBarで何がされているかわからない
    // ということでopt+cmd+bを押してみよう
    // 実装一覧が表示されるから好きな方を読むことができる
    fun printBar(bar: MyInterFace) {
        bar.doBar()
    }



    // MyImplClass
    fun printBar() {
        val bar = MyImpl()
        bar.doBar()
    }




    fun start(){
        printBar()

        first()
        writeValue()
    }


    fun first(){
        second()
    }

    fun second(){
        third()
    }

    fun third(){
        readValue()
    }


    var value = "myValue"


    interface MyInterFace {
        fun doBar()
    }







    // さて次、大きなコードを読むときすごく便利なしょーどかっとを教える

    // たとえば大きなActivityでonCreateを見たいときがあったとしよう
    // どう探す?
    // 例えば、cmd+fを押して、onCreateと入れる、これも悪くはないが、似たような単語が他に出てきていた場合に少し面倒だ
    // そこでcmd+f12これでメンバとfunctionの一覧が表示される、andOnCreateと打てば確実にonCreateFunctionに移動できる

    // さっきからずっと使ってるんだけど、cmd + [/]で元いた場所と行ったり来たりできるよ




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }

    //    F2 でエラー位置にジャンプしたら、 ⌘F1 でエラー説明表示だ。


    //    色々ジャンプしたあとは、⌘⌥← が最高だ。前に編集していた位置に一瞬で戻れるぞ。
    //    ⌘L で指定した行にジャンプ、 ⌘⌥[/] でブロック先頭、最後などもあるぞ。
    //    ⌘⌥F12 でReveal in Finderもなかなか便利だ。ファイルのオプションメニューから探すのは意外と見つかりにくいからなあ。
    //
    //    色々便利なチラ見機能も紹介するぜ。
    //    F1 でドキュメントを簡単に見れるぞ。メソッド呼び出し時にパラメータを見たいときは、 ⌘P だ。
    //    ⌥space で宣言をDialogで見ルことができ、コピーもできるぞ。read-onlyだから編集はできないようだ。








































    hoge

}
