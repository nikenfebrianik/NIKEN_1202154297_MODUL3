package id.showup.niken.niken_1202154297_modul3;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nikenfebriani on 24/02/18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> arrayListMenu; //Digunakan untuk Judul
    private ArrayList<String> arrayListsDesc; //Digunakan untuk Menu
    private ArrayList<Integer> gambar; //Digunakan untuk Image/Gambar

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerViewAdapter(ArrayList<String> arrayListMenu, ArrayList<String> arrayListsPrice, ArrayList<Integer> gambar) {
        this.arrayListMenu = arrayListMenu;
        this.arrayListsDesc = arrayListsPrice;
        this.gambar = gambar;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView menu, desc;
        private ImageView gambar;
        private LinearLayout ItemList;

        ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            menu = itemView.findViewById(R.id.tNama);
            desc = itemView.findViewById(R.id.tDesc);
            gambar = itemView.findViewById(R.id.imageView);
            ItemList = itemView.findViewById(R.id.item_list);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
//Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String menu = arrayListMenu.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String desc = arrayListsDesc.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final Integer image = gambar.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.menu.setText(menu);
        holder.desc.setText(desc);
        holder.gambar.setImageResource(image); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat Judul Pada List ditekan
        holder.menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //Membuat Aksi Saat List Ditekan
        holder.ItemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MenuDetailActivity.class);
                String komposisi;
                switch (position) {
                    case 0:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("desc", arrayListsDesc.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang.";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("desc", arrayListsDesc.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia.";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("desc", arrayListsDesc.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei.";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("desc", arrayListsDesc.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Cleo adalah air murni berkadar kemurnian 99,99% mengandung oksigen sampai dengan 8mg/L @ 20°C. Air Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001 mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik, misalnya chlorine dan natrium fluoride.";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("desc", arrayListsDesc.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur.";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("desc", arrayListsDesc.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "EQUIL was first bottled in 1998 at the source, Villa D'Equilibrium, and launched to the market which was then predominantly monopolized by few European brands.";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("desc", arrayListsDesc.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Evian (pengucapan bahasa Perancis: [evjɑ̃ ]) adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman.";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("desc", arrayListsDesc.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Le Minerale adalah air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari. Le Minerale, diolah dari sumber mata air pegunungan terpilih, sehingga memiliki kesegaran khas yang ditandai dengan sedikit rasa manis.";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("desc", arrayListsDesc.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Nestlé Indonesia adalah anak perusahaan Nestlé S.A., produsen makanan dan minuman terbesar di dunia yang berkantor pusat di Vevey, Swiss dan telah beroperasi selama 150 tahun.";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("desc", arrayListsDesc.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Sumber Mata Air Sumber mata air PRISTINE murni dan asli berasal dari Pegunungan Pangrango Gede,30 mil dari Jakarta Selatan ( 1.5 jam dari Jakarta Pusat),berlokasi disamping “ Taman Nasional Pangrango Gede”. Luas area Pabrik kami 3 hektar berbatasan dengan Hutan Reservasi *Gunung Pangrango (3.020 m)";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("desc", arrayListsDesc.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta.";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
