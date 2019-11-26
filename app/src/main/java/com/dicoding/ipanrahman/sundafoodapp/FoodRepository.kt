package com.dicoding.ipanrahman.sundafoodapp

import java.util.ArrayList

/**
 * @author Ipan Taupik Rahman
 */
class FoodRepository {
    private val foodNames = arrayOf(
        "Nasi Liwet",
        "Nasi Timbel",
        "Karedok",
        "Lotek",
        "Soto Bandung",
        "Soto Mie",
        "Mie Kocok",
        "Sate Maranggi",
        "Empal Gentong",
        "Kupat Tahu",
        "Surabi",
        "Tahu Sumedang",
        "Tahu Gejrot",
        "Peuyeum",
        "Dodol Garut",
        "Galendo",
        "Gemblong",
        "Opak",
        "Batagor",
        "Gepuk",
        "Tutut"
    )

    private val foodDescriptions = arrayOf(
        "Nasi Liwet merupakan makanan yang sangat sering disajikan saat acara kumpul-kumpul. Nasi Liwet juga akrab disajikan dengan tambahan ikan teri, daun serai, tahu, dan juga ayam goreng.\n" +
                "\n" +
                "Yang unik dari Nasi Liwet adalah rasa nasinya yang sedikit manis dan kental dengan wangi santen kelapa kental.",
        "Sajian dari Nasi Timbel sendiri agak mirip dengan sajian dari Nasi Liwet. Hanya saja, Nasi Timbel umumnya disajikan dengan bungkusan daun pisang.\n" +
                "\n" +
                "Untuk menikmati hidangan ini, dapat menambahkan sayur asam ataupun ikan asin.",
        "Banyak yang salah mengira hidangan Karedok dengan Gado-Gado dan Lotek jika baru pertama kali melihat. Karedok adalah makanan khas Sunda yang disajikan dengan sayur-sayuran mentah. Yang membedakan Karedok dengan kedua hidangan mirip lainnya adalah siraman bumbu kacang yang melimpah.\n" +
                "\n" +
                "Karedok juga dilengkapi dengan tambahan kerupuk bawang di atasnya.",
        "Ini dia makanan hidangan yang hampir sama dengan Karedok. Sama-sama menggunakan bumbu kacang dan kerupuk, Lotek lebih menyajikan sayur-sayuran rebus seperti bayam, kapri, dan kacang panjang.\n" +
                "\n" +
                "Lotek dapat dinikmati bersamaan dengan lontong, nasi, ataupun mi",
        "Soto Bandung umumnya menggunakan daging sapi has dalam atau tetelan.\n" +
                "\n" +
                "Yang membedakan Soto Bandung dari yang lainnya adalah penambahan kacang kedelai goreng dan juga lobak di kuahnya.",
        "Soto Mie bukanlah merupakan nama masakan yang jarang terdengar. Kemanapun kotanya, tetap dapat menemukan Soto Mie. Soto Mie sendiri adalah jenis masakan khas Sunda yang menyajikan mie dengan kuah kaldu yang kental.\n" +
                "\n" +
                "Umumnya, Soto Mie menggunakan tambahan tauge dan kacang kedelai goreng untuk menambahkan sedikit rasa manis.",
        "Jika sering jalan-jalan ke Bandung, tentunya makanan Mie Kocok tidak asing bagi. Mie Kocok menggunakan mie pipih telur dengan kuah kaldu dan kikil.",
        "Makanan Sunda kali ini ketenarannya memang sudah mendunia. Sate Maranggi yang khas menggunakan daging sapi atau ayam ini sebenarnya mempunyai asal usul yang cukup menarik.\n" +
                "\n" +
                "Awalnya, Sate Maranggi adalah makanan asing dari para pendatang China yang menetap di Indonesia. Daging yang awalnya digunakan pun adalah daging babi. Makanan ini juga mempunyai cita rasa yang sangat kuat akibat cara pemasakannya. Daging biasanya direndam di bumbu sebelum dibakar.",
        "Berbeda dari empal lainnya, Empal Gentong dimasak dengan menggunakan kayu bakar dan gentong. Bahan utamanya juga berupa daging, usus, dan babat sapi.\n" +
                "\n" +
                "Empal Gentong dihidangkan dengan nasi atau lontong, dan kucai. Empal Gentong juga terasa nikmat jika dimakan dengan kuah santan.",
        "Kupat Tahu dapat temukan dengan mudah di kota asalnya yakni Magelang, Suraparta, dan Singaparna. Dari segi visual, makanan tradisional khas Sunda ini sangat mirip dengan Tahu Gimbal dari kota Semarang.\n" +
                "\n" +
                "Kupat dan tahu dipotong-potong dan disajikan dengan kol, tauge, dan seledri sebelum semuanya diguyur oleh bumbu kacang. Bumbu kacang yang digunakan juga mempunyai 2 varian yakni bumbu kacang halus dan bumbu dengan kacang yang sengaja digiling secara kasar.",
        "Surabi adalah semacam kue pancake yang sebagian besarnya menggunakan tepung beras dan santan. Kue tradisional Sunda ini sangat populer di kota Bandung. Awalnya, Surabi hanya disajikan dengan tambahan irisan kelapa, tapi sekarang sudah banyak yang mencampurkan Surabi dengan coklat, vanila, dan bahkan oncom.",
        "Kuliner khas Sunda selanjutnya adalah Tahu Sumedang. Berbeda dari tahu goreng biasa, Tahu Sumedang mempunyai tekstur yang khas. Ketika dimakan, kulit Tahu Sumedang yang renyah dan kering bercampur dengan tekstur dalamnya yang sangat lembut.\n" +
                "\n" +
                "Namun, untuk menikmati sensasi makan yang maksimal, Tahu Sumedang sebaiknya dimakan ketika masih hangat. Kulit Tahu Sumedang yang ditinggal hingga dingin tidak lagi akan terasa renyah.",
        "Satu lagi tahu khas Sunda yang terkenal di kalangan masakan khas Sunda adalah Tahu Gejrot. Tahu Gejrot ini berasal dari Cirebon. Umumnya, Tahu Gejrot dimakan dengan kuah pedas.\n" +
                "\n" +
                "Berbeda dari Tahu Sumedang yang isinya penuh, Tahu Gejrot mempunyai isi yang agak kosong. Tujuannya adalah supaya kuah dan bumbu-bumbu cair lainnya dapat terserap ke dalam tahu lebih cepat.",
        "Peuyeum seringkali disama-samakan dengan Tapai Singkong karena sama-sama hasil fermentasi. Sebenarnya, perbedaan antara Peyeum dan Tapai Singkong tidak terlalu jauh. Hanya saja, Peuyeum bersifat lebih tahan lama karena kurang berair.\n" +
                "\n" +
                "Kuliner khas Sunda ini dibuat dari singkong yang sudah dipotong dan direndam sampai setengah matang.",
        "Cemilan khas Sunda ini mempunyai banyak jenis mulai dari dodol nanas, dodol, dodol wijen, dan dodol kacang. Yang membedakan Dodol Garut adalah tekstur dan kelegitannya.",
        "Galendo adalah camilan tradisional khas Sunda dari Ciamis yang menggunakan kelapa sebagai bahan utamanya. Kelapa di olah hingga menjadi serbuk yang kemudian di-press. Saat ini sudah ada beberapa rasa Galendo yang disesuaikan untuk lidah anak muda. Namun, jika ingin mencoba rasa original Galendo, hanya bisa menemukannya di beberapa toko tertentu saja.",
        "Opak adalah camilan tradisional Jawa Barat renyah semacam kerupuk yang terbuat dari tepung beras yang dibumbuhi. Adonan Opak yang telah diolah dan dibumbuhi akhirnya bertekstur agak lunak. Adonan juga dipotong tipis-tipis dan dikeringkan hingga kering.",
        "Makanan khas Banten ini terbuat dari cengkeh dan bawang merah yang dicampuri dengan cabe cengek dan daun salam. Bahan utama dari Gerem Asem adalah ayam atau bebek.\n" +
                "\n" +
                "Karena banyaknya cabe dan perisa-perisa pedas yang digunakan, Gerem Asem pun mempunyai rasa pedas yang maksimal. Namun, kepedasan makanan Banten ini tidak akan membuat sakit perut.",
        "Bakso Tahu Goreng atau Batagor adalah makanan khas Bandung yang awalnya adalah pengaruh dari keturunan Tiong Hoa. Batagor terdiri dari siomay goreng dan tahu yang berisi ikan tenggiri.\n" +
                "\n" +
                "Batagor sudah bukan merupakan makanan asing lagi, khususnya bagi orang-orang yang tinggal di kota-kota besar. Umumnya, Batagor dijual dan disajikan dengan bumbu kacang, kecap, dan jeruk nipis.",
        "Gepuk merupakan makanan khas Sunda dari Jawa Barat. Keunikan Gepuk terlihat dari cara pembuatannya. Daging sapi direbus hingga setengah matang dan dipukul untuk menjadi semakin empuk. Kemudian, daging sapi di celupkan ke dalam adonan bumbu yang sudah disiapkan sebelum kembali direbus hingga matang.",
        "Tidak hanya sebatas sapi, ayam, bebek, dan babi saja, orang Indonesia juga mengkonsumsi keong sawah (tutut) atau siput air tawar. Siput air tawar ini direbus dan dibumbui dengan rempah yang agak pedas. Tutut juga merupakan makanan khas Jawa Barat yang kaya protein."
    )

    private val foodsImages = intArrayOf(
        R.drawable.nasi_liwet,
        R.drawable.nasi_timbel,
        R.drawable.karedok,
        R.drawable.lotek,
        R.drawable.soto_bandung,
        R.drawable.soto_mie,
        R.drawable.mie_kocok,
        R.drawable.sate_maranggi,
        R.drawable.empal_gentong,
        R.drawable.kupat_tahu,
        R.drawable.surabi,
        R.drawable.tahu_sumedang,
        R.drawable.tahu_gejrot,
        R.drawable.peuyeum,
        R.drawable.dodol_garut,
        R.drawable.galendo,
        R.drawable.gemblong,
        R.drawable.opak,
        R.drawable.batagor,
        R.drawable.gepuk,
        R.drawable.tutut
    )

    fun getListData(): List<Food> {
        val list = ArrayList<Food>()
        for (position in foodNames.indices) {
            val film = Food(
                title = foodNames[position],
                description = foodDescriptions[position],
                photo = foodsImages[position]
            )
            list.add(film)
        }
        return list
    }
}