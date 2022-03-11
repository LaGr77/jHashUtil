package app.LaGr77.jHashUtil.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Hashtable;

import org.apache.logging.log4j.LogManager;

/**
 * File hash
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.0.2022-02-02
 * @since 2022-02-02
 */
public class FileHash {
    /**
    * Constructor
    * @param algo {@link Algo}[]
    * @param fis {@link FileInputStream}
    * @throws NoSuchAlgorithmException
    */
    public FileHash (Algo[] algo, FileInputStream fis) throws NoSuchAlgorithmException {
        setFis(fis);
        for (Algo a : algo) {
            getMd().put(a, MessageDigest.getInstance(a.getAlgo()));
        }
    }

    /****************************************************************************************************
     *                                                                                            Methods
     ****************************************************************************************************/
    /**
     * 
     * @throws IOException
     */
    public void compute() throws IOException {
        byte[] byteArray = new byte[1024];
        int bytesCount = 0;

        while ((bytesCount = fis.read(byteArray)) != -1) {
            for (Algo a : getMd().keySet()) {
                md.get(a).update(byteArray, 0, bytesCount);
            }
            //getMd().update(byteArray, 0, bytesCount);
        };

        for (Algo a : getMd().keySet()) {
            byte[] bytes = getMd().get(a).digest();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            getHash().put(a, sb.toString());
        }
        //setHash(sb.toString());
        //System.out.println(sb.toString());
    }


    /****************************************************************************************************
     *                                                                                          Get & Set
     ****************************************************************************************************/
    /**
     * Get FileInputStream
     * @return {@link FileInputStream}
     */
    public FileInputStream getFis() {
        return fis;
    }

    /**
     * Set FileInputStream
     * @param file {@link FileInputStream}
     */
    public void setFis(FileInputStream fis) {
        this.fis = fis;
    }

    public Hashtable<Algo, String> getHash() {
        return hash;
    }

    private Hashtable<Algo, MessageDigest> getMd() {
        return md;
    }

    /****************************************************************************************************
     *                                                                                          Variables
     ****************************************************************************************************/
    private FileInputStream fis;
    private Hashtable<Algo, String> hash= new Hashtable<>();
    private Hashtable<Algo, MessageDigest> md = new Hashtable<>();
    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(FileHash.class);
}
