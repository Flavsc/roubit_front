package com.example.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SomeAdapter : RecyclerView.Adapter<SomeAdapter.ViewHolder>() {

    // Implement Adapter methods

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        // Implement ViewHolder methods
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Inflate item view
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Bind data to item view
    }

    override fun getItemCount(): Int {
        // Return item count
    }
}
