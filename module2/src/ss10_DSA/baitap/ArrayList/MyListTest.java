package ss10_DSA.baitap.ArrayList;

public class MyListTest {
    static class Person{
        String name;
        int Age;
        Person(String name , int age){
            this.name = name;
            Age = age;
        }

        @Override
        public String toString() {
            return "Person{"+
                    "name=" +name + '\''+
                    ", Age=" +Age +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            Person person = (Person) obj;
            return this.name.equals(((Person) obj).name)
                    && this.Age == ((Person) obj).Age;
        }
    }
    public static void main(String[] args) {
        MyList<Person> myList = new MyList<>(3);
        myList.ensureCapacity(5);
        myList.add(new Person("Pham Duy A" ,30));
        myList.add(new Person("Pham Duy B" ,30));
        myList.add(new Person("Pham Duy C" ,30));
        myList.add(new Person("Pham Duy D" ,30));
        myList.add(new Person("Pham Duy F" ,30),2);
        myList.remove(1);

        MyList<Person>  myList2 = myList.clone();
        myList2.add(new Person("A Linh cu te pho mai que" ,50));
        int index = myList2.indexOf(new Person("Nguyen van c" ,30));
        System.out.println("index="+index);
        for (int i = 0 ; i < myList2.size() ; i++){
            System.out.println(myList2.get(i).toString());
        }

    }
}
