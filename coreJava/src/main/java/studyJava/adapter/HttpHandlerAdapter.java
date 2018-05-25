package studyJava.adapter;

public class HttpHandlerAdapter implements HandlerAdapter {

	public boolean supports(Object handler) {
		return handler instanceof HttpController;
	}

	public void handle(Object handler) {
		
		((HttpController)handler).handler();
	}

}
