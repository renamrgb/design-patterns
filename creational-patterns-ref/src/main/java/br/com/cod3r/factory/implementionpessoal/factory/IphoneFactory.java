package br.com.cod3r.factory.implementionpessoal.factory;

import br.com.cod3r.factory.implementionpessoal.Iphone;
import br.com.cod3r.factory.implementionpessoal.Type;
import br.com.cod3r.factory.implementionpessoal.Version;
import br.com.cod3r.factory.implementionpessoal.model.IPhone;
import br.com.cod3r.factory.implementionpessoal.model.Iphone11;
import br.com.cod3r.factory.implementionpessoal.model.Iphone11Pro;
import br.com.cod3r.factory.implementionpessoal.model.Iphone11ProMax;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IphoneFactory {

    private static final List<Iphone> implementatios;

    static {
        implementatios = new ArrayList<>();
        implementatios.add(new Iphone11());
        implementatios.add(new Iphone11Pro());
        implementatios.add(new Iphone11ProMax());
    }

    public static IPhone getIphone(Version version, Type type) {
        return (IPhone) implementatios
                .stream()
                .filter(imp -> imp.is(version, type))
                .peek(Iphone::getHardware)
                .findFirst()
                .map(Iphone::getInstance)
                .orElse(new Iphone11());
    }
}
