package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {


    public Case buildPhone(String phoneType) {
        PhoneFactory factory;
        if (phoneType.equals("Android")) {
            factory = new AndroidPhoneFactory();
        } else {
            factory = new IphoneFactory();
        }
        return factory.buildCase(factory.buildMotherBoard(), factory.buildScreen());
    }
}