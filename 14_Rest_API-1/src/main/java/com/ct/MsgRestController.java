package com.ct;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	// if we want to see own status code then like below used

	@PostMapping("save")
	public ResponseEntity<String> saveStatus() {

		String msg = "Look own Status code........!";

		return new ResponseEntity<String>(msg, HttpStatus.CREATED);

	}

	@PostMapping("save1")
	public ResponseEntity<String> saveHttpStatus() {

		String msg = "Creating own Status Code...............!";

		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@PostMapping("create")
	public String saveData() {

		String msg = "Creating a new Request using POST.......!";

		return msg;
	}

	@GetMapping("welcome")
	public String getWelcomeMsg() {

		String msg = "Welcome to First Rest API App.......!";

		return msg;
	}

	@GetMapping("greet")
	public String getGreetMsg() {

		String msg = "Welcome to Greet msg..........!";

		return msg;
	}
}
