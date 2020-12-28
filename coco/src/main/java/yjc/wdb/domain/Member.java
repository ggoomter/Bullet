package yjc.wdb.domain;

public class Member {
	private int signUpDate;
	private String id;
	private String pw;
	/**
	 * @return the signUpDate
	 */
	public int getSignUpDate() {
		return signUpDate;
	}
	/**
	 * @param signUpDate the signUpDate to set
	 */
	public void setSignUpDate(int signUpDate) {
		this.signUpDate = signUpDate;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the pw
	 */
	public String getPw() {
		return pw;
	}
	/**
	 * @param pw the pw to set
	 */
	public void setPw(String pw) {
		this.pw = pw;
	}


}
