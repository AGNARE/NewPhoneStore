package com.agn.phonestorenew

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.agn.phonestorenew.RecicleView.ImgAdapter
import com.agn.phonestorenew.RecicleView.ImgModel
import com.agn.phonestorenew.databinding.FragmentMainFirstBinding
import com.agn.phonestorenew.databinding.ItemImgBinding

class MainFirstFragment : Fragment() {

    lateinit var binding: FragmentMainFirstBinding
    lateinit var adapter: ImgAdapter
    var arrayList: ArrayList<ImgModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainFirstBinding.inflate(layoutInflater,container,false)
      return (binding.root)
        binding.recicleView.adapter = adapter
        fillrecicler()
    }

    private fun fillrecicler() {
        arrayList.add(ImgModel(R.drawable.samsunggalaxyfirst,1000,"fasjfjoij"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxysecond,12097,"sdfjfjoij"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        adapter = ImgAdapter(arrayList)
        binding.recicleView.adapter
    }
}
