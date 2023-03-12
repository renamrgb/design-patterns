package br.com.cod3r.factory.implementionpessoal;

import br.com.cod3r.factory.implementionpessoal.factory.IphoneFactory;
import br.com.cod3r.factory.implementionpessoal.model.IPhone;

public class Main {

    public static void main(String[] args) {
        IPhone iphone = IphoneFactory.getIphone(Version.ONZE, Type.NORMAL);

        System.out.println(iphone);
    }
}
