package Seminar_2_4;

public interface i_My {
    int getUserID();
    default int getAdminID() {
        return 1;
    }
}
