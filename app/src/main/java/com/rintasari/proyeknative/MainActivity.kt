package com.rintasari.proyeknative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.rintasari.proyeknative.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // menampilkan layout:activity_main menggunakan konsep/ metode binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // memberikan klik listener pada button id: tombolLogin
        // saat button di-klik akan menjalankan fungsi cek password
        binding.buttonLogin.setOnClickListener { login() }
    }

    private fun login() {
        val email = binding.textEmail.text.toString()
        val password = binding.textPassword.text.toString()

        // cek kondisi apakah salah satu isian kosong
        // jika benar akan menampilkan toast/ pop-up

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Mohon masukkan nama dan password", Toast.LENGTH_SHORT).show()
            return
        }

        // cek apakah isian valid atau tidak
        if (email == "rintasari64@gmail.com" && password == "RintaSari#210800") {
            val intent = Intent(this, SelamatDatang::class.java)

            // dalam variabel ditambahkan data dengan key: name: "pengguna",
            // value diambil dari input nama pengguna
            intent.putExtra("pengguna", binding.textEmail.text.toString())

            //  activity yang baru dijalankan melalui intent
            startActivity(intent)

            // setelah intent dijalankan maka MainActivity di hapus dari backstack
        }
        else{
            Toast.makeText(this, "Salah masukkan Nama atau password.", Toast.LENGTH_SHORT).show()
            return

        }
    }
}
