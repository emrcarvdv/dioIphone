package controller;

public interface ITelephone {
    public void call(String phoneNumber);
    public void answer();
    public void startVoiceMail();
    public void dial(String phoneNumber);
    public void powerOn();
    public void powerOff();
    public void isRinging();
}
