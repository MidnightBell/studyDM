package per.zs.studyDM.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/** 
* Create time 2020年5月9日 下午6:17:21 
* @author sheng.zhong 
* @Description  
*/
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		// 添加header参数
//		ParameterBuilder ticketPar = new ParameterBuilder();
//		List<Parameter> pars = new ArrayList<>();
//		ticketPar.name("token").description("user token").modelRef(new ModelRef("string")).parameterType("header")
//				.required(false).build(); //
//		pars.add(ticketPar.build());
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(getApiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("per.zs.studyDM.controller")).paths(PathSelectors.any())
				.build();//.globalOperationParameters(pars);
	}

    private ApiInfo getApiInfo(){
        return new ApiInfoBuilder()
                .title("API接口文档")
                .description("达梦数据库操作学习接口文档")
                .version("1.0")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .build();
    }
}
