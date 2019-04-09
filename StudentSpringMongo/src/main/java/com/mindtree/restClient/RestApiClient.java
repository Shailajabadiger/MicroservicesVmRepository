package com.mindtree.restClient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import com.mindtree.model.Student;

public class RestApiClient {

	public static void main(String[] args) {
		Client client= ClientBuilder.newClient();
		Response response=client.target("http://localhost:8080/get").request().get();
		System.out.println(response);
		Student stud=response.readEntity(Student.class);
		System.out.println(stud.getId());
		//System.out.println(/*+"\t"+stud.getStName()+"\t"+stud.getStAge()+"\t"+stud.getStLocation()+"\t"+stud.getStDob()*/);

	}

}
