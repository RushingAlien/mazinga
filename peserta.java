public class peserta {
    String nama;
    CSLL<int[]> jalur = new CSLL<>();
    String[] polaJalur;
    int Current[], safe[];
    labirin labirin;
    

    peserta(labirin labirin) {
        labirin = new labirin();
        this.nama = null;
        this.jalur = null;
        this.polaJalur = new String[4];
        this.Current = new int[2];
    }

    void setPosition(int x,int y) {
        Current[0] = x;
        Current[1] = y;
        jalur.addLast(Current);
    }

    boolean isSafe() {
        return labirin.valueOf(Current[0]-1, Current[1]) < 1 && Current[0]-1 < labirin.getUkuran() && Current[0]-1 >=0 || labirin.valueOf(Current[0]+1, Current[1]) < 1 && Current[0]+1 < labirin.getUkuran() && Current[0]+1 >=0 || labirin.valueOf(Current[0], Current[1]-1) < 1 && Current[1]-1 < labirin.getUkuran() && Current[1]-1 >=0 || labirin.valueOf(Current[0], Current[1]+1) < 1 && Current[1]+1 < labirin.getUkuran() && Current[1]+1 >=0 ;
    }

    void setSafe() {
        safe[0] = Current[0];
        safe[1] = Current[1];
    }
    void gerakAtas() {
        if (labirin.valueOf(Current[0], Current[1]-1) >= 1) {
            return;
        } else {
            labirin.setValue(Current[0], Current[1], 1);
            Current[1]=Current[1]-1;
            setPosition(Current[0], Current[1]);
        }
    }
    void gerakKiri() {
        if (labirin.valueOf(Current[0]-1, Current[1]) >= 1) {
            return;
        } else {
            labirin.setValue(Current[0], Current[1], 1);
            Current[0]=Current[0]-1;
            setPosition(Current[0], Current[1]);
        }
    }
    void gerakKanan() {
        if (labirin.valueOf(Current[0], Current[1]+1) >= 1) {
            return;
        } else {
            labirin.setValue(Current[0], Current[1], 1);
            Current[0]=Current[0]+1;
            setPosition(Current[0], Current[1]);
        }
    }
    void gerakBawah() {
        if (labirin.valueOf(Current[0], Current[1]-1) >= 1) {
            return;
        } else {
            labirin.setValue(Current[0], Current[1], 1);
            Current[1]=Current[1]+1;
            setPosition(Current[0], Current[1]);
        }
    }
    void findJalur() {
        while (labirin.valueOf(Current[0], Current[1]) != 3) {
            for(int i=0; i<4; i++) {
                if (i==3) {
                    switch (polaJalur[i]) {
                        case "ATAS":
                            gerakAtas();
                            break;
                        case "BAWAH":
                            gerakBawah();
                            break;
                        case "KIRI":
                            gerakKiri();
                            break;
                        case "KANAN":
                            gerakBawah();
                            break;
                        default:
                            break;
                    }
                } else {
                    switch (polaJalur[i]) {
                        case "ATAS":
                            gerakAtas();
                            break;
                        case "BAWAH":
                            gerakBawah();
                            break;
                        case "KIRI":
                            gerakKiri();
                            break;
                        case "KANAN":
                            gerakBawah();
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }
}
