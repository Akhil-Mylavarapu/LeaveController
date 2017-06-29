package com.niit.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.leave.dao.LeaveDAO;
import com.niit.leave.domain.Leave;

@RestController
public class LeaveController 
{
@Autowired
private LeaveDAO leavedao;

@PostMapping(value = "/applyleave")
public ResponseEntity<Leave> save(@RequestBody Leave leave, HttpSession session) {
	System.out.println("save leave Function Stared...........................!");
		
	leavedao.save(leave);
	return new ResponseEntity<Leave>(leave, HttpStatus.OK);

}
}
