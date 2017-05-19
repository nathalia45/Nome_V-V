package nome.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import nome.controller.HomeController;
import nome.daos.PessoaDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses= {HomeController.class,PessoaDAO.class})
public class AppWebConfiguration {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		 InternalResourceViewResolver resolver = new InternalResourceViewResolver(); 
	     resolver.setPrefix("/WEB-INF/views/");
	     resolver.setSuffix(".jsp");
	return resolver;
	}

}
