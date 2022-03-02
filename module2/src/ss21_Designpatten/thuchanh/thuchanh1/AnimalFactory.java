package ss21_Designpatten.thuchanh.thuchanh1;
import javax.lang.model.element.AnnotationMirror;

public class AnimalFactory {
    public Animal getAnimal(String type){
        if ("canine".equals(type)){
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
