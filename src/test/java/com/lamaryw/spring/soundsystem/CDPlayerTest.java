package com.lamaryw.spring.soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lamaryw.spring.config.CDPlayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)//use SpringJUnit4ClassRunner to have a Spring application context automatically created when the test starts.
@ContextConfiguration(classes=CDPlayerConfig.class) //tells spring to load its configuration from the CDPlayerConfig class.
public class CDPlayerTest {

	@Autowired //to inject the CompactDisc bean into the test
	private CompactDisc cd;
	
	/*
	 * To test that component scanning works.
	 * 
	 * Because that configuration class includes @ComponentScan, the resulting
	 * application context should include the CompactDisc bean.
	 */
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}

}
