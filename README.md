# studi-kasus-aplikasi-javafx-konversi

Horas, apa kabar semua?
Semoga Anda selalu diberkati dengan kesehatan, di mana pun Anda berada.

Repo ini berisi kode program untuk video dari sesi Cemana? dengan judul Implementasi JavaFX untuk pengembangan sebuah aplikasi.
Playlist video tutorial yang memberi penjelasan tentang kode program ini dapat diakses melalui link:

<iframe width="560" height="315" src="https://www.youtube.com/embed/videoseries?list=PLqGRaSyNCMW907c8Tb67XsPerVYRVZCKg" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>


Pada seri ini akan ditunjukkan langkah per langkah pembuatan aplikasi sederhana yang menggunakan FXML serta memanfaatkan IDE Scene Builder dalam prosesnya.

Nah, aplikasi JavaFX apa yang akan kita buat pada seri Cemana? kali ini?

Aplikasi JavaFX yang dibuat ini adalah hasil pengerjaan soal UTS mata kuliah PBO semester 4 program studi D4 Teknologi Rekayasa Perangkat Lunak Institut Teknologi Del tempat saya mengajar saat ini.

Pada soal diminta membuat aplikasi konversi data, yaitu nilai dan mata uang. Alur programnya digambarkan sebagai berikut ini.

[click]
Terdapat layar Login. Pengguna harus mengisi username dan password agar dapat masuk ke halaman Dashboard. Pada layar ini terdapat pengecekan form sebelum pengecekan data otentikasi.

Jika berhasil login, maka pengguna dapat mengakses layar [click] Dashboard. Pada layar ini terdapat menu yang dapat dipilih oleh pengguna. 

Pengguna dapat mengaktifikan layar Konversi Nilai. Pada layar ini, pengguna dapat mengubah nilai berupa angka menjadi nilai berupa grade A hingga E.

Selain itu, pengguna juga dapat mengakses [click] layar Hitung IP. Pada layar ini, pengguna dapat mengisi nilai beberapa mata kuliah dan program dapat melakukan perhitungan IP dan menyampaikan hasilnya kepada pengguna.

Lalu, pengguna juga dapat mengakses layar [click] Konversi Mata Uang. Di layar ini, pengguna dapat dibantu untuk perhitungan kurs. Pada layar tersebut juga terdapat tombol untuk mengaktifikan layar grafik mata uang. 

Semua layar tersebut akan ditampilkan di bagian tengah layar Dashboard.

Beberapa fitur dan juga catatan terkait aplikasi tersebut adalah bahwa aplikasi harus memiliki menu, mengimplementasi sebuah [click] abstract class dan membuat [click] sub class-nya. Lalu [click] fitur lainnya seperti halaman biodata.

Ok, kita lanjut ke detail kode programnya.
