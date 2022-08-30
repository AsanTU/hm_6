package com.example.hm6

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hm6.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var list = arrayListOf<Music>()
    private lateinit var photoAdapter = MusicAdapter()
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        music()
        photoAdapter = MusicAdapter(list, this::onClickItem)
        binding.recyclerview.adapter = photoAdapter
    }

    private fun music() {
        list.add(Music("1", "Taylor Swift", "Blanf Space", "3:22"))
        list.add(Music("2", "Silento", "Watch Me", "5:36"))
        list.add(Music("3", "The Weekend", "Earned It", "4:51"))
        list.add(Music("4", "The Weekend", "The Hills", "3:41"))
        list.add(Music("5", "Taylor Swift", "Writings On The Wall", "5:33"))
    }

    private fun onClickItem(name: String) {
        val intent = Intent(requireContext(), SecondActivity()::class.java)
        intent.putExtra("nameMusic", name)
        startActivity(intent)
    }
}