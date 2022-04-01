public class peserta {
    String nama;
    CSLL<Integer> jalur = new CSLL<>();
    String[] polaJalur;
    int Currentx,Currenty;
    labirin labirin;

    peserta(labirin labirin) {
        labirin = new labirin();
        this.nama = null;
        this.jalur = null;
        this.polaJalur = new String[4];
    }
    void setPosition(int x,int y) {
        Currentx = x;
        Currenty = y;
        labirin.labirinArray[Currentx][Currenty] = 5;
        jalur.addLast(labirin.labirinArray[Currentx][Currenty]);
    }
    void gerakAtas() {
        
    }
}
