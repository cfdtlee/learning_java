/*************************************************************************
	> @File Name: Substring.java
	> @Author: 李爽 13111247
	> @Mail: cfdtlee@gmail.com 
	> @Created Time: Tue 04 Mar 2014 07:17:35 PM CST
 ************************************************************************/
import java.util.regex.Pattern;
 
public class Substring{
    public static void main(String[] args)
    {
        int start = 0, end = 0;
        start = Integer.valueOf(args[1]);
        end = Integer.valueOf(args[2]);
        System.out.println(args[0].substring(start, end));
    }
}
