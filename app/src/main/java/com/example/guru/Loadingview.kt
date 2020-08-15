//package com.example.guru
//
//
//import android.app.Activity
//import android.os.Bundle
//import android.os.Handler
//
//class Loadingview : Activity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_loadingview)
//
//        startLoading()
//    }
//
//    private fun startLoading() {
//        val handler = Handler()
//        handler.postDelayed(Runnable {
//            @Override
//            fun run() {
//                finish()
//            }
//        }, 2000)
//    }
//
//}