package org.springframework.samples.mvc.simple;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@RequestMapping(value = "/simple", produces = "text/event-stream;charset=utf-8")
	public @ResponseBody String simple() {

		return "retry:500\ndata:Hello world我好呀 !!!!!!!!!!!!!\n\n";

	}

}
