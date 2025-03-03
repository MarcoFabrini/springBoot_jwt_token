package backend.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import backend.utils.Roles;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "users")
@Entity
public class Users implements UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer id;

	@Column(nullable = false)
	private String fullName;

	@Column(unique = true, length = 100, nullable = false)
	private String email;

	@Column(nullable = false)
	private String password;

	@Column(name = "active", nullable = false)
	private Boolean active;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Roles roles;

	@CreationTimestamp
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(updatable = false, name = "created_at")
	private Date createdAt;

	@UpdateTimestamp
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "updated_at")
	private Date updatedAt;

	// metodi userDetails
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(roles);
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	// getter e setter
	public Integer getId() {
		return id;
	}

	public Users setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getFullName() {
		return fullName;
	}

	public Users setFullName(String fullName) {
		this.fullName = fullName;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Users setEmail(String email) {
		this.email = email;
		return this;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Users setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public Users setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	public Users setPassword(String password) {
		this.password = password;
		return this;
	}

	public Roles getRole() {
		return roles;
	}

	public Users setRole(Roles roles) {
		this.roles = roles;
		return this;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}// class
