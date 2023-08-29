package controller;

public interface IWebBrowser {
    public void browse();
    public void showPage(String url);
    public void closePage();
    public void addNewTab(String url);
    public void closeTab();
    public void refresh();
}
