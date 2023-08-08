package net.media.training.designpattern.abstractfactory;

public class IphoneFactory implements PhoneFactory{

    @Override
    public MotherBoard buildMotherBoard() {
        MotherBoard motherBoard;
        motherBoard = new IphoneMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new IphoneProcessor());
        return motherBoard;
    }

    @Override
    public Screen buildScreen() {
        Screen screen;
        screen = new IphoneScreen();
        return screen;
    }

    @Override
    public Case buildCase(MotherBoard motherBoard, Screen screen) {
        Case phoneCase;
        phoneCase = new IphoneCase();

        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);

        return phoneCase;
    }
}
