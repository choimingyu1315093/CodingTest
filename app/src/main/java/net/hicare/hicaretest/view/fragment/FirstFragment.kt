package net.hicare.hicaretest.view.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import net.hicare.hicaretest.databinding.FragmentFirstBinding
import net.hicare.hicaretest.view.adapter.FacilityAdapter
import net.hicare.hicaretest.viewmodel.FacilityViewModel

@AndroidEntryPoint
class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    private val viewModel: FacilityViewModel by viewModels()

    companion object {
        const val TAG = "FirstFragment"
    }

    lateinit var facilityAdapter: FacilityAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
        bindViews()
        observeViewModel()
    }

    private fun init() = with(binding){
        viewModel.loadFacilities()

        facilityAdapter = FacilityAdapter(viewModel::selectFacility)
        rvFacility.layoutManager = LinearLayoutManager(context)
        rvFacility.adapter = facilityAdapter
    }

    private fun bindViews() = with(binding){
        btnSync.setOnClickListener {
            viewModel.saveSelectedFacility()
        }
    }

    private fun observeViewModel() = with(binding){
        viewModel.facilities.observe(viewLifecycleOwner) { facilities ->
            facilityAdapter.submitList(facilities)
        }

        viewModel.errorMessage.observe(viewLifecycleOwner) { errorMsg ->
            if (errorMsg.isNotEmpty()) {
                Toast.makeText(requireContext(), errorMsg, Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}