package com.example.product_fragment_hw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.product_fragment_hw.data.DataSorce
import com.example.product_fragment_hw.databinding.FragmentProductBinding
import com.example.product_fragment_hw.proudctAdapter.ItemAdapter
import com.example.product_fragment_hw.model.Phone


private var _binding : FragmentProductBinding? = null
private val binding get() = _binding!!
private lateinit var recyclerView: RecyclerView
lateinit var proList:List<Phone>

class ProductFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        proList = DataSorce().loadPhone()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProductBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ItemAdapter(this.requireContext(), proList)
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}