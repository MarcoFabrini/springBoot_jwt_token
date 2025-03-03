package backend.dto;

import backend.utils.Roles;

public class UsersDTO {
	private Integer id;
	private String fullName;
	private String email;
	private Roles role;
	private Boolean active;

	public UsersDTO(Integer id, String fullName, String email, Roles role, Boolean active) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.role = role;
		this.active = active;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}// class
