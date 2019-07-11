package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BasicException {
    public static void main(String[] args) {
        try {
            uncheckedException(null);
            checkedException(null);
            String id = null;
            validate(id);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void validate(String id) throws Exception {
        //try {
            if (id == null || "".equals(id)) {
                Exception e = new Exception("아이디 입력 좀");
                throw e;
            } else if (id.length() < 8 || id.length() > 16) {
                throw new Exception("8자 이상 16자 이하");
            }
        /*} catch(Exception e){
            System.out.println(e.getMessage());
        }*/
    }

    private static void uncheckedException(String s){
        try {
            System.out.println(s.length());
        } catch(NullPointerException npe){
            System.out.println("null값이 넘어옴...");
        }
        try {
            System.out.println(Integer.parseInt("123a"));
        } catch (NullPointerException npe){
            System.out.println("nul...");
        } catch (NumberFormatException nfe){
            System.out.println("not number");
        }
    }

    private static void checkedException(String s){
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
        } catch (FileNotFoundException fne){
            System.out.println("파일 없음");
        } catch (IOException ie){
            System.out.println("파일 읽기 오류");
        }

    }
}
