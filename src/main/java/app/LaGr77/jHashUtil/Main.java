package app.LaGr77.jHashUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.SwingUtilities;

import app.LaGr77.jHashUtil.view.MainFrame;

/**
 * Main class: settings and run app.
 * 
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.0
 * @since 2022-01-17
 */
public class Main 
{
    public static void main( String[] args ) throws NoSuchAlgorithmException, IOException
    {
        //System.out.println( "Hello World!" );
        //System.out.println( "Hello World!" );
        //SwingUtilities.invokeLater(MainFrame::new);

        FileInputStream fis = new FileInputStream(new File ("C:\\Temp\\gparted-live-1.3.1-1-i686.iso"));
        byte[] byteArray = new byte[1024];
        int bytesCount = 0; 

        MessageDigest md2Digest = MessageDigest.getInstance("MD2");
        MessageDigest md5Digest = MessageDigest.getInstance("MD5");
        MessageDigest sha1Digest = MessageDigest.getInstance("SHA-1");
        MessageDigest sha224Digest = MessageDigest.getInstance("SHA-224");
        MessageDigest sha256Digest = MessageDigest.getInstance("SHA-256");
        MessageDigest sha384Digest = MessageDigest.getInstance("SHA-384");
        MessageDigest sha512Digest = MessageDigest.getInstance("SHA-512");


        while ((bytesCount = fis.read(byteArray)) != -1) {
            md2Digest.update(byteArray, 0, bytesCount);
            md5Digest.update(byteArray, 0, bytesCount);
            sha1Digest.update(byteArray, 0, bytesCount);
            sha224Digest.update(byteArray, 0, bytesCount);
            sha256Digest.update(byteArray, 0, bytesCount);
            sha384Digest.update(byteArray, 0, bytesCount);
            sha512Digest.update(byteArray, 0, bytesCount);
        };
        fis.close();

        byte[] bytes = md2Digest.digest();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< bytes.length ;i++)
        {
          sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println(sb.toString());
        //System.out.println("9c96933df56d070b89238784f50000946c3aabcb7ba05e98fa5b5dc439f0ece7");

        bytes = md5Digest.digest();
        sb = new StringBuilder();
        for(int i=0; i< bytes.length ;i++)
        {
          sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println(sb.toString());
        System.out.println("ed34b6d3e0c38d375f0175795cac60bb");

        bytes = sha1Digest.digest();
        sb = new StringBuilder();
        for(int i=0; i< bytes.length ;i++)
        {
          sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println(sb.toString());
        System.out.println("2f6692a100b3a19bbf4e12e6b2ca6b1bd7ecbcaa");

        bytes = sha224Digest.digest();
        sb = new StringBuilder();
        for(int i=0; i< bytes.length ;i++)
        {
          sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println(sb.toString());
        //System.out.println("2f6692a100b3a19bbf4e12e6b2ca6b1bd7ecbcaa");

        bytes = sha256Digest.digest();
        sb = new StringBuilder();
        for(int i=0; i< bytes.length ;i++)
        {
          sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println(sb.toString());
        System.out.println("9c96933df56d070b89238784f50000946c3aabcb7ba05e98fa5b5dc439f0ece7");

        bytes = sha384Digest.digest();
        sb = new StringBuilder();
        for(int i=0; i< bytes.length ;i++)
        {
          sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println(sb.toString());
        //System.out.println("9c96933df56d070b89238784f50000946c3aabcb7ba05e98fa5b5dc439f0ece7");

        bytes = sha512Digest.digest();
        sb = new StringBuilder();
        for(int i=0; i< bytes.length ;i++)
        {
          sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println(sb.toString());
        System.out.println("5a05424db61f4b802fd7c5e708b17974ebdae7d1981e4ef1ec9eebd1c933efa61ecdb4802c283b006c085142aca583ba2344c2fbfc0fc0b36163ec09cd8a2d07");

    }
}
