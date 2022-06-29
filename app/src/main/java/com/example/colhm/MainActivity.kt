package com.example.colhm

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import android.widget.Toast
import com.example.colhm.databinding.ActivityMainBinding
import com.example.colhm.extension.load


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var arrayList = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        oneMethod()
        thoMethod()
        threeMethod()

    }

    private fun threeMethod() {
        binding.btnRandom.setOnClickListener {
            val random = (0 until arrayList.size).random()
            binding.ivImage.load(arrayList[random])
        }
    }

    private fun thoMethod() {
        binding.btn.setOnClickListener {
            val url = Uri.parse(binding.etMain.text.toString())
            if (URLUtil.isValidUrl(url.toString())){
                binding.ivImage.load(url.toString())
                arrayList.add(Uri.parse(binding.etMain.text.toString()).toString())
                Toast.makeText(this,getString(R.string.success),Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,getString(R.string.failed),Toast.LENGTH_SHORT).show()
        }

        }
    }

    private fun oneMethod() {
        arrayList.add("https://www.9to5carwallpapers.com/wp-content/uploads/2015/02/Toyota-Sports-Car-Hd-Wallpaper.jpg")
        arrayList.add("https://9to5carwallpapers.com/wp-content/uploads/2013/09/Modified-Lamborghini-Gallardo.jpg")
        arrayList.add("https://image.cnbcfm.com/api/v1/image/106528417-1588945694643gettyimages-1206290114.jpeg?v=1650907944&w=630&h=354&ffmt=webp")
        arrayList.add("https://cdnstatic.rg.ru/uploads/images/187/07/30/11.jpg")
        arrayList.add("https://tse3.mm.bing.net/th?id=OIP.su2pl9Evqb7saWAzyYJDLwHaEo&pid=Api")
        arrayList.add("http://www.uznayvse.ru/person/geyts/1-bill-geits.jpg")
        arrayList.add("https://www.southwiltonvet.com/files/BurmesePythonSouthWiltonVet.jpeg")
        arrayList.add("hhttps://tse1.mm.bing.net/th?id=OIP._clhO2NSs6ylcT2uM8kYMAHaFl&pid=Api")
        arrayList.add("https://images.fineartamerica.com/images/artworkimages/mediumlarge/1/5-atlanta-skyline-at-sunset-mark-chandler.jpg")
        arrayList.add("https://tse2.mm.bing.net/th?id=OIP.oYLUY5gMdkmQtw-zuBs09QHaDj&pid=Api")
    }

}