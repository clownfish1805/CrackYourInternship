class Solution {
    public boolean isValid(String s) {
        Stack<Character> result=new Stack<>();
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' )
             {
                 result.push(s.charAt(i));
             }
            //if(s.charAt(i)==')' ||s.charAt(i)=='}' ||s.charAt(i)==']'){
            else{
                if(result.isEmpty()){//if there is only closing bracket then the stack will be empty so we return false
                    return false;
                }
                if(result.peek()=='('  && s.charAt(i)==')'){
                    result.pop();
                }
                else if(result.peek()=='['  && s.charAt(i)==']'){
                    result.pop();
                }
                else if(result.peek()=='{' && s.charAt(i)=='}'){
                    result.pop();
                }
                else{
                    return false;
                }
            }
        }
        
        if(result.isEmpty()){
            return true;
        }
        return false;
       
    }
}