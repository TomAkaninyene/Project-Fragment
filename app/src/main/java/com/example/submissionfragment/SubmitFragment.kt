package com.example.submissionfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import com.example.submissionfragment.databinding.FragmentHomeBinding
import com.example.submissionfragment.databinding.FragmentSubmitBinding
import java.util.jar.Attributes


class SubmitFragment : Fragment() {
    private var _binding: FragmentSubmitBinding? = null
    private val binding get() = _binding!!
    private lateinit var name: String
    private lateinit var track: String
    private lateinit var goals: String

    companion object{
        const val Name = "name"
        const val Track = "track"
        const val Goals = "goals"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(Name).toString()
            track = it.getString(Track).toString()
            goals = it.getString(Goals).toString()
        }


    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSubmitBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.name.text = name
        binding.track.text = track
        binding.goals.text = goals
    }

}