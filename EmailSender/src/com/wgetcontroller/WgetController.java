package com.wgetcontroller;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class WgetController {

	public static void main(String[] args) {
//        String cmd = "cd /home/g/input/WGET/";  //| wget https://www.nbn.org.il";
		String cmd = "wget -r -l10 https://www.nbn.org.il";
		String s;
        Process p;
 
        
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        
        
        try {

          p = Runtime.getRuntime().exec(cmd, null, new File("/home/g/input/WGET/"));

          
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null)
                System.out.println("line: " + s);
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}
    }


	}


