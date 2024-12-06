package pattern.structuralPattern.decorator;

public interface Car {

   default String drive(){
       return "едет";
   }

}
