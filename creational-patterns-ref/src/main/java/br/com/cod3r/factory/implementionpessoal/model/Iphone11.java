package br.com.cod3r.factory.implementionpessoal.model;

import br.com.cod3r.factory.implementionpessoal.Iphone;
import br.com.cod3r.factory.implementionpessoal.Type;
import br.com.cod3r.factory.implementionpessoal.Version;

public class Iphone11 extends IPhone implements Iphone {
    @Override
    public void getHardware() {
        System.out.println("Hardware list - Iphone11");
    }

    @Override
    public boolean is(Version version, Type type) {
        return version == Version.ONZE && type == Type.NORMAL;
    }

    @Override
    public Iphone getInstance() {
        return  new Iphone11();
    }
}
