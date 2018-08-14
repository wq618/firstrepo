package firstapp.service;

import firstapp.domain.Seed;

public interface SeedService {
	Seed selectByID(int id);
}
