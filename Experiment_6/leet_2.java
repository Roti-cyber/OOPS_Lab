class Solution_1 {
    public static boolean repeatedSubstringPattern(String s)
     {
        int l=s.length();
        String str="";
        String str_org="";
        for(int i=0;i<l;i++)
        {
            str=s.substring(0,i+1);
            str_org=s.substring(0,i+1);
            for(int j=0;j<s.length();j++)
            {
                str_org=str_org+str;
                if(str_org.length()>s.length())
                {
                    break;
                }
                if(str_org.equals(s))
                {

                    return true;
                }
                
            }
            str="";


        }
            return false;
    }
    public static void main(String args[])
    {
        System.out.println("Input:ababab");
        System.out.println(repeatedSubstringPattern("ababab"));
    }

}
