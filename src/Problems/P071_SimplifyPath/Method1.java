package Problems.P071_SimplifyPath;

import java.util.Stack;

//使用栈数据结构
public class Method1 {
    public String simplifyPath(String path) {
        String [] str = path.split("/");
        Stack<String> stack = new Stack<>();
        for(int i = 0; i<str.length;i++){
            if(str[i].equals("."))
                continue;
            else if(str[i].equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
            }
            else{
                if(!str[i].equals(""))
                    stack.push(str[i]+"/");
            }

        }
        StringBuilder res = new StringBuilder("/");
        while(!stack.isEmpty()){
            res.insert(1,stack.pop());
        }
        if(res.length() >1 && res.charAt(res.length()-1)=='/')
           return res.substring(0,res.length()-1);
        return res.toString();
    }
}
