package mx.uv;
import static spark.Spark.*;


import  com.google.gson.*;
public class App 
{
    static Gson gson = new Gson();
    public static void main( String[] args )
    {
        options("/*",(request,response)->{
            String accessControlRequestHeaders=request.headers("Access-Control-Request-Headers");
            if(accessControlRequestHeaders!=null){
                response.header("Access-Control-Allow-Headers",accessControlRequestHeaders);
            }
            String accessControlRequestMethod=request.headers("Access-Control-Request-Method");
            if(accessControlRequestMethod!=null){
                response.header("Access-Control-Allow-Methods",accessControlRequestMethod);
                }
            return "OK";
        });
    before((request,response)->response.header("Access-Control-Allow-Origin","*"));
        post("/usuarioIniciado", (request, response) ->{
            return null;
        });
    }
}
