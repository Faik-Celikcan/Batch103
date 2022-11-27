package day27exceptions;

//Eger Exception Class'a extend ederseniz sizin Class'iniz "Compile Time Exception" olur
public class IlegalGradeException extends Exception{
    public IlegalGradeException(String message){
        super(message);
    }

}
