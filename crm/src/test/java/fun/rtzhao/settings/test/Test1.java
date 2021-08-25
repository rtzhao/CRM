package fun.rtzhao.settings.test;

import fun.rtzhao.crm.utils.DateTimeUtil;
import fun.rtzhao.crm.utils.MD5Util;

public class Test1 {
    public static void main(String[] args) {
        String expireTime = "2021-10-10 10:10:10";
        String currentTime = DateTimeUtil.getSysTime();
        int count = expireTime.compareTo(currentTime);

        String lockState ="0";
        if("0".equals(lockState)){

        }

        String ip="192.168.1.1";
        String allowIps ="192.168.1.1,192.128.1.2";
        if(allowIps.contains(ip)){

        }else{

        }

        String pwd = "123";
        pwd= MD5Util.getMD5(pwd);

    }
}
