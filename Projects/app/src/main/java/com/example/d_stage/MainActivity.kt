package com.example.d_stage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.d_stage.models.pic
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var blogAdapter: BlogRecyclerAdapter
    private lateinit var picAdapter: PicRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        addDataSet()
        addDataSet2()
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)
    }
    private fun addDataSet2(){
        val data1 = DataSource2.createDataSet()
        picAdapter.submitList(data1)
    }

private fun initRecyclerView(){

      recycler_view.apply {
           layoutManager = LinearLayoutManager( this@MainActivity, LinearLayoutManager.HORIZONTAL, true)
           val topSpacingDecorator = TopSpacingItemDecoration(30)
           addItemDecoration(topSpacingDecorator)
          blogAdapter = BlogRecyclerAdapter()
           adapter = blogAdapter
       }
    recycler_view1.apply{
        layoutManager = LinearLayoutManager( this@MainActivity, LinearLayoutManager.HORIZONTAL, true)
        val topSpacingDecorator = TopSpacingItemDecoration(30)
        addItemDecoration(topSpacingDecorator)
        picAdapter = PicRecyclerAdapter()
        adapter = picAdapter
    }
   }












}

