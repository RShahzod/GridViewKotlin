package uz.shox.gridviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import uz.shox.gridviewkotlin.adapter.GridAdapter
import uz.shox.gridviewkotlin.model.ListData

class MainActivity : AppCompatActivity() {

    var gridView : GridView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()


    }
    fun initView(){
        gridView = findViewById<GridView>(R.id.gridView)

        val listArray : ArrayList<ListData> = ArrayList<ListData>()
        listArray.add(ListData(R.drawable.lambo,"Lambo"))
        listArray.add(ListData(R.drawable.ferra,"Ferra"))
        listArray.add(ListData(R.drawable.mers,"Mers"))
        listArray.add(ListData(R.drawable.bmw,"BMW"))
        listArray.add(ListData(R.drawable.lambo,"Lambo"))
        listArray.add(ListData(R.drawable.ferra,"Ferra"))
        listArray.add(ListData(R.drawable.mers,"Mers"))
        listArray.add(ListData(R.drawable.bmw,"BMW"))
        listArray.add(ListData(R.drawable.lambo,"Lambo"))
        listArray.add(ListData(R.drawable.ferra,"Ferra"))
        listArray.add(ListData(R.drawable.mers,"Mers"))
        listArray.add(ListData(R.drawable.bmw,"BMW"))

        refreshAdapter(listArray)

    }
    fun refreshAdapter(listArray1 : ArrayList<ListData>) {
        val gridAdapter = GridAdapter(this,listArray1)
        gridView!!.adapter = gridAdapter

    }
}