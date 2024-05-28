package EX_25052024_Collections;

public enum apiPage {
    Home("https://app.vwo.com/","Home page"),
    Login("\"https://app.vwo.com/login","Loginpage"),
    Dashboard("https://app.vwo.com/","Dash Board");

    String url;
    String page;

    apiPage(String url, String page) {
        this.url = url;
        this.page = page;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}

