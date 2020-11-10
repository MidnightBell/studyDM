//package per.zs.studyDM.config;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.changhong.classify.AuthFilter;
//import com.changhong.classify.ErrorFilter;
//
///** 
//* Create time 2020年9月11日 上午8:41:42 
//* @author sheng.zhong 
//* @Description  
//*/
//@Configuration   
//public class WebConfiguration {
//        @Bean   
//        public FilterRegistrationBean<AuthFilter> testFilterRegistration() {
//            FilterRegistrationBean<AuthFilter> registration = new FilterRegistrationBean<>();
//            registration.setFilter(new AuthFilter());
//            registration.addUrlPatterns("/*");//配置过滤路径
//            registration.setName("authFilter");//设置filter名称
//            registration.setOrder(1);//请求中过滤器执行的先后顺序，值越小越先执行
//            return registration;
//        }
//        
//        @Bean
//        public FilterRegistrationBean errorFilterRegistration() {
//
//            FilterRegistrationBean registration = new FilterRegistrationBean();
//            registration.setFilter(new ErrorFilter());
//            registration.addUrlPatterns("/*");
//            registration.setName("errorFilter");
//            registration.setOrder(-1000);
//            return registration;
//        }
//}
