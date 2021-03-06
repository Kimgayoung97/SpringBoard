package com.koreait.sboard.common;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

import com.koreait.sboard.model.UserEntity;

public class SecurityUtils {
	//true: 로그인된 상태, false: 로그아웃 된 상태
	public static boolean isLogin(HttpSession hs) {
		return getLoginUser(hs) == null;
	}
	
	public static UserEntity getLoginUser(HttpSession hs) {
		return (UserEntity) hs.getAttribute(Const.LOGINUSER);
	}
	
	public static int getLoingUserPk(HttpSession hs) {
		UserEntity loginUser = getLoginUser(hs);
		return loginUser == null ? 0 : loginUser.getI_user();
	}
	public static String gensalt() {
		return BCrypt.gensalt();
	}

	public static String hashPassword(String pw, String salt) {
		return BCrypt.hashpw(pw, salt);
	}
	

}








