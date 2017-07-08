package com.doganmesut.crossapi;

import com.doganmesut.crossapi.model.LastActivity;
import com.doganmesut.crossapi.service.LastActivityService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@DataMongoTest
public class LastLastLastActivityServiceTest {

	@Autowired
	LastActivityService lastActivityService;

	@Test
	public void testLastActivitySave() {

		LastActivity lastActivityA = new LastActivity("USER_A",Instant.now().toString(),new GeoJsonPoint(40.954417,29.095227));
		lastActivityService.save(lastActivityA);
		LastActivity lastActivityB = new LastActivity("USER_B",Instant.now().toString(),new GeoJsonPoint(40.955417,29.094227));
		lastActivityService.save(lastActivityB);
		LastActivity lastActivityC = new LastActivity("USER_C",Instant.now().toString(),new GeoJsonPoint(40.956417,29.093227));
		lastActivityService.save(lastActivityC);
		LastActivity lastActivityD = new LastActivity("USER_D",Instant.now().toString(),new GeoJsonPoint(40.957417,29.092227));
		lastActivityService.save(lastActivityD);
		LastActivity lastActivityE = new LastActivity("USER_E",Instant.now().toString(),new GeoJsonPoint(40.958417,29.091227));
		lastActivityService.save(lastActivityE);
		List<LastActivity> lastActivityList = 	lastActivityService.findNearActivities("40.958617","29.095527");
		Assert.assertTrue(!lastActivityList.isEmpty());

	}

}
