package test;

public class IPInfo {
    private String ip;
    private String user;

    // 생성자, 필드와 매개변수를 구분하기 위해 this 작성
    public IPInfo(String ip, String user) {
        this.ip = ip;
        this.user = user;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return ip + "(" + user + ")";
    }
}
