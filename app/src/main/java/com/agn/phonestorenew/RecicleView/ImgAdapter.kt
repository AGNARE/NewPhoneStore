package com.agn.phonestorenew.RecicleView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agn.phonestorenew.databinding.ItemImgBinding

class ImgAdapter(var arrayListImg : ArrayList<ImgModel>): RecyclerView.Adapter<ImgAdapter.ImgViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImgViewHolder {
        return ImgViewHolder(ItemImgBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ImgViewHolder, position: Int) {
        holder.onBind(arrayListImg[position])
    }

    override fun getItemCount(): Int {
        return arrayListImg.size
    }

    class ImgViewHolder(private val binding: ItemImgBinding): RecyclerView.ViewHolder
        (binding.root) {

        fun onBind(img: ImgModel) {
            binding.imgFirst.setImageResource(img.img)
            binding.tvPrice.text = img.price.toString()
            binding.tvInfoPhone.text = img.info

        }
        }
}