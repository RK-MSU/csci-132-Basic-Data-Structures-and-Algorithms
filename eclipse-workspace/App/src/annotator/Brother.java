package annotator;

import java.util.ArrayList;

public class Brother
{
	private static ArrayList<Brother> myBrothers;
	private String firstName, lastName, nickName, position;
	private int bump;
	
	public void addBro(String first, String last, String nickName, String position, int bump)
	{
		firstName = first;
		lastName = last;
		this.nickName = nickName;
		this.bump = bump;
		
		myBrothers.add(this);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getBump() {
		return bump;
	}

	public void setBump(int bump) {
		this.bump = bump;
	}
	
	
	

}
