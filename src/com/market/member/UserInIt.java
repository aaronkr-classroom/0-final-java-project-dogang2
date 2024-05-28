package com.market.member;

public class UserInIt {
	private static User mUSer;
	
	public static void setmUser(User mUser) {
		UserInIt.mUSer = mUser;
	}
	
	public static void init(String name, int phone) {
		mUSer = new User(name, phone);
		
	}
	
	public static User getmUser() {
		return mUSer;
	}
}
