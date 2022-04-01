public class labirin {
    int ukuran;
    int start[],finish[];
    int labirinArray[][];
    // -2 = area mulai
    // -1 = area finish
    // 0 = area bebas
    // 1 = area dilarang
    // 2 = area terlewat

    labirin() {
        ukuran = start[0] = start[1] = 0;
    }
    boolean isStartExist() {
        return labirinArray[start[0]][start[1]] == 3;
    }
    labirin(int ukuran, int x, int y) {
        this.ukuran = ukuran;
        setStart(x,y);
        this.labirinArray = new int[ukuran][ukuran];
        this.labirinArray[this.start[0]][this.start[1]] = 3;
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
        this.start[0] = x;
        this.start[1] = y;
        this.labirinArray[x][y] = 3;
    }
    public int getStartY() {
        return this.start[1];
    }
    public int getStartX() {
        return this.start[0];
    }
    public int[] getStart() {
        return this.start;
    }
    public void setFinish(int x,int y) {
        this.finish[0] = x;
        this.finish[1] = y;
        this.labirinArray[x][y] = 3;
    }
    public int getFinishY() {
        return this.finish[1];
    }
    public int getFinishX() {
        return this.finish[0];
    }
    public int valueOf(int x, int y) {
        return labirinArray[x][y];
    }
    void setValue(int x, int y, int value) {
        this.labirinArray[x][y] = value;
    }
}