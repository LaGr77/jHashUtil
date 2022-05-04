package app.LaGr77.jHashUtil;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.swing.SwingUtilities;

import app.LaGr77.jHashUtil.view.MainFrame;

/**
 * Main class: settings and run app.
 * 
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.0.2022-03-10
 * @since 2022-01-17
 */
public class Main 
{
    public static void main( String[] args ) throws NoSuchAlgorithmException, IOException
    {
        System.out.println("Hello World!" );
        //System.out.println( "Hello World!" );
        SwingUtilities.invokeLater(MainFrame::new);

        /**
        FileInputStream fis = new FileInputStream(new File ("C:\\Temp\\gparted-live-1.3.1-1-i686.iso"));
        Algo[] array = {Algo.MD5, Algo.SHA1, Algo.SHA256, Algo.SHA512};
        FileHash fh = new FileHash(array, fis);
        fh.compute();
        fis.close();
        for (Algo a : fh.getHash().keySet()) {
          System.out.print(a.getAlgo() + " ");
          System.out.println(fh.getHash().get(a));
        }
        //System.out.println(fh.getHash());
        System.out.println("MD5 " + "ed34b6d3e0c38d375f0175795cac60bb".equals(fh.getHash().get(Algo.MD5)));
        System.out.println("SHA1 " + "2f6692a100b3a19bbf4e12e6b2ca6b1bd7ecbcaa".equals(fh.getHash().get(Algo.SHA1)));
        System.out.println("SHA256 " + "9c96933df56d070b89238784f50000946c3aabcb7ba05e98fa5b5dc439f0ece7".equals(fh.getHash().get(Algo.SHA256)));
        System.out.println("SHA512 " + "5a05424db61f4b802fd7c5e708b17974ebdae7d1981e4ef1ec9eebd1c933efa61ecdb4802c283b006c085142aca583ba2344c2fbfc0fc0b36163ec09cd8a2d07".equals(fh.getHash().get(Algo.SHA512)));
        */
    }
}
