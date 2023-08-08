package net.media.training.designpattern.abstractfactory;

public interface PhoneFactory {
    MotherBoard buildMotherBoard();
    Screen buildScreen();
    Case buildCase(MotherBoard motherBoard, Screen screen);
}
