/*************************************************************************
	> @File Name: SumOfArgs.java
	> @Author: 李爽 13111247
	> @Mail: cfdtlee@gmail.com 
	> @Created Time: Tue 04 Mar 2014 07:17:35 PM CST
 ************************************************************************/
import java.util.regex.Pattern;
public class SumOfArgs{
    public static void main(String[] args)
    {
        int result = 0;
        for (String str: args){
            if (Pattern.matches("\\d",str) == true)
                result += Integer.valueOf(str).intValue();;
        }
        System.out.println(result);
    }
}
