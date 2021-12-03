package com.example.product_fragment_hw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.product_fragment_hw.databinding.FragmentDetaileBinding



class DetailesFragment : Fragment() {
    companion object{
        const val prodName = "Name"
    }
    private var _binding : FragmentDetaileBinding? = null
    private val binding get() = _binding!!
    lateinit var product:String
    private lateinit var productName: String //add here
    private lateinit var productimg: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        arguments?.let {
//            product =it.getString(prodName).toString()
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetaileBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //binding.productDetail.text =product // ad here
        fetchArguments()
        binding.productDetail.text = productName
        binding.productImage.setImageResource(productimg.toInt() )
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
    //add here
    private fun fetchArguments() {
        arguments?.let {
            val args = DetailesFragmentArgs.fromBundle(it)
            productName = args.name
            productimg = args.imageProduct
        }
    }
}
