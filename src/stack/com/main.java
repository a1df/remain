package stack.com;
//给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
//括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String c=input.next();
        boolean a=stack.isValid(c);
        if(a){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
