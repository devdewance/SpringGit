package spring3javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
	@Bean(name="service")

	public service returnobjectOfServiceImpl()
	{
		
		
		return new ServiceImpl();
	}
}
