package controller;

public class Smartphone implements ITelephone, IWebBrowser, IMusicPlayer {
    @Override
    public void selectMusic(String music) {
        System.out.println("Music selected: " + music);
    }

    @Override
    public void playMusic() {
        System.out.println("Music playing");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped");
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println("Answering call");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voice mail");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Dialing " + phoneNumber);
    }

    @Override
    public void powerOn() {
        System.out.println("Powering on");
    }

    @Override
    public void powerOff() {
        System.out.println("Powering off");
    }

    @Override
    public void isRinging() {
        System.out.println("Ringing");
    }

    @Override
    public void browse() {
        System.out.println("Browsing");
    }

    @Override
    public void showPage(String url) {
        System.out.println("Showing page: " + url);
    }

    @Override
    public void closePage() {
        System.out.println("Closing page");
    }

    @Override
    public void addNewTab(String url) {
        System.out.println("Adding new tab: " + url);
    }

    @Override
    public void closeTab() {
        System.out.println("Closing tab");
    }

    @Override
    public void refresh() {
        System.out.println("Refreshing page");
    }
}
