package uz.shox.gridviewkotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import uz.shox.gridviewkotlin.R
import uz.shox.gridviewkotlin.model.ListData


class GridAdapter(var context: Context,var listData: ArrayList<ListData> ) : BaseAdapter() {

    var inflater: LayoutInflater? = null

    init {
        inflater = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
         return listData.size
    }

    override fun getItem(position: Int): Any {
        return listData[position]
    }

    override fun getItemId(position: Int): Long {
         return position.toLong()
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        val view = inflater!!.inflate(R.layout.item_grid,null)

        val icons = view.findViewById<ImageView>(R.id.icons)
        val name = view.findViewById<TextView>(R.id.name)

        val data = listData[position]

        icons.setImageResource(data.icons)
        name.text = data.name

        return view
    }
}