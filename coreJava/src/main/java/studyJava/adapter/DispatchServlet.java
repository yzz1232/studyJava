package studyJava.adapter;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {
	
	 public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();
	 
     
     public DispatchServlet(){  
        handlerAdapters.add(new HttpHandlerAdapter());  
        handlerAdapters.add(new SimpleHandlerAdapter());  
     } 
     
     public void doDispatch(){
    	 
    	 Controller controller = new SimpleController(); 
    	 //controller.handler();
    	 HandlerAdapter handlerAdapter = getHandler(controller);
    	 handlerAdapter.handle(controller);
    	 
    	 if(controller instanceof SimpleController){
    		 HandlerAdapter HandlerAdapter = new SimpleHandlerAdapter();
    		
    	 }else if(controller instanceof HttpController){
    		 HandlerAdapter HandlerAdapter = new HttpHandlerAdapter();
    	 }
    	 
     }
     
     public HandlerAdapter getHandler(Controller contrller){
    	 for(HandlerAdapter handlerAdapter:handlerAdapters){
    		 if(handlerAdapter.supports(contrller)){
    			 return handlerAdapter;
    		 }
    	 }
    	 return null;
     }
	
     public static void main(String[] args) {
    	 DispatchServlet dispatchServlet = new DispatchServlet();
    	 dispatchServlet.doDispatch();
	}
}
