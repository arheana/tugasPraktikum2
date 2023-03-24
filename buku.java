class Book{
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahunTerbit;
    private String sinopsis;

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }

    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }

    public void setTahunTerbit(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }

    public int getTahunTerbit(int tahunTerbit){
        return tahunTerbit;
    }

    public Book(String j, String pg, String pn, int t, String s){
        judul = j;
        pengarang = pg;
        penerbit = pn;
        tahunTerbit = t;
        sinopsis =s;
    }

    public Book() {
    }

    public void isiKategori(){
        System.out.println("Judul               : " + judul);
        System.out.println("Pengarang           : " + pengarang);
        System.out.println("Penerbit            : " + penerbit);
        System.out.println("Tahun Terbit        : " + tahunTerbit);
        System.out.println("Sinopsis            : " + sinopsis);
        System.out.println("Panjang sinopsis    : " + hitungKata() + " kata");
        System.out.println("=================================================================");
    }

    public int hitungKata(){
        String[] kata = sinopsis.split("\\s+");
        return kata.length;
    }

    public void dataTeknologi(){
        Book teknologi1 = new Book(
            "Mahir Jaringan Komputer",
            "Alan Nur",
            "Gramedia",
            2013,
            "Dalam mengoperasikan komputer, mahir dalam jaringan komputer merupakan salah satu poin lebih.");
        teknologi1.isiKategori();

        Book teknologi2 = new Book(
            "Rangkaian Listrik",
            "Cekmas Cekdin",
            "Gramedia",
            2010,
            "Dalam mempelajari komputer, rangkaian listrik merupakan salah satu hal yang penting untuk dipahami.");
        teknologi2.isiKategori();

        Book teknologi3 = new Book(
            "Administrasi Jaringan Linux",
            "Wahana",
            "Gramedia",
            2012,
            "Administrasi tidak hanya ada pada keuangan, tetapi juga pada jaringan linux.");
        teknologi3.isiKategori();

        Book teknologi4 = new Book(
            "Pengantar Teknik Elektro",
            "Budi Astuti",
            "Gramedia",
            2011,
            "Buku Pengantar Teknik ELektro adalah salah satu buku yang dikhususkan sebagai dasar untuk memperlajari elektronika.");
        teknologi4.isiKategori();

        Book teknologi5 = new Book(
            "Belajar Merakit Komputer",
            "Atang Gumawang",
            "Gramedia",
            2010,
            "Merakit komputer juga memiliki tekniknya sendiri agar dapat beroperasi dengan baik.");
        teknologi5.isiKategori();
    }

    public void dataSejarah(){
        Book sejarah1 = new Book(
            "Jejak Mataram Islam",
            "Wiratna",
            "Gramedia",
            2008,
            "Kerajaan Islam memiliki banyak peninggalan sejarah, salah satunya di Mataram.");
        sejarah1.isiKategori();

        Book sejarah2 = new Book(
            "Hikayat Majapahit",
            "Oktorino",
            "Gramedia",
            2014,
            "Kerajaan Majapahit merupakan salah satu kerajaan yang memiliki sejarah panjang di Indonesia");
        sejarah2.isiKategori();

        Book sejarah3 = new Book(
            "Walisongo",
            "Noviyanti",
            "Gramedia",
            2006,
            "Walisongo sebagai sembilan tokoh penyebar agama Islam paling populer memiliki kisahnya masing-masing.");
        sejarah3.isiKategori();

        Book sejarah4 = new Book(
            "Oeang Republik Indonesia",
            "Suwito Harsono",
            "Gramedia",
            2016,
            "Mata uang di negara Indonesia memiliki banyak revolusi sebelum sampain pada rupiah seperti sekarang.");
        sejarah4.isiKategori();

        Book sejarah5 = new Book(
            "Sufisme Jawa",
            "Dr Simuh",
            "Gramedia",
            2018,
            "Unsur sufisme jawa begitu banyak, jalin menjalin menyatu secara sinkretik, dengan kepekatan tinggi. Ini menyebabkan upaya melacak hakikat sufisme jawa.");
        sejarah5.isiKategori();
    }

    public void dataPsikologi(){
        Book psikologi1 = new Book(
            "Psikologi Belajar",
            "Afi Parnawi",
            "Gramedia",
            2019,
            "Psikologi belajar adalah sebuah disiplin (cabang ilmu) psikologi yang berisi teori-teori psikologis mengenai belajar.");
        psikologi1.isiKategori();


        Book psikologi2 = new Book(
            "Psikologi Komunikasi",
            "Markus Utomo Sukendar",
            "Gramedia",
            2017,
            "Cabang Ilmu Psikologi yang membahas bagaimana manusia berinteraksi dengan manusia lainnya.");
        psikologi2.isiKategori();

        Book psikologi3 = new Book(
            "Manusia Dalam Pandangan Psikologi",
            "Pasiska",
            "Gramedia",
            2020,
            "Pandangan ini mengangkat manusia dalam derajat yang begitu tinggi, dimana manusia seakan menjadi prima-causa yang unik.");
        psikologi3.isiKategori();

        Book psikologi4 = new Book(
            "Warna-Warni Psikologi Untuk Negeri",
            "Azza",
            "Gramedia",
            2019,
            "Psikologi dalam negeri ini memiliki warna warnanya tersendiri yang sangat menarik.");
        psikologi4.isiKategori();

        Book psikologi5 = new Book(
            "Psikologi Industri dan Organisasi",
            "Hany Umama",
            "Gramedia",
            2019,
            "Psikologi industri dan organisasi memiliki peran yang penting dalam mengembangkan sumber daya manusia dan organisasi.");
        psikologi5.isiKategori();
    }

    public void dataFilsafat(){
        Book filsafat1 = new Book(
            "Studi Dasar Filsafat",
            "Tazkiyah Basa’ad",
            "Gramedia",
            2018,
            "Filsafat mempunyai sejarah yang panjang, filsafat lebih tua daripada semua ilmu. ");
        filsafat1.isiKategori();

        Book filsafat2 = new Book(
            "Filsafat Pendidikan Islam",
            "Sehat Sultoni Dalimunthe",
            "Gramedia",
            2018,
            "Filsafat pendidikan islam berkaitan dengan realitas masyarakat dan kebudayaan serta sistem sosial, ekonomi dan politiknya.");
        filsafat2.isiKategori();

        Book filsafat3 = new Book(
            "Filsafat Pendidikan Operasional",
            "Aswasulasikin",
            "Gramedia",
            2018,
            "Filsafat pendidikan merupakan sarana untuk mencapai kejelasan terhadap tantangan-tantangan pendidikan dalam berbagai dimensi kehidupan yang sesungguhnya.");
        filsafat3.isiKategori();

        Book filsafat4 = new Book(
            "Filsafat Pendidikan Vokasi",
            "Soetyono Iskandar",
            "Gramedia",
            2017,
            "Filsafat pendidikan vokasi menunjukkan garis arahan kemana pendidikan vokasi akan digerakkan atau dirancangprogramkan.");
        filsafat4.isiKategori();

        Book filsafat5 = new Book(
            "Fislafat Hukum",
            "Urip Sucipto",
            "Gramedia",
            2016,
            "Tujuan filsafat hukum adalah untuk memberikan analisis filsafat umum tentang hukum dan lembaga hukum.");
        filsafat5.isiKategori();
    }

    public void dataFiksi(){
        Book fiksi1 = new Book(
            "Imperfect",
            "Meira Anastasia",
            "Gramedia",
            2018,
            "Berkisah mengenai Rara yang terlahir dengan gen gemuk dan kulit sawo matang, warisan sang ayah.");
        fiksi1.isiKategori();

        Book fiksi2 = new Book(
            "Antologi Rasa",
            "Ika Natasya",
            "Gramedia",
            2011,
            "Antologi Rasa mengisahkan tentang empat sahabat yang saling-silang jatuh cinta.");
        fiksi2.isiKategori();

        Book fiksi3 = new Book(
            "Mariposa",
            "Luluk Hf",
            "Gramedia",
            2018,
            "Mariposa (Kupu-kupu) seperti kamu, aku mengejar tapi kamu menghindar.");
        fiksi3.isiKategori();

        Book fiksi4 = new Book(
            "Dilan 1990",
            "Pidi Baiq",
            "Gramedia",
            2014,
            "Milea bertemu dengan Dilan di sebuah SMA di Bandung setelah ia pindah dari Jakarta.");
        fiksi4.isiKategori();

        final Book fiksi5 = new Book(
            "Dear Nathan",
            "Erisca Pebriani",
            "Gramedia",
            2016,
            "Nathan dan salma yang saling bertemu, kedekatan mereka mulai mendapatkan ujian pada saat kehadiran orang yang kembali ada di kehidupan mereka.");
        fiksi5.isiKategori();
    }

    public Book bookCopy(){
        Book bookCopy = new Book(this.judul, this.pengarang, this.penerbit, this.tahunTerbit, this.sinopsis);
        bookCopy.isiKategori();
        return bookCopy;
    }
}