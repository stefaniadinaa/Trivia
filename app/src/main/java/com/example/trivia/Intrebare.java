package com.example.trivia;

public class Intrebare {
    private int intrebareText;
    private boolean raspunsIntrebare;

    public Intrebare(int intrebareText, boolean raspunsIntrebare){
        this.intrebareText = intrebareText;
        this.raspunsIntrebare = raspunsIntrebare;

    }

    public int getIntrebareText() {
        return intrebareText;
    }

    public boolean isRaspunsIntrebare() {
        return raspunsIntrebare;
    }

    public void setIntrebareText(int intrebareText) {
        this.intrebareText = intrebareText;
    }

    public void setRaspunsIntrebare(boolean raspunsIntrebare) {
        this.raspunsIntrebare = raspunsIntrebare;
    }
}
