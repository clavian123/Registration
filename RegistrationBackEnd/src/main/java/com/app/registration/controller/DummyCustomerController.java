package com.app.registration.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.app.registration.model.AllCustomersData;
import com.app.registration.model.BackSampleResponse;
import com.app.registration.model.PostRequest;
import com.app.registration.model.PostResponse;
import com.app.registration.repo.DummyRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

//@CrossOrigin(origins = "http://localhost:8081")
@RestController
//@RequestMapping(value="/dummycustomer")
public class DummyCustomerController {
	@Autowired
	DummyRepo dummyRepo;
	@Autowired
	AllCustomersData allCustomersData;
	
	String text = null;
	@RequestMapping("/customer")
	public ResponseEntity<List<AllCustomersData>> getAllCifCode(@RequestParam(required = false)String cifcode){
		try {
			
			if(cifcode==null && cifcode.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
	
//	@RequestMapping(value = "/customer", method = RequestMethod.POST)
//	public HttpStatus Test(@RequestBody AllCustomersData input) throws JsonProcessingException {
//		RestTemplate restTemplate = new RestTemplate();
//		final String uri = "http://localhost:8080/";
//		DummyRepo repo;
//		ObjectMapper mapper = new ObjectMapper();
//	    mapper.enable(SerializationFeature.INDENT_OUTPUT);
//		
////		PostResponse response = new PostResponse();
////		response.setTransactionTypeCode(inputPayload.getTransactionTypeCode());
////		Set<Event> event = this.eventRepository.findByCode();
////		Set<Reward> reward = this.rewardRepository.findByAll();
////		String json = mapper.writeValueAsString(reward);
//	    AllCustomersData data = new AllCustomersData();
//	    data.setCifCode(input.getCifCode());
//	    List<AllCustomersData>cusData = this.dummyRepo.findByCifCode();
//	    
//	    
//	    
//		if(input.getCifCode().equals(data)) {
//			
//			for(AllCustomersData e : cusData) {
//				System.out.println(e.getCifCode());
//				text = e.getCifCode();
//			}
//			if(data.getCifCode() != null) {
//						
//				//System.out.println(addRest.getValidation());
//			}
//		}
//		
//		
//		return HttpStatus.OK;
//	}
//
//	
	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public PostResponse Test(@RequestBody PostRequest inputPayload) throws JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		final String uri = "http://localhost:8080/backsend";
		
		ObjectMapper mapper = new ObjectMapper();
	    mapper.enable(SerializationFeature.INDENT_OUTPUT);
		
		PostResponse response = new PostResponse();
		response.setTransactionTypeCode(inputPayload.getTransactionTypeCode());
//		Set<Event> event = this.eventRepository.findByCode();
//		Set<Reward> reward = this.rewardRepository.findByAll();
		//AllCustomersData data = this.dummyRepo.findByCifCode();
		List<AllCustomersData>data = this.dummyRepo.findByCifCode();
		String json = mapper.writeValueAsString(allCustomersData);
		if(!inputPayload.getTransactionTypeCode().isEmpty()) {
			
			for(AllCustomersData all : data) {
				System.out.println(all.getCifCode());
				text = all.getCifCode();
			}
			if(data != null) {
				BackSampleResponse backSampleResponse = new BackSampleResponse();
				backSampleResponse.setValidation("isValid");
				backSampleResponse.setSetOfReward(json);
				BackSampleResponse addRest = restTemplate.postForObject( uri, backSampleResponse, BackSampleResponse.class);
				System.out.println(addRest.getValidation());
			}
		}
		
		response.setExtra(text);
		return response;
	}

	
	
}
