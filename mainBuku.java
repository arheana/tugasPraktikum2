import java.util.Scanner;

public class mainBuku {
    public static void main(String[] args) {
        Book book = new Book();

        Scanner input = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI PERPUSAT");
        System.out.println("Apa yang ingin anda lakukan?");
        System.out.println("1. Melihat daftar buku");
        System.out.println("2. Menyalin buku");
        System.out.print("Masukkan pilihanmu : ");
        int pilihan = input.nextInt();
        System.out.println("=======================================================");
        System.out.println();

        if (pilihan == 1){
            System.out.println("Pilih kategori buku yang tersedia:\n1. Teknologi\n2. Sejarah\n3. Filsafat\n4. Psikologi\n5. FIksi");
            System.out.print("Masukkan pilihanmu  : ");
            int kategori = input.nextInt();
            System.out.println("=======================================================");
            System.out.println();

            switch(kategori) {
                case 1:
                System.out.println("Berikut kami tampilkan buku-buku tentang teknologi.");
                book.dataTeknologi();
                break;
    
                case 2:
                System.out.println("Berikut kami tampilkan buku-buku tentang sejarah.");
                book.dataSejarah();
                break;
    
                case 3:
                System.out.println("Berikut kami tampilkan buku-buku tentang filsafat.");
                book.dataFilsafat();
                break;
    
                case 4:
                System.out.println("Berikut kami tampilkan buku-buku tentang psikologi.");
                book.dataPsikologi();
                break;
    
                case 5:
                System.out.println("Berikut kami tampilkan buku-buku tentang fiksi.");
                book.dataFiksi();
                break;
    
                default:
                System.out.println("Pilihan anda tidak sesuai kategori.");
            }
        } else {
            System.out.println("Pilih kategori buku yang ingin disalin:\n1. Teknologi\n2. Sejarah\n3. Filsafat\n4. Psikologi\n5. FIksi");
            System.out.print("Masukkan pilihanmu  : ");
            int copyKategori = input.nextInt();
            System.out.println("=======================================================");
            System.out.println();

            switch(copyKategori){
                case 1:
                System.out.println("Berikut data buku-buku teknologi yang sudah disalin:");
                Book teknologi1 = new Book("Mahir Jaringan Komputer","Alan Nur","Gramedia",2013,"Dalam mengoperasikan komputer, mahir dalam jaringan komputer merupakan salah satu poin lebih.");
                teknologi1.bookCopy();

                Book teknologi2 = new Book("Rangkaian Listrik","Cekmas Cekdin","Gramedia",2010,"Dalam mempelajari komputer, rangkaian listrik merupakan salah satu hal yang penting untuk dipahami.");
                teknologi2.bookCopy();
                
                Book teknologi3 = new Book("Administrasi Jaringan Linux","Wahana","Gramedia",2012,"Administrasi tidak hanya ada pada keuangan, tetapi juga pada jaringan linux.");
                teknologi3.bookCopy();

                Book teknologi4 = new Book("Pengantar Teknik Elektro","Budi Astuti","Gramedia",2011,"Buku Pengantar Teknik ELektro adalah salah satu buku yang dikhususkan sebagai dasar untuk memperlajari elektronika.");
                teknologi4.bookCopy();

                Book teknologi5 = new Book("Belajar Merakit Komputer","Atang Gumawang","Gramedia",2010,"Merakit komputer juga memiliki tekniknya sendiri agar dapat beroperasi dengan baik.");
                teknologi5.bookCopy();
                break;

                case 2:
                Book sejarah1 = new Book("Jejak Mataram Islam","Wiratna","Gramedia",2008,"Kerajaan Islam memiliki banyak peninggalan sejarah, salah satunya di Mataram.");
                sejarah1.bookCopy();

                Book sejarah2 = new Book("Hikayat Majapahit","Oktorino","Gramedia",2014,"Kerajaan Majapahit merupakan salah satu kerajaan yang memiliki sejarah panjang di Indonesia");
                sejarah2.bookCopy();

                Book sejarah3 = new Book("Walisongo","Noviyanti","Gramedia",2006,"Walisongo sebagai sembilan tokoh penyebar agama Islam paling populer memiliki kisahnya masing-masing.");
                sejarah3.bookCopy();

                Book sejarah4 = new Book( "Oeang Republik Indonesia","Suwito Harsono","Gramedia",2016,"Mata uang di negara Indonesia memiliki banyak revolusi sebelum sampain pada rupiah seperti sekarang.");
                sejarah4.bookCopy();

                Book sejarah5 = new Book( "Sufisme Jawa","Dr Simuh","Gramedia",2018,"Unsur sufisme jawa begitu banyak, jalin menjalin menyatu secara sinkretik, dengan kepekatan tinggi. Ini menyebabkan upaya melacak hakikat sufisme jawa.");
                sejarah5.bookCopy();
                break;

                case 3:
                Book psikologi1 = new Book("Psikologi Belajar","Afi Parnawi","Gramedia",2019,"Psikologi belajar adalah sebuah disiplin (cabang ilmu) psikologi yang berisi teori-teori psikologis mengenai belajar.");
                psikologi1.bookCopy();

                Book psikologi2 = new Book("Psikologi Komunikasi","Markus Utomo Sukendar","Gramedia",2017,"Cabang Ilmu Psikologi yang membahas bagaimana manusia berinteraksi dengan manusia lainnya.");
                psikologi2.bookCopy();

                Book psikologi3 = new Book("Manusia Dalam Pandangan Psikologi","Pasiska","Gramedia",2020,"Pandangan ini mengangkat manusia dalam derajat yang begitu tinggi, dimana manusia seakan menjadi prima-causa yang unik.");
                psikologi3.bookCopy();

                Book psikologi4 = new Book("Warna-Warni Psikologi Untuk Negeri","Azza","Gramedia",2019,"Psikologi dalam negeri ini memiliki warna warnanya tersendiri yang sangat menarik.");
                psikologi4.bookCopy();

                Book psikologi5 = new Book("Psikologi Industri dan Organisasi","Hany Umama","Gramedia",2019,"Psikologi industri dan organisasi memiliki peran yang penting dalam mengembangkan sumber daya manusia dan organisasi.");
                psikologi5.bookCopy();
                break;

                case 4:
                Book filsafat1 = new Book("Studi Dasar Filsafat","Tazkiyah Basa’ad","Gramedia",2018,"Filsafat mempunyai sejarah yang panjang, filsafat lebih tua daripada semua ilmu. ");
                filsafat1.bookCopy();

                Book filsafat2 = new Book("Filsafat Pendidikan Islam","Sehat Sultoni Dalimunthe","Gramedia",2018,"Filsafat pendidikan islam berkaitan dengan realitas masyarakat dan kebudayaan serta sistem sosial, ekonomi dan politiknya.");
                filsafat2.bookCopy();

                Book filsafat3 = new Book("Filsafat Pendidikan Operasional","Aswasulasikin","Gramedia",2018,"Filsafat pendidikan merupakan sarana untuk mencapai kejelasan terhadap tantangan-tantangan pendidikan dalam berbagai dimensi kehidupan yang sesungguhnya.");
                filsafat3.bookCopy();

                Book filsafat4 = new Book("Filsafat Pendidikan Vokasi","Soetyono Iskandar","Gramedia",2017,"Filsafat pendidikan vokasi menunjukkan garis arahan kemana pendidikan vokasi akan digerakkan atau dirancangprogramkan.");
                filsafat4.bookCopy();

                Book filsafat5 = new Book("Fislafat Hukum", "Urip Sucipto","Gramedia",2016,"Tujuan filsafat hukum adalah untuk memberikan analisis filsafat umum tentang hukum dan lembaga hukum.");
                filsafat5.bookCopy();
                break;

                case 5:
                Book fiksi1 = new Book("Imperfect","Meira Anastasia","Gramedia",2018,"Berkisah mengenai Rara yang terlahir dengan gen gemuk dan kulit sawo matang, warisan sang ayah.");
                fiksi1.bookCopy();

                Book fiksi2 = new Book("Antologi Rasa","Ika Natasya","Gramedia",2011,"Antologi Rasa mengisahkan tentang empat sahabat yang saling-silang jatuh cinta.");
                fiksi2.bookCopy();

                Book fiksi3 = new Book("Mariposa","Luluk Hf","Gramedia",2018,"Mariposa (Kupu-kupu) seperti kamu, aku mengejar tapi kamu menghindar.");
                fiksi3.bookCopy();

                Book fiksi4 = new Book("Dilan 1990","Pidi Baiq","Gramedia",2014,"Milea bertemu dengan Dilan di sebuah SMA di Bandung setelah ia pindah dari Jakarta.");
                fiksi4.bookCopy();

                Book fiksi5 = new Book("Dear Nathan","Erisca Pebriani","Gramedia",2016,"Nathan dan salma yang saling bertemu, kedekatan mereka mulai mendapatkan ujian pada saat kehadiran orang yang kembali ada di kehidupan mereka.");
                fiksi5.bookCopy();
                break;

                default:
                System.out.println("Tidak ada buku yang bisa disalin.");
            }
        }
    }
}
