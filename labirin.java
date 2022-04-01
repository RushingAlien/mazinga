public class labirin {
    int ukuran,startx,starty;
    int labirinArray[][];
    // 0 = area bebas
    // 1 = area dilarang
    // 2 = area terlewat
    // 3 = area mulai
    // 4 = area finish
    labirin() {
        ukuran = startx = starty = 0;
    }
    boolean isStartExist() {
        return labirinArray[startx][starty] == 3;
    }
    labirin(int ukuran, int startx, int starty) {
        this.ukuran = ukuran;
        this.startx = startx;
        this.starty = starty;
        this.labirinArray = new int[ukuran][ukuran];
        this.labirinArray[this.startx][this.starty] = 3;
    }
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
        this.labirinArray = new int[ukuran][ukuran];
    }
    public void larang(int x,int y) {
        this.labirinArray[x][y] = 1;
    }
    public void setStart(int x,int y) {
        this.labirinArray[this.startx][this.starty] = 3;
    }
}