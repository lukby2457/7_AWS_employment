package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")	// / : 최상위, * : 어떤 페이지를 들어가도 모두 적용
public class EncodingFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("서버가 실행 되었습니다!!!");
		// init : 서버가 실행시 최초 한번만 실행. 보통 쿠키 등 자원을 연결할 때 사용
	}
	
	@Override
	public void destroy() {
		System.out.println("서버가 종료 되었습니다!!!");
		// destroy : 서버가 종료될 때 한번 실행. 보통 자원을 해제할 때 사용
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// System.out.println("요청이 발생했습니다~");
		
		request.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
		
		// System.out.println("응답이 발생했습니다~");
		
		// doFilter : 지정 경로로 요청시 마다 실행
		// chain : jsp와 연결할 때 사용
	}
	
}

