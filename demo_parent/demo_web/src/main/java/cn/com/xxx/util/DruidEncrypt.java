package cn.com.xxx.util;

import com.alibaba.druid.filter.config.ConfigTools;

public class DruidEncrypt {
	public static void main(String[] args) throws Exception {
		String password = "****";
		System.out.println("密码["+ password +"]的加密信息如下:");
		password = ConfigTools.encrypt(password);// 用默认私钥加密后的密文
		System.out.println("加密后的数据库密码:" + password);//加密后的密码
	}
}
