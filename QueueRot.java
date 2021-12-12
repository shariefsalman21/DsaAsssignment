package com.edyodaassg.DsaAssgn;
import java.util.*;
public class QueueRot {
    static boolean check_rotation(String s, String goal)
    {
        if (s.length() != goal.length())
            ;
        Queue<Character> q1 = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            q1.add(s.charAt(i));
        }
        Queue<Character> q2 = new LinkedList<>();
        for (int i = 0; i < goal.length(); i++) {
            q2.add(goal.charAt(i));
        }
        int k = goal.length();
        while (k>0) {
            k--;
            char ch = q2.peek();
            q2.remove();
            q2.add(ch);
            if (q2.equals(q1))
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        String s1 = "ABCD";
        String s2 = "CDAB";
        if (check_rotation(s1, s2))
            System.out.print(s2+ " is a rotated form of " +  s1
                    +"\n");
        else
            System.out.print(s2+ " is not a rotated form of " +  s1
                    +"\n");
        String s3 = "ACBD";
        if (check_rotation(s1, s3))
            System.out.print(s3+ " is a rotated form of " +  s1
                    +"\n");
        else
            System.out.print(s3+ " is not a rotated form of " +  s1
                    +"\n");
    }
}
