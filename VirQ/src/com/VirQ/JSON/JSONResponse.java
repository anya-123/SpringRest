package com.VirQ.JSON;

public class JSONResponse {
	 private String status = "";
	  private String errorMessage = "";
	 
	  public JSONResponse(String status, String errorMessage) {
	    this.status = status;
	    this.errorMessage = errorMessage;
	  }
}
