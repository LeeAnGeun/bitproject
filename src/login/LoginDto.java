package login;

import java.util.List;

public class LoginDto {
	
	private int membernum;
	private String userid;
	private String pwd;
	private String email;
	private int gender;
	private String phone;
	private String birth;
	private int activity;
	private int webmanager;
	private int clubmaster;
	
	public LoginDto() {
		
	}
	
	public LoginDto(int membernum, String userid, String pwd, String email, int gender, String phone, String birth,
			int activity, int webmanager, int clubmaster) {
		super();
		this.membernum = membernum;
		this.userid = userid;
		this.pwd = pwd;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
		this.birth = birth;
		this.activity = activity;
		this.webmanager = webmanager;
		this.clubmaster = clubmaster;
	}

	public int getMembernum() {
		return membernum;
	}

	public void setMembernum(int membernum) {
		this.membernum = membernum;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getActivity() {
		return activity;
	}

	public void setActivity(int activity) {
		this.activity = activity;
	}

	public int getWebmanager() {
		return webmanager;
	}

	public void setWebmanager(int webmanager) {
		this.webmanager = webmanager;
	}

	public int getClubmaster() {
		return clubmaster;
	}

	public void setClubmaster(int clubmaster) {
		this.clubmaster = clubmaster;
	}

	@Override
	public String toString() {
		return "LoginDto [membernum=" + membernum + ", userid=" + userid + ", pwd=" + pwd + ", email=" + email
				+ ", gender=" + gender + ", phone=" + phone + ", birth=" + birth + ", activity=" + activity
				+ ", webmanager=" + webmanager + ", clubmaster=" + clubmaster + "]";
	}
	
	
}
