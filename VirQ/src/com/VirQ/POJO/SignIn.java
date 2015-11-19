package com.VirQ.POJO;

public class SignIn {
private String emailId;
private String password;

public SignIn(String status, String errorMessage) {
    this.emailId = status;
    this.password = errorMessage;
  }

public void setEmailId(String emailId)
{
	this.emailId=emailId;
}
public void setPassword(String password)
{
	this.password=password;
}
public String getEmailId()
{
	return this.emailId;
}
public String getPassword()
{
	return this.password;
}

}
