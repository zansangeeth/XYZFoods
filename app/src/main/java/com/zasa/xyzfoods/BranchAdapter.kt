package com.zasa.xyzfoods

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 **@Project -> XYZ Foods
 **@Author -> Sangeeth on 9/9/2022
 */
class BranchAdapter(val context: Context, private val branchList: List<BranchResult>) :
    RecyclerView.Adapter<BranchAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = branchList.size
}