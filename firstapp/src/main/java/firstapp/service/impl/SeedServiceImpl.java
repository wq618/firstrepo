package firstapp.service.impl;

import firstapp.domain.Seed;
import firstapp.mapping.SeedMapper;
import firstapp.service.SeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeedServiceImpl implements SeedService {
	@Autowired
	private SeedMapper seedMapper;

	@Override
	public Seed selectByID(int id) {
		return seedMapper.selectByPrimaryKey(id);
	}
}
