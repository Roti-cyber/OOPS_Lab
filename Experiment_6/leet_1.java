//Find the index of the first occurrence of a String
class Solution {
    public static int strStr(String haystack, String needle) {
        int index=haystack.indexOf(needle);
        return index;
    }
    public static void main(String args[])
    {
        int index=strStr("sadnotsad","not");
        System.out.println("Index:"+index);
    }
}
