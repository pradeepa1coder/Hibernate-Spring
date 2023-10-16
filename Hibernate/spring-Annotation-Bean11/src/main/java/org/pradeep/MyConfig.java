package org.pradeep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.pradeep")
public class MyConfig 
{
	@Bean
	public List<Integer> getList() 
	{
		return new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));

	}

}
