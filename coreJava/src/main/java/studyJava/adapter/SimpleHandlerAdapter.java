package studyJava.adapter;

public class SimpleHandlerAdapter implements HandlerAdapter{

	public boolean supports(Object handler) {
		
		 return handler instanceof SimpleController;
	}

	public void handle(Object handler) {
		// TODO Auto-generated method stub
		((SimpleController)handler).handler();
	}

}
