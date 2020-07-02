package idv.maxy.f2e_order.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.script.ScriptTemplateConfigurer;
import org.springframework.web.servlet.view.script.ScriptTemplateViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
@EnableWebMvc
public class MVCConfiguration implements WebMvcConfigurer {
	
	@Bean
	public ClassLoaderTemplateResolver templateResolver() {
		ClassLoaderTemplateResolver r = new ClassLoaderTemplateResolver();
		r.setCharacterEncoding("UTF-8");
		r.setPrefix("pages/");
		r.setSuffix(".html");
		r.setTemplateMode(TemplateMode.HTML);
		r.setOrder(0);

		return r;
	}
		
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/js/**")
				.addResourceLocations("classpath:/pages/js/");
		registry.addResourceHandler("/css/**")
				.addResourceLocations("classpath:/pages/css/");
	}

}
