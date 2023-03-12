package br.com.cod3r.factory.implementionpessoal;

public interface Iphone {
    void getHardware();

    boolean is(Version version, Type type);

    Iphone getInstance();
}
