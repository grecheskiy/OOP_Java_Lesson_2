package Seminar_2_6;

public interface i_4 {
    int getCatID();
    default int getOwnerID() {
        return 1;
    }
}
