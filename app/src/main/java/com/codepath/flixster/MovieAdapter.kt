package com.codepath.flixster

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

const val MOVIE_EXTRA= "MOVIE_EXTRA"
private const val TAG ="MovieAdapter"
class MovieAdapter(private val context: Context, private val movies: List<Movie>):
    RecyclerView.Adapter<MovieAdapter.viewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_movie,parent,false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    override fun getItemCount()= movies.size

    inner class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
        private val ivposter = itemView.findViewById<ImageView>(R.id.ivPoster)
        private val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        private val tvOverview= itemView.findViewById<TextView>(R.id.tvOverview)

        init {
            itemView.setOnClickListener(this)
        }
        fun bind(movie: Movie) {
            Glide.with(context).load(movie.posterImageUrl).into(ivposter)
            tvTitle.text =movie.title
            tvOverview.text = movie.overview

        }

        override fun onClick(v: View?) {
            val movie = movies[adapterPosition]


            val intent = Intent(context,DetailActivity::class.java)
            intent.putExtra(MOVIE_EXTRA,movie)
            context.startActivity(intent)
        }
    }




}
