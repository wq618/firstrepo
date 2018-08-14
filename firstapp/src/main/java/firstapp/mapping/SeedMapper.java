package firstapp.mapping;

import firstapp.domain.Seed;

public interface SeedMapper {
	int insert(Seed record);

	int insertSelective(Seed record);

	int deleteByPrimaryKey(int id);

	int updateByPrimaryKey(Seed record);

	int updateByPrimaryKeySelective(Seed record);

	Seed selectByPrimaryKey(int id);
}
