package com.github.Avengers.larborator.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Meifans on 2016/9/27.
 */
@RestController
@RequestMapping("/api/sample/")
@Slf4j
public class SampleController {

	@RequestMapping(path = "/samepath", method = RequestMethod.GET)
	public String noRequestParameter() {
		return "";
	}

	@RequestMapping(path = "/samepath", method = RequestMethod.GET)
	public String existRequestParameter(@RequestParam("test") String test) {
		return "so,noly request parameter can't distinguish map to which method";
	}
}
