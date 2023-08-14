package com.student.jwt;

import java.util.List;

public class JwtResponse {
	
	private String jwt;
    private String token;
    private String type = "Basic";
    private String username;
    private String password;
    private List roles;
    
    public JwtResponse(String jwt, String username, String password, List roles) {
    	
    	    this.jwt=jwt;
            this.username = username;
            this.password = password;
            this.roles = roles;
        }
  
}
