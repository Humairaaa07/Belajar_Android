package com.rintasari.proyeknative

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rintasari.proyeknative.databinding.ActivitySelamatDatangBinding

class SelamatDatang : AppCompatActivity() {
    companion object {

        const val WEB = "https://instagram.com/rintasari_?utm_medium=copy_link"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //menampilkan layout: activity_detail menggunakan konsep/ metode binding
        val binding = ActivitySelamatDatangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // mengambil data yang dikirimkan melalui intent

        binding.instagramButton.setOnClickListener { instagram() }
    }
    private fun instagram() {
        // menggunakan intent implisit
        // dengan variabel queryUrl, data didalamnya WEB
        val queryUrl: Uri = Uri.parse(WEB)
        // menyiapkan variabel intent, dengan parameter
        val intent = Intent(Intent.ACTION_VIEW, queryUrl)
        // aktifkan intent
        startActivity(intent)
    }
}