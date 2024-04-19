package net.hicare.hicaretest.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import net.hicare.hicaretest.data.entity.FacilityEntity
import net.hicare.hicaretest.databinding.ItemFacilityBinding
import net.hicare.hicaretest.model.FacilityData

class FacilityAdapter(private val onClick: (FacilityData) -> Unit) : ListAdapter<FacilityData, FacilityAdapter.FacilityViewHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacilityViewHolder {
        val binding = ItemFacilityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FacilityViewHolder(binding, onClick)
    }

    override fun onBindViewHolder(holder: FacilityViewHolder, position: Int) {
        val facility = getItem(position)
        holder.bind(facility)
    }

    class FacilityViewHolder(private val binding: ItemFacilityBinding, private val onClick: (FacilityData) -> Unit) : RecyclerView.ViewHolder(binding.root) {
        fun bind(facility: FacilityData) = with(binding) {
            facilityName.text = facility.facilityName
            facilityLogo.loadImage(facility.logoUrl)
            root.setOnClickListener {
                onClick(facility)
            }
        }

        private fun ImageView.loadImage(imageUrl: String) {
            //이미지 처리
        }
    }

    object DiffCallback : DiffUtil.ItemCallback<FacilityData>() {
        override fun areItemsTheSame(oldItem: FacilityData, newItem: FacilityData): Boolean {
            return oldItem.facilityId == newItem.facilityId
        }

        override fun areContentsTheSame(oldItem: FacilityData, newItem: FacilityData): Boolean {
            return oldItem == newItem
        }
    }
}