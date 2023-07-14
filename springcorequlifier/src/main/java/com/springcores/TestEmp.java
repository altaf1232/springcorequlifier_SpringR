package com.springcores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestEmp 
{
	@Autowired
	@Qualifier("address")//jisko aapko inject karna hai wo variavle ka name dena hai 
  private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public TestEmp() {
	super();
	// TODO Auto-generated constructor stub
}

public TestEmp(Address address) {
	super();
	this.address = address;
}

@Override
public String toString() {
	return "TestEmp [address=" + address + "]";
}

}
