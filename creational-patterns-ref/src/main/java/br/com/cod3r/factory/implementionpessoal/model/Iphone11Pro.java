package br.com.cod3r.factory.implementionpessoal.model;

import br.com.cod3r.factory.implementionpessoal.Iphone;
import br.com.cod3r.factory.implementionpessoal.Type;
import br.com.cod3r.factory.implementionpessoal.Version;

public class Iphone11Pro extends IPhone  implements Iphone {
    @Override
    public void getHardware() {
        System.out.println("Hardware list - Iphone11Pro");
    }

    @Override
    public boolean is(Version version, Type type) {
        return Version.ONZE == version && Type.PRO == type;
    }

    @Override
    public Iphone getInstance() {
        return new Iphone11Pro();
    }
}
