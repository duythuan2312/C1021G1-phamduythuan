package ss11_StackQueue.baitap.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println("Mảng ban đầu >>>>>>");
        for (Integer item : myStack){
            System.out.println(item);
        }
        List<Integer> list = new ArrayList<>();
        while (!myStack.isEmpty()){
            list.add(myStack.pop());
        }
        System.out.println("Sau khi đảo ngược : -------");
        System.out.println(list);


        System.out.println("________________");

        Stack<Character> wStack = new Stack<>();
        String mWord = "Phạm Duy Thuận";
        for (int i = 0 ; i < mWord.length() ; i++){
            wStack.push(mWord.charAt(i));
        }
        System.out.println(wStack);

        String newmWord = "";
      for (int i = 0 ; i < mWord.length() ; i++){
         newmWord = newmWord + wStack.pop();
      }
        System.out.println(newmWord);

    }

}
