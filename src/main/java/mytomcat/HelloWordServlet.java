package mytomcat;

import java.io.IOException;

public class HelloWordServlet extends MyServlet {

    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("hello word get git1111");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("hello word post git");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
