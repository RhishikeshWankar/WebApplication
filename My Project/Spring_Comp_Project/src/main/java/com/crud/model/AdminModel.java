package com.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admintable")
public class AdminModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String taskname;
private String assignedto;
private String description;
private String assigneddate;
private String duedate;
private String status;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTaskname() {
	return taskname;
}
public void setTaskname(String taskname) {
	this.taskname = taskname;
}
public String getAssignedto() {
	return assignedto;
}
public void setAssignedto(String assignedto) {
	this.assignedto = assignedto;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getAssigneddate() {
	return assigneddate;
}
public void setAssigneddate(String assigneddate) {
	this.assigneddate = assigneddate;
}
public String getDuedate() {
	return duedate;
}
public void setDuedate(String duedate) {
	this.duedate = duedate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
