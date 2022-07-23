package com.sangmin.retrofit_practice_20220723

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sangmin.retrofit_practice_20220723.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var mBinding : ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvents()
        setValues()
    }


//    이벤트 동작 로직 작성(setOnClickListner)
    override fun setupEvents() {

    }


//    첫 화면 동작시 데이터 연결(초기화)
    override fun setValues() {

    }
}