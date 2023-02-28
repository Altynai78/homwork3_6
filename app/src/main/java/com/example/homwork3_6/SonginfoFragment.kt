package com.example.homwork3_6

import androidx.fragment.app.Fragment

class SongInfoFragment : Fragment() {


private lateinit var binding: FragmentSongInfoBinding

override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    binding = FragmentSongInfoBinding.inflate(layoutInflater)
    return binding.root
}

override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding.tvText.text = arguments?.getString("di").toString()