package net.media.training.designpattern.abstractfactory;

public class AndroidPhoneFactory implements PhoneFactory{
    @Override
    public MotherBoard buildMotherBoard() {
        MotherBoard motherBoard;
        motherBoard = new AndroidMotherBoard();

        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new AndroidProcessor());
        return motherBoard;
    }

    @Override
    public Screen buildScreen() {
        Screen screen;
        screen = new AndroidScreen();
        return screen;
    }

    @Override
    public Case buildCase(MotherBoard motherBoard, Screen screen) {
        Case phoneCase;
        phoneCase = new AndroidCase();

        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);

        return phoneCase;
    }
}
