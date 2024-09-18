package Parcial1_2023_C2.E02;

public class LoungeCentral {
    private boolean isOpen = true;

    public void openLounges() {
        isOpen = true;
    }

    public void closeLounges() {
        isOpen = false;
    }
    
    public boolean isOpen() {
        return isOpen;
    }
}
