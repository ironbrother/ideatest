package mytomcat;

public abstract class MyServlet {
    public abstract void  doGet(MyRequest myRequest,MyResponse myResponse);
    public  abstract  void  doPost(MyRequest myRequest,MyResponse myResponse);

    public void service(MyRequest myRequest,MyResponse myResponse){
        if(myRequest.getMethode().equalsIgnoreCase("POST")){
            doPost(myRequest,myResponse);
        }else if(myRequest.getMethode().equalsIgnoreCase("GET")){
            doGet(myRequest,myResponse);
        }
    }
}
