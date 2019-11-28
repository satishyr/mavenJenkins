package com.app;

import java.util.Map;

public class Project {
	private int pid;
	private String pname;
	private Map<String,Integer> version;
	public Project() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Map<String, Integer> getVersion() {
		return version;
	}
	public void setVersion(Map<String, Integer> version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", version=" + version + "]";
	}

}
