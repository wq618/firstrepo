package firstapp.service.impl;

import firstapp.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
	public String test() {
		return "test";
	}
}
