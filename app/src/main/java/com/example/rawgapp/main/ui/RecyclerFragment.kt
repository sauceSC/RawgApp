package com.example.rawgapp.main.ui

import android.os.Bundle
import android.os.ResultReceiver
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rawgapp.R
import com.example.rawgapp.common.basemvp.BaseFragmentMvp
import com.example.rawgapp.databinding.RecyclerFragmentBinding
import com.example.rawgapp.main.api.model.ResultResponse
import com.example.rawgapp.main.model.Results
import org.koin.android.ext.android.inject
import timber.log.Timber


class RecyclerFragment :
    BaseFragmentMvp<GamesContract.View, GamesContract.Presenter>(R.layout.recycler_fragment), GamesContract.View {

    private lateinit var binding: RecyclerFragmentBinding

    override val presenter: GamesContract.Presenter by inject()


    private val gamesAdapter = GamesAdapter()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = RecyclerFragmentBinding.inflate(inflater, container, false)
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)
        mainRecyclerView.layoutManager = LinearLayoutManager(context)
        mainRecyclerView.adapter = gamesAdapter
        presenter.getGamesList()
    }

    override fun showGames(results: List<Results>) {
        gamesAdapter.setData(results)
    }

    override fun onFail(throwable: Throwable) {
        Timber.e(throwable.message)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detach()
    }
}