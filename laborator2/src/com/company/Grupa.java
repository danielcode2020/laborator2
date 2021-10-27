package com.company;

public class Grupa {
    private String nume;
    private int an;
    private int numarStudenti;
    private boolean buget;
    private String limbaStudii;

    // constructor
    Grupa (String nume, int an, int numarStudenti,boolean buget, String limbaStudii)
    {
        this.nume = nume;
        this.an = an;
        this.numarStudenti = numarStudenti;
        this.buget = buget;
        this.limbaStudii = limbaStudii;
    }

    // getteri
    public String getNume()
    {
        return nume;
    }
    public int getAn()
    {
        return an;
    }
    public int getNumarStudenti()
    {
        return numarStudenti;
    }
    public boolean getBuget()
    {
        return buget;
    }
    public String getLimbaStudii()
    {
        return limbaStudii;
    }

    //setteri
    public void setNume(String nume)
    {
        this.nume = nume;
    }
    public void setAn(int an)
    {
        this.an = an;
    }
    public void setNumarStudenti(int numarStudenti)
    {
        this.numarStudenti = numarStudenti;
    }
    public void setBuget(boolean buget)
    {
        this.buget = buget;
    }
    public void setLimbaStudii(String limbaStudii)
    {
        this.limbaStudii = limbaStudii;
    }

    public void print()
    {
        System.out.println("Numele grupei : " + nume + "\n Anul : " + an + "\n Nr studenti : " + numarStudenti + "\n Buget : " + buget + "\n Limba de studii : " +limbaStudii);
    }



}
