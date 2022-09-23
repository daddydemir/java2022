package com.company;

public class InheritanceDemo {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new TarimKrediManage());
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}

class TarimKrediManage extends BaseKrediManager{}

class OgretmenKrediManager extends BaseKrediManager{}

class BaseKrediManager{

    public void Hesapla(){
        System.out.println("Hesaplandı.");
    }
}

class KrediUI{

    public void KrediHesapla(BaseKrediManager baseKrediManager){
        System.out.println("Hesaplandı");
    }
}

class AskerKrediManager extends BaseKrediManager{}