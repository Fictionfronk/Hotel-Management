import jdk.vm.ci.code.site.ExceptionHandler;

public class Exception {
    
    public int errorNo;
    public String errormsg;

    public Exception(int n, String msg){

        this.errorNo = n;
        this.errormsg = msg;

    }

    public void showError(){
        ExceptionHandler
    }
}
