class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                st.push(String.valueOf(a+b));
            }
            else if(tokens[i].equals("-")){
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                st.push(String.valueOf(b-a));
            }
            else if(tokens[i].equals("*")){
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                st.push(String.valueOf(a*b));
            }
            else if(tokens[i].equals("/")){
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                st.push(String.valueOf(b/a));
            }
            else{
                st.push(tokens[i]);
            }
        }
        return Integer.parseInt(st.peek());
    }
}