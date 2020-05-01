package io.mosip.mds.repository;

import org.springframework.stereotype.Repository;

import io.mosip.kernel.core.dataaccess.spi.repository.BaseRepository;
import io.mosip.mds.entitiy.TestManager;

/**
 * 
 * @author Dhanendra
 *
 */
@Repository
public interface TestManagerRepository extends BaseRepository<TestManager, String> {
	
	

}
