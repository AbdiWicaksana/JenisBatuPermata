package com.example.batupermata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> jbNames = new ArrayList<>();
    private ArrayList<String> jbDescription = new ArrayList<>();
    private ArrayList<String> imageUrl = new ArrayList<>();
    private ArrayList<String> jbDescriptionDetail = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        imageUrl.add("http://3.bp.blogspot.com/-8DA524bu5m8/VL1voWSmEPI/AAAAAAAADBc/ilzl4djv_GQ/s1600/Harga%2Bbatu%2Bkecubung%2Bkasihan.jpg");
        jbNames.add("Batu Kecubung");
        jbDescription.add("Batu Mineral Kuasa");
        jbDescriptionDetail.add("Batu kecubung atau ametis merupakan jenis batuan mineral kuarsa. Batu kecubung merupakan batu lahir bagi seseorang yang lahir di bulan Februari. Batu kecubung biasanya berwarna ungu sampai merah muda. Dalam sejarah, ungu merupakan warna yang digunakan oleh raja, ratu, dan anggota keluarga kerajaan lain. Karena itulah, para penguasa sering memiliki berlian yang terbuat dari batu kecubung. ecubung dalam bahasa Inggris disebut Amethyst, yang diambil bahasa Yunani kuno yang berarti tidak beracun. Konon orang-orang Yunani kuno mengenakan batu kecubung agar terhindah dari bahaya keracunan atau mabuk berat akibat minuman keras. Dalam sejarah tercatat bahwa Santo Valentino yang dikenal sebagai pelindung cinta kasih mengenakan cincin batu kecubung yang terukir gambar Cupid, dan Leonardo Da Vinci menuliskan bahwa batu kecubung mempercepat kecerdasan serta menghilangkan pikiran jahat. Dahulu harga batu kecubung sama mahalnya dengan batu rubi, sebab tingkat kelangkaannya yang tinggi. Sejak abad ke-19, setelah ditemukannya sumber batu kecubung yang cukup banyak di Brazil, harganya menjadi lebih murah.");

        imageUrl.add("http://selingkaran.com/wp-content/uploads/2014/08/batu-delima-merah-2-500x300.jpg");
        jbNames.add("Batu Delima");
        jbDescription.add("Batu Mineral Silikat");
        jbDescriptionDetail.add("Batu delima adalah sejenis mineral silikat. Terdapat sejumlah jenis batu delima yang berbeda, tergantung pada logam yang dikandungnya. Kristal batu delima yang ditemukan seringkali berukuran besar dan terlihat cantik. Warna batu delima paling umum merah atau ungu, namun bisa juga ditemukan dalam berbagai warna dan sering digunakan sebagai perhiasan. Di Amerika Serikat, batu delima adalah batu zodiak bagi orang-orang yang lahir di bulan Januari. Kehadiran batu ini di suatu daerah menunjukan disekitar tempat tersebut terdapat intan. Salah satu dari batu delima adalah batu Mirah delima, merah delima, atau batu rubi adalah batu permata berwarna merah yang dapat bervariasi antara merah muda hingga merah darah dan merupakan salah satu jenis dari mineral korundum (aluminium oksida). Warnanya terutama disebabkan oleh kromium. Namanya berasal dari buah delima yang isinya berwarna merah. Rubi alami sangat jarang, tetapi rubi buatan dapat difabrikasi dengan cukup murah. Rubi dianggap merupakan salah satu dari empat batu berharga bersama dengan safir, zamrud, dan intan.\n" + "\n" + "Harga batu rubi terutama ditentukan oleh warna. Warna merah paling berkilau dan paling bernilai dapat berharga sangat tinggi melampaui rubi lain dengan mutu yang sama. Setelah warna, berikutnya adalah kejernihan: batu yang jernih menandakan harga tinggi. ");

        imageUrl.add("https://orori-telin.akamaized.net/images.orori.com/news/2016/04/14/4b556e2dee5f91af20576a09324ef354ef344df0.jpg");
        jbNames.add("Intan");
        jbDescription.add("Mineral Kimia Berbentuk Kristal");
        jbDescriptionDetail.add("Intan adalah benda berharga mineral yang secara kimia merupakan bentuk kristal, atau alotrop, dari karbon. Intan terkenal karena memiliki sifat-sifat fisika yang istimewa, terutama faktor kekerasannya yang bisa mencapai skala kekerasan Mohs tingkat tertinggi (10) dan kemampuannya mendispersikan cahaya. Sifat-sifat ini yang membuat intan digunakan dalam perhiasan dan berbagai penerapan di dalam dunia industri.\n" + "\n" + "Intan terutama ditambang di Afrika tengah dan selatan, walaupun kandungan intan yang signifikan juga telah ditemukan di Kanada, Rusia, Brasil, dan Australia. Sekitar 130 juta \"carat\" (26.000 kg) intan ditambang setiap tahun, yang berjumlah kira-kira 9 miliar dollar Amerika Serikat. Selain itu, hampir empat kali berat intan dibuat di dalam makmal sebagai intan sintetik (synthetic diamond) yang memiliki skala kekerasan Mohs 11 (yang hanya bisa dibuat laboratorium).\n" + "Intan terutama ditambang dari pipa-pipa vulkanis, tempat kandungan intan yang berasal dari bahan-bahan yang dikeluarkan dari dalam Bumi karena tekanan dan temperaturnya sesuai untuk pembentukan intan. di Indonesia intan telah lama ditambang di kawasan Martapura, Kalimantan Selatan.\n" + "\n" + "Intan terdapat dari dalam perut bumi yang digali baik secara manual maupun dengan mekanisasi. Sekarang kebanyakan para penambang intan sudah menggunakan mekanisasi, yaitu dengan mesin penyedot untuk menyedot tanah yang sudah digali.\n" + "\n" + "Tanah yang disedot bersama air, dipilah melalui tapisan. Dengan keterampilannya, si penambang bisa membedakan batu biasa, pasir, atau intan. Intan yang baru didapat ini disebut \"galuh\" di daerah Martapura. Galuh ini masih merupakan intan mentah. Untuk menjadikannya siap pakai, intan harus digosok terlebih dahulu. Penggosokan intan yang ada di masyarakat sebagian besar masih dengan alat tradisional. ");

        imageUrl.add("https://rawa-bening.com/3045-13392-large_default/grey-green-chalcedony-1180-carat.jpg");
        jbNames.add("Chalcedony");
        jbDescription.add("Kriptokristal dari Silika");
        jbDescriptionDetail.add("Batu Chalcedony adalah spesies batu permata yang termasuk ke dalam kelompok mineral Quartz. Secara teknis, Chalcedony adalah istilah Gemologi untuk semua jenis Quartz dalam bentuk Cryptocrystalline, yang bisa memiliki beragam warna, ukuran, dan pola. Namun, saat ini istilah “Chalcedony” paling sering digunakan untuk mereferensikan jenis yang lebih spesifik dari Cryptocrystalline Quartz, sering disebut sebagai “Actual Chalcedony” atau “Chalcedony yang sebenarnya”, atau “Chalcedony dalam arti sempit”. Untungnya, untuk meminimalkan kebingungan, sebagian varietas lain dari Cryptocrystalline Quartz diperdagangkan menggunakan nama dagang individu mereka sendiri, seperti Banded Agate, Carnelian, atau Jasper. Batu Chalcedony bisa dikenali melalui sifat tembus cahayanya, kesolidan warna terangnya, biasanya mulai dari kebiruan sampai putih atau abu-abu. Di Indonesia, batu ini biasa disebut dengan nama batu Akik Yaman, Spiritus, atau Lavender.\n" + "\n" + "Cryptocrystalline Quartz adalah bentuk padat dari silica, yang berarti memiliki kristalisasi yang sangat halus. Bahkan, kebanyakan kristal Cryptocrystalline sangat halus sehingga partikel-partikelnya bahkan tidak bisa dilihat di bawah mikroskop. Beberapa material Cryptocrystalline mungkin di-subklasifikasikan lagi sebagai “Microcrystalline”, yang mengacu pada material Cryptocrystalline dengan kristal yang sedikit lebih besar (bisa dilihat ketika diiris tipis dan diamati di bawah mikroskop polarisasi).");

        imageUrl.add("https://storage.googleapis.com/manfaat/2017/11/756d0837-manfaat-batu-giok-aceh.jpg");
        jbNames.add("Giok");
        jbDescription.add("Batu Permata Berwarna Hijau");
        jbDescriptionDetail.add("Giok atau jade adalah salah satu dari jenis batu permata berwarna hijau yang di dalamnya terdiri dari banyak unsur mineral yang telah ditemukan dan digunakan oleh bangsa timur selama beribu-ribu tahun lalu.\n" + "\n" + "Pada saat ini batu giok banyak yang berasal dari daerah Tibet, Tiongkok dan Birma sebagai komoditas ekspor. Giok juga dipercaya berkhasiat membuat ketenangan, kegembiraan dan kesehatan, keselamatan. Selama perjalanan sejarah setelah ditemukan, giok telah dikenal sebagai asesoris dan perhiasan selama ribuan tahun yang lalu oleh peradaban manusia. Bahkan juga diagungkan sebagai \"batu penyelamat\" bahkan sebagai \"batu kesehatan\" oleh suku-suku bangsa di Asia Timur dan di benua Afrika ataupun Amerika termasuk oleh suku Maya dan Inca.\n" + "\n" + "Bahkan dalam dunia medis dewasa ini juga dipercaya dapat meningkatkan kesehatan yang juga telah dipakai dalam peradaban manusia pada ribuan tahun lalu. Hal ini banyak tercatat dalam banyak buku kesehatan kuno dan diakui sebagai salah satu sumber energi alam. Dalam dunia kesehatan, batu ini banyak digunakan untuk meningkatkan sirkulasi darah, anti penuaan dini, meningkatkan kekebalan tubuh dan menghilangkan keletihan. Batu giok juga banyak dipakai pada saat terapi pijat ceragem. Selain itu dalam penyelidikan menunjukkan bahwa batu giok mengandung banyak elemen penting seperti kalsium, potasium, besi dan magnesium. ");

        imageUrl.add("http://cdn2.tstatic.net/manado/foto/bank/images/batu-kuarsa222_20150519_220054.jpg");
        jbNames.add("Kuarsa");
        jbDescription.add("Mineral Kimia berbentuk Silika Trigonal");
        jbDescriptionDetail.add("Kuarsa adalah senyawa kimia yang terdiri dari satu bagian silikon dan dua bagian oksigen atau biasa disebut silikon dioksida (SiO2). Kuarsa merupakan mineral yang paling berlimpah ditemukan di permukaan bumi dan sifatnya yang unik dapat membuatnya menjadi salah satu mineral yang paling berguna.\n" + "\n" + "Kuarsa sangat tahan terhadap pelapukan mekanik dan kimia. Daya tahan inilah yang membuat mineral ini banyak ditemukan di puncak gunung, pantai, sungai, dan gurun pasir. Kuarsa dapat hadir dimana-mana, berlimpah dan resisten. Tambang deposit kuarsa banyak ditemukan di seluruh dunia.\n" + "Kuarsa memiliki sifat listrik dan tahan panas yang membuatnya berguna dalam produk elektronik. Kuarsa sering memiliki warna yang berkilau dan \"diaphaneity\", membuatnya berguna sebagai batu permata dan juga bahan pembuatan kaca. Kristal kuarsa dapat digunakan untuk tujuan khusus. Kristal kuarsa yang berkualitas tinggi adalah silika kristal tunggal dengan sifat optik ataupun elektronik. Para ahli memperkirakan ada sekitar sepuluh miliar kristal kuarsa digunakan setiap tahun.");

        imageUrl.add("https://cdn3.volusion.com/rwhao.mcoqv/v/vspfiles/photos/SNOWPEARL-2.jpg");
        jbNames.add("Mutiara");
        jbDescription.add("Jaringan Lunak Moluska Hidup");
        jbDescriptionDetail.add("Mutiara adalah suatu benda keras yang diproduksi di dalam jaringan lunak (khususnya mantel) dari moluska hidup. Sama seperti cangkang-nya, mutiara terdiri dari kalsium karbonat dalam bentuk kristal yang telah disimpan dalam lapisan-lapisan konsentris. Mutiara yang ideal adalah yang berbentuk sempurna bulat dan halus, tetapi ada juga berbagai macam bentuk lain. Mutiara alami berkualitas terbaik telah sangat dihargai sebagai batu permata dan objek keindahan selama berabad-abad, dan oleh karena itu, kata \"mutiara\" telah menjadi metafora untuk sesuatu yang sangat langka, baik, mengagumkan, dan berharga.\n" + "\n" + "Mutiara pertama kali di gunakan oleh raja yunani xerxes. pada saat itu harga mutiara sama dengan harga kepala manusia, mutiara pada saat itu dipercaya sebaga jimat yang membawa keberuntungan di saat perang dan juga obat yang dapat menyembuhkan penyakit. Hampir semua moluska bercangkang bisa menghasilkan beberapa jenis mutiara, melalui proses alami, ketika suatu objek mikroskopis terperangkap di dalam mantel lipatan moluska, tetapi sebagian besar dari mutiara tidak dihargai sebagai batu permata. ");

        setActionBarTitle("Mode List");
        initRecyclerList();

    }

    private void initRecyclerList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter adapter = new ListAdapter(this, jbNames, imageUrl, jbDescription, jbDescriptionDetail);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridAdapter adapter = new GridAdapter(this, jbNames, imageUrl, jbDescription, jbDescriptionDetail);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter adapter = new CardViewAdapter(this, jbNames, imageUrl, jbDescription, jbDescriptionDetail);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                initRecyclerList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                showRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}