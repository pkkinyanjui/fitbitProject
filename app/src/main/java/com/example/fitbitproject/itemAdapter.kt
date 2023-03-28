package com.example.fitbitproject
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitbitproject.R
import com.example.fitbitproject.foodItem

class itemAdapter(private val items: List<foodItem>): RecyclerView.Adapter<itemAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val food: TextView
        val calories: TextView

        init {
            food = itemView.findViewById(R.id.food)
            calories = itemView.findViewById(R.id.calories)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val itemView = inflater.inflate(R.layout.activity_detail, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.get(position)
        holder.food.text = item.food
        holder.calories.text = item.calories
    }

    override fun getItemCount(): Int {
        return items.size
    }
}