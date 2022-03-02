package ss11_StackQueue.thuchanh.Stack;

public class GenericStackClient {
    private static void stackOfIStrings(){
        MyGenericStack<String> myGenericStack = new MyGenericStack<>();
        myGenericStack.push("Thuận");
        myGenericStack.push("Bảo");
        myGenericStack.push("Đạt");
        myGenericStack.push("Linh");
        myGenericStack.push("Hiếu");
        System.out.println("Kích thước của ngăn sếp là :" +myGenericStack.size());
        System.out.println("Các yếu tố Pop từ ngăn sếp:");
        while (!myGenericStack.isEmpty()){
            System.out.println(myGenericStack.pop());
        }
        System.out.println("Kích thước ngăn sếp sao khi hoạt động là :" +myGenericStack.size());
    }
    private static void stackOfInteger(){
        MyGenericStack<Integer> myGenericStack = new MyGenericStack<>();
        myGenericStack.push(3);
        myGenericStack.push(6);
        myGenericStack.push(7);
        System.out.println("Kích thước của ngăn sếp là :" + myGenericStack.size());
        System.out.println("Các yếu tố từ ngăn sếp là :" );
        while (!myGenericStack.isEmpty()){
            System.out.println(myGenericStack.pop());
        }
        System.out.println("Kích thước sau khi thay đổi là :" +myGenericStack.size());
    }
    private static void stackOfDoouble(){
        MyGenericStack<Double> myGenericStack = new MyGenericStack<>();
        myGenericStack.push(2.2);
        myGenericStack.push(3.4);
        myGenericStack.push(6.7);
        System.out.println("Kích thước ngăn sếp là :" +myGenericStack.size());
        System.out.println("Các yếu tố từ ngăn sếp là :");
        while (!myGenericStack.isEmpty()){
            System.out.println(myGenericStack.pop());
        }
        System.out.println("Kích thước sau khi thay đổi là :" +myGenericStack.size());
    }

    public static void main(String[] args) {
        System.out.println("1.Integer ...");
        stackOfInteger();
        System.out.println("2.Strings...");
        stackOfIStrings();
        System.out.println("3.Double...");
        stackOfDoouble();
    }

}
