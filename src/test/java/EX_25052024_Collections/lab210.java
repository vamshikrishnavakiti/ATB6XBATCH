package EX_25052024_Collections;

 enum APIENDPOINT {
HOME("https://app.vwo.com/","HomePage"),
    LOGIN("https://app.vwo.com/login","Login Page"),
    DASHBOARD("https://app.vwo.com/dashboard","Dash Board");

    String url;
    String page;

    APIENDPOINT(String url, String page) {
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
    // HomePage:https://app.vwo.com/
    // Login: https://app.vwo.com/login
    // DashBoard:https://app.vwo.com/dashboard

}


