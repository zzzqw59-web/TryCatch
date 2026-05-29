package test.system;

import test.IPInfo;

public class IPInfoMain {
    static void main(String[] args) {
        IPInfo[] ipInfos = new IPInfo[3];

        // IPInfo 배열에 객체를 초기화 하지 않고 메서드를 호출
        ipInfos[0] = new IPInfo("123", "홍길동");
        ipInfos[1] = new IPInfo("123", "홍길동");
        ipInfos[2] = new IPInfo("123", "홍길동");

        for (int i = 0; i < ipInfos.length; i++) {
            System.out.println(ipInfos[i].toString());
        }
    }
}
