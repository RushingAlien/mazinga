public class peserta {
    String nama;
    CSLL<Integer> jalur = new CSLL<>();
    String[] polaJalur = new String[4];

    peserta() {
        this.nama = null;
        this.jalur = null;
        this.polaJalur = new String[4];
    }

    void gerak(labirin labirin) {
        for (String x : polaJalur) {
            switch (x) {
                case "ATAS":
                    break;
                case "BAWAH":
                    break;
                case "KIRI":
                    break;
                case "KANAN":
                default:
                    break;
            }
        }
    }
}
