package ss15_ExceptionandDebug.baitap;

public class IllegalTriangleException extends Exception{
    String Error;
     public IllegalTriangleException(String Error){
         super();
         this.Error = Error;
     }

    public String getError() {
        return Error;
    }

    public void setError(String error) {
        Error = error;
    }

}
