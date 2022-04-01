public class labirin {
    int ukuran,startx,starty,finishx,finishy;
    int labirinArray[][];
    // 0 = area bebas
    // 1 = area dilarang
    // 2 = area terlewat
    // 3 = area mulai
    // 4 = area finish
    // 5 = ada orang
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
    public int getUkuran() {
        return this.ukuran;
    }
    public void larang(int x,int y) {
        this.labirinArray[x][y] = 1;
    }
    public void setStart(int x,int y) {
        this.startx = x;
        this.starty = y;
        this.labirinArray[x][y] = 3;
    }
    public int getStartY() {
        return this.starty;
    }
    public int getStartX() {
        return this.startx;
    }
    public void setFinish(int x,int y) {
        this.finishx = x;
        this.finishy = y;
        this.labirinArray[x][y] = 3;
    }
    public int getFinishY() {
        return this.finishy;
    }
    public int getFinishX() {
        return this.finishx;
    }
}