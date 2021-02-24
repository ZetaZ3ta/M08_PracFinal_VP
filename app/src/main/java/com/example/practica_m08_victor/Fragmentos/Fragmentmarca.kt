package com.example.practica_m08_victor.Fragmentos

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.practica_m08_victor.Entidad.Marcas
import com.bumptech.glide.Glide
import com.example.practica_m08_victor.R
import com.example.practica_m08_victor.databinding.FragmentMarcaBinding


class Fragmentmarca : Fragment() {
    val args: FragmentmarcaArgs by navArgs()
    private lateinit var marcas: Marcas
    lateinit var binding: FragmentMarcaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        marcas = args.marca!!
        (activity as AppCompatActivity?)!!.supportActionBar
            ?.setTitle(R.string.menu_Marca)
        setHasOptionsMenu(true);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.empresa.text = marcas.empresa_organitzadora
        binding.titulo.text = marcas.titol
        binding.seminario.text = marcas.numero_seminari.toString()
        Glide.with(view.context).load(marcas.logo).placeholder(R.drawable.progressbar)
            .error(R.drawable.info_error).into(binding.logo)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_marca, container, false)
        binding = FragmentMarcaBinding.bind(view)
        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.clear()
        inflater.inflate(R.menu.share, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}