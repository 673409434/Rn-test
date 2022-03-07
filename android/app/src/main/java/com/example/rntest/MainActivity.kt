package com.example.rntest

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.rntest.integratetest1.MyReactActivity
import com.example.rntest.integratetest1.MyReactActivityTwoUseInFragment
import com.example.rntest.integratetest2.MyReactActivityFore
import com.example.rntest.integratetest2.MyReactActivityThree
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_jumpMyReactActivity.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                startActivity(Intent(this@MainActivity, MyReactActivity::class.java))
            }

        })

        tv_MyReactActivityTwoUseInFragment.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                startActivity(Intent(this@MainActivity, MyReactActivityTwoUseInFragment::class.java))
            }

        })

        tv_MyReactActivityThree.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                startActivity(Intent(this@MainActivity, MyReactActivityThree::class.java))
            }

        })

        tv_MyReactActivityFore.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                startActivity(Intent(this@MainActivity, MyReactActivityFore::class.java))
            }

        })
    }


}